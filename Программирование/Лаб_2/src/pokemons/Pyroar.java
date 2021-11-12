package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Pyroar extends Pokemon {
    public Pyroar (String name, int lvl){
        super(name, lvl);
        setStats(86, 68, 72, 109, 66, 106);
        setType(Type.NORMAL, Type.FIRE);
        setMove(new EnergyBall(), new Facade(), new LeafStorm(), new MegaDrain());
    }
}