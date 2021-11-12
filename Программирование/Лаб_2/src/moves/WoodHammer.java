package moves;

import ru.ifmo.se.pokemon.*;

public class WoodHammer extends PhysicalMove{

    public WoodHammer(){
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected String describe(){
        return "атакует древомолотом и теряет здоровье в размере трети от нанесённого урона";
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, - (int) Math.round(damage/3));
    }
}
