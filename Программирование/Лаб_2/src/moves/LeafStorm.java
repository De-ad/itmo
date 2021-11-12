package moves;

import ru.ifmo.se.pokemon.*;
public class LeafStorm extends SpecialMove{
    public LeafStorm(){
        super(Type.GRASS, 130, 90);
    }

    @Override
    protected String describe(){
        return "Атакует листопадом и понижает свою специальную атаку на 2";
    }
    @Override
    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.SPECIAL_ATTACK, -2);
    }
}
