/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANewBlockCommand extends PCommand
{
    private TNewBlock _newBlock_;
    private TSemicolon _semicolon_;

    public ANewBlockCommand()
    {
        // Constructor
    }

    public ANewBlockCommand(
        @SuppressWarnings("hiding") TNewBlock _newBlock_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setNewBlock(_newBlock_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ANewBlockCommand(
            cloneNode(this._newBlock_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewBlockCommand(this);
    }

    public TNewBlock getNewBlock()
    {
        return this._newBlock_;
    }

    public void setNewBlock(TNewBlock node)
    {
        if(this._newBlock_ != null)
        {
            this._newBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._newBlock_ = node;
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
            + toString(this._newBlock_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._newBlock_ == child)
        {
            this._newBlock_ = null;
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
        if(this._newBlock_ == oldChild)
        {
            setNewBlock((TNewBlock) newChild);
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
