package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Minun extends Pokemon {
    public Minun(String name, int lvl) {
        super(name, lvl);
        setStats(60, 40, 50, 75, 85, 95);
        setType(Type.ELECTRIC);
        setMove(new HammerArm(), new WoodHammer(), new DoubleTeam(), new Rest());
    }
}
