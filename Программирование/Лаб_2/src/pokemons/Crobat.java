package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Crobat extends Golbat {
    public Crobat(String name, int lvl){
        super(name, lvl);
        setStats(85, 90, 80, 70, 80, 130);
        addMove(new Swagger());
    }
}
