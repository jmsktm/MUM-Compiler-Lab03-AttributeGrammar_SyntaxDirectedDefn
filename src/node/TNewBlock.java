/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TNewBlock extends Token
{
    public TNewBlock()
    {
        super.setText("new_block");
    }

    public TNewBlock(int line, int pos)
    {
        super.setText("new_block");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNewBlock(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNewBlock(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNewBlock text.");
    }
}