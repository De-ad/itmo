package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Litleo extends Pokemon{
    public Litleo(String name, int lvl){
        super(name, lvl);
        setStats(62, 50, 58, 73, 54, 72 );
        setType(Type.NORMAL, Type.FIRE);
        setMove(new EnergyBall(), new Facade(), new LeafStorm());
    }
}
