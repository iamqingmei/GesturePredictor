/* ExpressionTranslator.java */
/* Generated By:JavaCC: Do not edit this line. ExpressionTranslator.java */
package org.jpmml.sklearn;

import java.util.List;

import org.dmg.pmml.Apply;
import org.dmg.pmml.Constant;
import org.dmg.pmml.DataType;
import org.dmg.pmml.Expression;
import org.dmg.pmml.FieldRef;
import org.jpmml.converter.Feature;

public class ExpressionTranslator implements ExpressionTranslatorConstants {

        private List<Feature> features = null;


        public List<Feature> getFeatures(){
                return this.features;
        }

        private void setFeatures(List<Feature> features){
                this.features = features;
        }

        static
        public Expression translate(String string, List<Feature> features){
                Expression expression;

                try {
                        ExpressionTranslator expressionTranslator = new ExpressionTranslator(string);
                        expressionTranslator.setFeatures(features);

                        expression = expressionTranslator.translateExpressionInternal();
                } catch(ParseException pe){
                        throw new IllegalArgumentException(string, pe);
                }

                return expression;
        }

        static
        private Apply createApply(String function, Expression... expressions){
                Apply apply = new Apply(function);

                for(Expression expression : expressions){
                        apply.addExpressions(expression);
                }

                return apply;
        }

        static
        private String translateValue(Token value){
                String image = value.image;

                switch(value.kind){
                        case INT:
                                if(image.endsWith("l") || image.endsWith("L")){
                                        image = image.substring(0, image.length() - 1);
                                }
                                break;
                        default:
                                break;
                }

                return image;
        }

  final private Expression translateExpressionInternal() throws ParseException {Expression expression;
    expression = Expression();
    jj_consume_token(0);
return expression;
  }

  final public Expression Expression() throws ParseException {Expression expression;
    expression = AdditiveExpression();
return expression;
  }

  final public Expression AdditiveExpression() throws ParseException {Expression left;
        Token operator;
        Expression right;
    left = MultiplicativeExpression();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        operator = jj_consume_token(PLUS);
        break;
        }
      case MINUS:{
        operator = jj_consume_token(MINUS);
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      right = MultiplicativeExpression();
left = createApply(operator.image, left, right);
    }
return left;
  }

  final public Expression MultiplicativeExpression() throws ParseException {Expression left;
        Token operator;
        Expression right;
    left = UnaryExpression();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:{
        operator = jj_consume_token(MULTIPLY);
        break;
        }
      case DIVIDE:{
        operator = jj_consume_token(DIVIDE);
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      right = UnaryExpression();
left = createApply(operator.image, left, right);
    }
return left;
  }

  final public Expression UnaryExpression() throws ParseException {Token sign = null;
        Expression expression;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PLUS:
    case MINUS:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        sign = jj_consume_token(PLUS);
        break;
        }
      case MINUS:{
        sign = jj_consume_token(MINUS);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    expression = PrimaryExpression();
if(sign != null && sign.kind == MINUS){

                        if(expression instanceof Constant){
                                Constant constant = (Constant)expression;

                                constant.setValue("-" + constant.getValue());
                        } else

                        {
                                Constant constant = new Constant()
                                        .setValue("-1");

                                expression = createApply("*", constant, expression);
                        }
                }

                return expression;
  }

  final public Expression PrimaryExpression() throws ParseException {Expression expression;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LPAREN:{
      expression = ParenthesizedExpression();
      break;
      }
    case NAME:{
      expression = FeatureInvocationExpression();
      break;
      }
    case INT:
    case FLOAT:{
      expression = LiteralExpression();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
return expression;
  }

  final public Expression ParenthesizedExpression() throws ParseException {Expression expression;
    jj_consume_token(LPAREN);
    expression = Expression();
    jj_consume_token(RPAREN);
return expression;
  }

  final public FieldRef FeatureInvocationExpression() throws ParseException {Token variable;
        Token column;
    variable = jj_consume_token(NAME);
    jj_consume_token(LBRACKET);
    jj_consume_token(COLON);
    jj_consume_token(COMMA);
    column = jj_consume_token(INT);
    jj_consume_token(RBRACKET);
List<Feature> features = getFeatures();

                if(!("X").equals(variable.image)){
                        {if (true) throw new IllegalArgumentException(variable.image);}
                }

                int index = Integer.parseInt(column.image);
                if(index < 0 || index >= features.size()){
                        {if (true) throw new IllegalArgumentException(token.image);}
                }

                Feature feature = features.get(index);

                return feature.ref();
  }

  final public Constant LiteralExpression() throws ParseException {Token value;
        DataType dataType;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INT:{
      value = jj_consume_token(INT);
dataType = DataType.INTEGER;
      break;
      }
    case FLOAT:{
      value = jj_consume_token(FLOAT);
dataType = DataType.DOUBLE;
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
Constant constant = new Constant()
                        .setValue(translateValue(value))
                        .setDataType(dataType);

                return constant;
  }

  /** Generated Token Manager. */
  public ExpressionTranslatorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x600,0x600,0x18,0x18,0x600,0x600,0xe020,0x6000,};
   }

  /** Constructor. */
  public ExpressionTranslator(Provider stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ExpressionTranslatorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ExpressionTranslator(String dsl) throws ParseException, TokenMgrException {
      this(new StringProvider(dsl));
  }

  public void ReInit(String s) {
     ReInit(new StringProvider(s));
  }
  /** Reinitialise. */
  public void ReInit(Provider stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new ExpressionTranslatorTokenManager(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ExpressionTranslator(ExpressionTranslatorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ExpressionTranslatorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[20];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 8; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 20; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage, token_source == null ? null : ExpressionTranslatorTokenManager.lexStateNames[token_source.curLexState]);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}