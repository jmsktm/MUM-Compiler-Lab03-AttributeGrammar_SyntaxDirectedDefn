/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALookup2Command extends PCommand
{
    private TLookup2 _lookup2_;
    private TIdent _id1_;
    private TDot _dot_;
    private TIdent _id2_;
    private TSemicolon _semicolon_;

    public ALookup2Command()
    {
        // Constructor
    }

    public ALookup2Command(
        @SuppressWarnings("hiding") TLookup2 _lookup2_,
        @SuppressWarnings("hiding") TIdent _id1_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TIdent _id2_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setLookup2(_lookup2_);

        setId1(_id1_);

        setDot(_dot_);

        setId2(_id2_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ALookup2Command(
            cloneNode(this._lookup2_),
            cloneNode(this._id1_),
            cloneNode(this._dot_),
            cloneNode(this._id2_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALookup2Command(this);
    }

    public TLookup2 getLookup2()
    {
        return this._lookup2_;
    }

    public void setLookup2(TLookup2 node)
    {
        if(this._lookup2_ != null)
        {
            this._lookup2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lookup2_ = node;
    }

    public TIdent getId1()
    {
        return this._id1_;
    }

    public void setId1(TIdent node)
    {
        if(this._id1_ != null)
        {
            this._id1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id1_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TIdent getId2()
    {
        return this._id2_;
    }

    public void setId2(TIdent node)
    {
        if(this._id2_ != null)
        {
            this._id2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id2_ = node;
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
            + toString(this._lookup2_)
            + toString(this._id1_)
            + toString(this._dot_)
            + toString(this._id2_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lookup2_ == child)
        {
            this._lookup2_ = null;
            return;
        }

        if(this._id1_ == child)
        {
            this._id1_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._id2_ == child)
        {
            this._id2_ = null;
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
        if(this._lookup2_ == oldChild)
        {
            setLookup2((TLookup2) newChild);
            return;
        }

        if(this._id1_ == oldChild)
        {
            setId1((TIdent) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._id2_ == oldChild)
        {
            setId2((TIdent) newChild);
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
