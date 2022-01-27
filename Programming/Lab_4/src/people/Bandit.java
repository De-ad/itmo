package people;

import util.Sayable;
import util.State;

public class Bandit extends Being implements Sayable {
    private String line;
    private boolean said = false;

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

    @Override
    public void say(String line) {
        if (said == false){
            System.out.println(name + "сказал " + line);
            said = true;
        }
        else{
            System.out.println(line);
        }
    }
    public void saySay(Sayable sayable, String line) {
        sayable.say(line);
    }
}
