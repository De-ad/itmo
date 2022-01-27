package people;

import util.State;

public class Policeman extends Being implements Alive {
    private String line;
    Pants pants;
    Helmet helmet;

    public Policeman(String name, State state){
        super(name, state);
    }
    public Policeman(String name, State state, State stateForPants) {
        super(name, state);
        pants = new Pants();
        helmet = new Helmet();
    }

    public void say(String line) {
        System.out.println(name + "сказал" + line);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setStateForPants(){
        pants.stateForPants = State.TORN;
    }
    public void setStateForHelmet(){
        helmet.stateForHelmet = State.LOSE;
    }

    public void loseHelmet(){
        if (helmet.getState() == State.LOSE)
            System.out.println(name + "'s " + helmet.getName() + " получил статус " + helmet.getState());
        else{
            System.out.println(name + " к счастью ничего не потерял");
        }
    }

    public void ripPants(){
        if (pants.getState() == State.TORN)
            System.out.println(name + "'s " + pants.getName() + "получил статус " + pants.getState());
        else{
            System.out.println(name + " на удивлению ничего не порвал...");
        }
    }
    class Pants{
        private State stateForPants = State.STAYSTILL;
        private String name = "Штаны ";
        public State getState() {
            return stateForPants;
        }
        public String getName() {
            return name;
        }
    }

    class Helmet{
        private String name = "Шлеп";
        private State stateForHelmet = State.STAYSTILL;
        public State getState() {
            return stateForHelmet;
        }

        public String getName() {
            return name;
        }
    }
}
