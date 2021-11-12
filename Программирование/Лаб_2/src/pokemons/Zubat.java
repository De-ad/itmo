package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Zubat extends Pokemon {
    public Zubat (String name, int lvl){
        super(name, lvl);
        setStats(40, 45, 35, 30, 40, 55);
        setType(Type.FLYING,Type.POISON);
        setMove(new Rest(), new Swagger());
    }
}
