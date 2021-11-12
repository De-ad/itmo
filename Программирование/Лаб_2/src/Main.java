import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Litleo("Floppa",12));
        b.addAlly(new Crobat("Kaneki Ken",10));
        b.addAlly(new Minun("Dead inside", 12));
        b.addFoe(new Zubat("Ghoul",10));
        b.addFoe(new Golbat("Dante", 12));
        b.addFoe(new Pyroar("Vergil",10));
        b.go();
    }
}
