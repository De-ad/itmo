package people;

import util.State;

public class Bandit extends Being {

    public Bandit(String name, State state) {
        super(name, state);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public State getState(){
        return state;
    }


    public String say(String line) {
        return line;
    }

}
