package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe(){
        return "полностью восстанавливает здоровье и отдыхает 2 хода";
    }

    @Override
    protected void applySelfEffects(Pokemon att){
        att.restore();
        Effect eff = new Effect().turns(2).condition(Status.SLEEP);
        att.addEffect(eff);
        att.setMod(Stat.HP,6);
    }
}
