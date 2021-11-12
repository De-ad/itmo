package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "повышает уклонение на 1";
    }

    @Override
    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.EVASION, 1);
    }
}
