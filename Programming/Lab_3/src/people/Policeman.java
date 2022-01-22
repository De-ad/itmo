package people;

import util.State;

public class Policeman extends Being {
    private String difference = "легко отличить полицейского от бандита";
    public Policeman(String name, State stateForAlive){
        super(name, stateForAlive);
    }

    @Override
    public String getName() {
        return name;
    }


    public String differ(){
        return difference;
    }

    public String loseHelmet(){
        Helmet helmet = new Helmet();
        if (helmet.getState() == State.TORN)
            return "потерял каску";
        else{
            return "к счастью ничего не потерял";
        }
    }

    public String ripPants(){
        Pants pants = new Pants();
        if (pants.getState() == State.TORN)
            return "порвал собственные штаны";
        else{
            return "к удивлению ничего не порвал...";
        }
    }
    class Pants{
        State state = State.STAYSTILL;
        public void setState(State state){
            this.state = state;
           }
        public State getState() {
            return state;
        }
    }

    class Helmet{
        State state = State.STAYSTILL;
        public void setState(State state){
            this.state = state;
        }
        public State getState() {
            return state;
        }
    }
}
