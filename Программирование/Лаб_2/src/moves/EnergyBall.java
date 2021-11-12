package moves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS, 90, 100);
        isLowering = false;
    }

    private boolean isLowering;

    @Override
    protected void applyOppEffects(Pokemon def){
        if (Math.random()<=0.1){
            isLowering = true;
            def.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
        //Energy Ball deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
    }
    @Override
    protected String describe(){
        if (isLowering){
            return "атакует энергошаром и понижает специальную защиту врага на 1";
        }
        else
            return "атакует энергошаром";
    }
}
