package people;

import util.State;

public class Shorty extends Being implements Alive{
    public Shorty(String name, State state){
        super(name, state);
    }

    public void differBetween(String GroupOne, String GroupTwo){
        System.out.println(name + "безразличен к тому, кто перед ним: " + GroupOne + "или " + GroupTwo);
    }

    @Override
    public void say(String line) {
        System.out.println(name + "сказал" + line);

    }
}
