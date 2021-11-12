package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Golbat extends Zubat {
    public Golbat (String name, int lvl){
        super(name, lvl);
        setStats(75, 80, 70, 65, 75, 90);
        addMove(new FocusEnergy());
    }
}
