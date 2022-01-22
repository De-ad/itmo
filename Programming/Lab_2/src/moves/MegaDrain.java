package moves;
import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain(){
        super(Type.GRASS, 40,100);
    }

    @Override
    protected String describe(){
        return "атакует мегаподпиткой и восстанавливает здоровье в размере 50% от нанесенного урона";
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, + (int) Math.round(damage)/2);
    }
}
