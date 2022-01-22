package moves;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){
        super(Type.NORMAL, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon att){
        //no ability to implement
    }

    @Override
    protected String describe(){
        return "фокусирует энергию";
    }
}


