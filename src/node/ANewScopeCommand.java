/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANewScopeCommand extends PCommand
{
    private TNewScope _newScope_;
    private TIdent _ident_;
    private TSemicolon _semicolon_;

    public ANewScopeCommand()
    {
        // Constructor
    }

    public ANewScopeCommand(
        @SuppressWarnings("hiding") TNewScope _newScope_,
        @SuppressWarnings("hiding") TIdent _ident_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setNewScope(_newScope_);

        setIdent(_ident_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ANewScopeCommand(
            cloneNode(this._newScope_),
            cloneNode(this._ident_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewScopeCommand(this);
    }

    public TNewScope getNewScope()
    {
        return this._newScope_;
    }

    public void setNewScope(TNewScope node)
    {
        if(this._newScope_ != null)
        {
            this._newScope_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._newScope_ = node;
    }

    public TIdent getIdent()
    {
        return this._ident_;
    }

    public void setIdent(TIdent node)
    {
        if(this._ident_ != null)
        {
            this._ident_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ident_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._newScope_)
            + toString(this._ident_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._newScope_ == child)
        {
            this._newScope_ = null;
            return;
        }

        if(this._ident_ == child)
        {
            this._ident_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._newScope_ == oldChild)
        {
            setNewScope((TNewScope) newChild);
            return;
        }

        if(this._ident_ == oldChild)
        {
            setIdent((TIdent) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
