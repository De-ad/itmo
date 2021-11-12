package moves;

import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
    public HammerArm(){
        super(Type.FIGHTING, 100, 90);
    }

    @Override
    protected String describe(){
        return ("бьет рукой-молотом и понижает свою скорость на 1");
    }

    @Override
    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.SPEED, -1);
    }
}
