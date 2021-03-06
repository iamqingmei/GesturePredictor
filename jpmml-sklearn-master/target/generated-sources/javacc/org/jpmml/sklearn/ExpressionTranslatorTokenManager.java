/* ExpressionTranslatorTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ExpressionTranslatorTokenManager.java */
package org.jpmml.sklearn;
import java.util.List;
import org.dmg.pmml.Apply;
import org.dmg.pmml.Constant;
import org.dmg.pmml.DataType;
import org.dmg.pmml.Expression;
import org.dmg.pmml.FieldRef;
import org.jpmml.converter.Feature;

/** Token Manager. */
@SuppressWarnings("unused")public class ExpressionTranslatorTokenManager implements ExpressionTranslatorConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         return jjStopAtPos(0, 2);
      case 32:
         return jjStopAtPos(0, 1);
      case 40:
         return jjStopAtPos(0, 5);
      case 41:
         return jjStopAtPos(0, 6);
      case 42:
         return jjStopAtPos(0, 3);
      case 43:
         return jjStopAtPos(0, 9);
      case 44:
         return jjStopAtPos(0, 11);
      case 45:
         return jjStopAtPos(0, 10);
      case 47:
         return jjStopAtPos(0, 4);
      case 58:
         return jjStopAtPos(0, 12);
      case 91:
         return jjStopAtPos(0, 7);
      case 93:
         return jjStopAtPos(0, 8);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 22;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  else if (curChar == 46)
                     { jjCheckNAdd(5); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     { jjCheckNAddTwoStates(2, 3); }
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  break;
               case 1:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  { jjCheckNAddTwoStates(2, 3); }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  { jjCheckNAddTwoStates(2, 3); }
                  break;
               case 4:
                  if (curChar == 46)
                     { jjCheckNAdd(5); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(5, 6); }
                  break;
               case 7:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(8); }
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(8); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(12, 13); }
                  break;
               case 13:
                  if (curChar != 46)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 16:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(17); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(17); }
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(18, 19); }
                  break;
               case 20:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(21); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(21); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 10:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  { jjCheckNAdd(10); }
                  break;
               case 3:
                  if ((0x100000001000L & l) != 0L && kind > 13)
                     kind = 13;
                  break;
               case 6:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(4, 5); }
                  break;
               case 15:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(6, 7); }
                  break;
               case 19:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(8, 9); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 22 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   12, 13, 18, 19, 7, 8, 16, 17, 20, 21, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, "\52", "\57", "\50", "\51", "\133", "\135", "\53", "\55", 
"\54", "\72", null, null, null, null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrException(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrException.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ExpressionTranslatorTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new RuntimeException("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public ExpressionTranslatorTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
	
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 22; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit( SimpleCharStream stream, int lexState)
  {
  
    ReInit( stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrException("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrException.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfff9L, 
};
static final long[] jjtoSkip = {
   0x6L, 
};
static final long[] jjtoSpecial = {
   0x6L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[22];
    private final int[] jjstateSet = new int[2 * 22];

    
    protected int curChar;
}
