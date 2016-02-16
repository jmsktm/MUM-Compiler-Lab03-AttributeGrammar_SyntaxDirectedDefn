/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPGoal().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAGoal(AGoal node)
    {
        defaultIn(node);
    }

    public void outAGoal(AGoal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGoal(AGoal node)
    {
        inAGoal(node);
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAGoal(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAClassCommand(AClassCommand node)
    {
        defaultIn(node);
    }

    public void outAClassCommand(AClassCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAClassCommand(AClassCommand node)
    {
        inAClassCommand(node);
        if(node.getKclass() != null)
        {
            node.getKclass().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAClassCommand(node);
    }

    public void inAProcDeclCommand(AProcDeclCommand node)
    {
        defaultIn(node);
    }

    public void outAProcDeclCommand(AProcDeclCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcDeclCommand(AProcDeclCommand node)
    {
        inAProcDeclCommand(node);
        if(node.getMethod() != null)
        {
            node.getMethod().apply(this);
        }
        if(node.getMethodHdr() != null)
        {
            node.getMethodHdr().apply(this);
        }
        if(node.getFormalList() != null)
        {
            node.getFormalList().apply(this);
        }
        if(node.getRParen() != null)
        {
            node.getRParen().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAProcDeclCommand(node);
    }

    public void inAVariableCommand(AVariableCommand node)
    {
        defaultIn(node);
    }

    public void outAVariableCommand(AVariableCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableCommand(AVariableCommand node)
    {
        inAVariableCommand(node);
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAVariableCommand(node);
    }

    public void inALookup1Command(ALookup1Command node)
    {
        defaultIn(node);
    }

    public void outALookup1Command(ALookup1Command node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALookup1Command(ALookup1Command node)
    {
        inALookup1Command(node);
        if(node.getLookup1() != null)
        {
            node.getLookup1().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outALookup1Command(node);
    }

    public void inALookup2Command(ALookup2Command node)
    {
        defaultIn(node);
    }

    public void outALookup2Command(ALookup2Command node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALookup2Command(ALookup2Command node)
    {
        inALookup2Command(node);
        if(node.getLookup2() != null)
        {
            node.getLookup2().apply(this);
        }
        if(node.getId1() != null)
        {
            node.getId1().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getId2() != null)
        {
            node.getId2().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outALookup2Command(node);
    }

    public void inANewScopeCommand(ANewScopeCommand node)
    {
        defaultIn(node);
    }

    public void outANewScopeCommand(ANewScopeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewScopeCommand(ANewScopeCommand node)
    {
        inANewScopeCommand(node);
        if(node.getNewScope() != null)
        {
            node.getNewScope().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outANewScopeCommand(node);
    }

    public void inAEndScopeCommand(AEndScopeCommand node)
    {
        defaultIn(node);
    }

    public void outAEndScopeCommand(AEndScopeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndScopeCommand(AEndScopeCommand node)
    {
        inAEndScopeCommand(node);
        if(node.getEndScope() != null)
        {
            node.getEndScope().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAEndScopeCommand(node);
    }

    public void inAMethodScopeCommand(AMethodScopeCommand node)
    {
        defaultIn(node);
    }

    public void outAMethodScopeCommand(AMethodScopeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMethodScopeCommand(AMethodScopeCommand node)
    {
        inAMethodScopeCommand(node);
        if(node.getEnclosingMethod() != null)
        {
            node.getEnclosingMethod().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAMethodScopeCommand(node);
    }

    public void inANewBlockCommand(ANewBlockCommand node)
    {
        defaultIn(node);
    }

    public void outANewBlockCommand(ANewBlockCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewBlockCommand(ANewBlockCommand node)
    {
        inANewBlockCommand(node);
        if(node.getNewBlock() != null)
        {
            node.getNewBlock().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outANewBlockCommand(node);
    }

    public void inAPrintSymtabCommand(APrintSymtabCommand node)
    {
        defaultIn(node);
    }

    public void outAPrintSymtabCommand(APrintSymtabCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintSymtabCommand(APrintSymtabCommand node)
    {
        inAPrintSymtabCommand(node);
        if(node.getPrintSymtab() != null)
        {
            node.getPrintSymtab().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAPrintSymtabCommand(node);
    }

    public void inAMethodHdr(AMethodHdr node)
    {
        defaultIn(node);
    }

    public void outAMethodHdr(AMethodHdr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMethodHdr(AMethodHdr node)
    {
        inAMethodHdr(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getLParen() != null)
        {
            node.getLParen().apply(this);
        }
        outAMethodHdr(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inABooleanType(ABooleanType node)
    {
        defaultIn(node);
    }

    public void outABooleanType(ABooleanType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanType(ABooleanType node)
    {
        inABooleanType(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanType(node);
    }

    public void inACharType(ACharType node)
    {
        defaultIn(node);
    }

    public void outACharType(ACharType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharType(ACharType node)
    {
        inACharType(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outACharType(node);
    }

    public void inAStringType(AStringType node)
    {
        defaultIn(node);
    }

    public void outAStringType(AStringType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        inAStringType(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringType(node);
    }

    public void inAVoidType(AVoidType node)
    {
        defaultIn(node);
    }

    public void outAVoidType(AVoidType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVoidType(AVoidType node)
    {
        inAVoidType(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outAVoidType(node);
    }

    public void inAFloatType(AFloatType node)
    {
        defaultIn(node);
    }

    public void outAFloatType(AFloatType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatType(AFloatType node)
    {
        inAFloatType(node);
        if(node.getFloat() != null)
        {
            node.getFloat().apply(this);
        }
        outAFloatType(node);
    }

    public void inAFormalList(AFormalList node)
    {
        defaultIn(node);
    }

    public void outAFormalList(AFormalList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFormalList(AFormalList node)
    {
        inAFormalList(node);
        if(node.getFormal() != null)
        {
            node.getFormal().apply(this);
        }
        outAFormalList(node);
    }

    public void inAMultipleFormalList(AMultipleFormalList node)
    {
        defaultIn(node);
    }

    public void outAMultipleFormalList(AMultipleFormalList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleFormalList(AMultipleFormalList node)
    {
        inAMultipleFormalList(node);
        if(node.getFormalList() != null)
        {
            node.getFormalList().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getFormal() != null)
        {
            node.getFormal().apply(this);
        }
        outAMultipleFormalList(node);
    }

    public void inAFormal(AFormal node)
    {
        defaultIn(node);
    }

    public void outAFormal(AFormal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFormal(AFormal node)
    {
        inAFormal(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        outAFormal(node);
    }

    public void inAArrayFormal(AArrayFormal node)
    {
        defaultIn(node);
    }

    public void outAArrayFormal(AArrayFormal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayFormal(AArrayFormal node)
    {
        inAArrayFormal(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getLBrack() != null)
        {
            node.getLBrack().apply(this);
        }
        if(node.getRBrack() != null)
        {
            node.getRBrack().apply(this);
        }
        outAArrayFormal(node);
    }
}
