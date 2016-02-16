/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAGoal(AGoal node);
    void caseAProgram(AProgram node);
    void caseAClassCommand(AClassCommand node);
    void caseAProcDeclCommand(AProcDeclCommand node);
    void caseAVariableCommand(AVariableCommand node);
    void caseALookup1Command(ALookup1Command node);
    void caseALookup2Command(ALookup2Command node);
    void caseANewScopeCommand(ANewScopeCommand node);
    void caseAEndScopeCommand(AEndScopeCommand node);
    void caseAMethodScopeCommand(AMethodScopeCommand node);
    void caseANewBlockCommand(ANewBlockCommand node);
    void caseAPrintSymtabCommand(APrintSymtabCommand node);
    void caseAMethodHdr(AMethodHdr node);
    void caseAIntType(AIntType node);
    void caseABooleanType(ABooleanType node);
    void caseACharType(ACharType node);
    void caseAStringType(AStringType node);
    void caseAVoidType(AVoidType node);
    void caseAFloatType(AFloatType node);
    void caseAFormalList(AFormalList node);
    void caseAMultipleFormalList(AMultipleFormalList node);
    void caseAFormal(AFormal node);
    void caseAArrayFormal(AArrayFormal node);

    void caseTWhiteSpace(TWhiteSpace node);
    void caseTSingleLineStart(TSingleLineStart node);
    void caseTSlCommentEnd(TSlCommentEnd node);
    void caseTSemicolon(TSemicolon node);
    void caseTComma(TComma node);
    void caseTLParen(TLParen node);
    void caseTRParen(TRParen node);
    void caseTLBrack(TLBrack node);
    void caseTRBrack(TRBrack node);
    void caseTLCurly(TLCurly node);
    void caseTRCurly(TRCurly node);
    void caseTDot(TDot node);
    void caseTNewScope(TNewScope node);
    void caseTEndScope(TEndScope node);
    void caseTLookup1(TLookup1 node);
    void caseTLookup2(TLookup2 node);
    void caseTBoolean(TBoolean node);
    void caseTChar(TChar node);
    void caseTFloat(TFloat node);
    void caseTInt(TInt node);
    void caseTVoid(TVoid node);
    void caseTString(TString node);
    void caseTKclass(TKclass node);
    void caseTMethod(TMethod node);
    void caseTVariable(TVariable node);
    void caseTNewBlock(TNewBlock node);
    void caseTEnclosingMethod(TEnclosingMethod node);
    void caseTPrintSymtab(TPrintSymtab node);
    void caseTIdent(TIdent node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
