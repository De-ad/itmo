package people;

import util.State;

public class Shorty extends Being {
    public Shorty(String name, State state){
        super(name, state);
    }

    public String differBetween(String GroupOne, String GroupTwo){
        return name + "безразличен к тому, кто перед ним: " + GroupOne + "или " + GroupTwo;
    }
}
