package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe(){
        return "щеголяет, вызывает у врага растерянность и повышает его атаку на 2";
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.ATTACK, 2);
        Effect.confuse(def);
    }
}
