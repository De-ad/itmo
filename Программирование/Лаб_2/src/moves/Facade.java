package moves;


import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {

    private boolean isCritical;

    public Facade() {
        super(Type.NORMAL, 70, 100);
        isCritical = false;
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        Status cond = def.getCondition();
        if (cond.equals(Status.BURN) || cond.equals(Status.POISON) || cond.equals(Status.PARALYZE)) {
            isCritical = true;
            return 2.0;
        } else
            return 1.0;
    }

    @Override
    protected String describe() {
        if (isCritical) {
            return "наносит двойной урон";
        } else
            return "наносит урон";
    }
}
