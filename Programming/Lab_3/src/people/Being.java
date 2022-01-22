package people;

import util.State;
import java.util.Objects;

public abstract class Being {
    protected String name;
    protected State state;

    public Being(String name, State state) {
        this.name = name;
        this.state = state;
        if (this.state == State.ACTIVE){
        System.out.println(name + "появился в истории");
        }
    }
    public Being(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }
    public State getState(){
        return state;
    }
//
//    public String differ() {
//        return name + "не различает ";
//    }
//
//    public void say(String message) {
//        System.out.println(name + "сказал: " + message);
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){return true;}
        if (o == null || getClass() != o.getClass()){return false;}
        Being character = (Being) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }

}

