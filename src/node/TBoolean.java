/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TBoolean extends Token
{
    public TBoolean()
    {
        super.setText("bool");
    }

    public TBoolean(int line, int pos)
    {
        super.setText("bool");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBoolean(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBoolean(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBoolean text.");
    }
}
