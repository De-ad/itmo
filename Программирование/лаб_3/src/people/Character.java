package people;

import java.util.Objects;

public abstract class Character {
    protected String name;
    public Character(){
    }

    public Character(String name) {
        this.name = name;
        System.out.println(name + "появился в истории");
    }

    public String getName() {
        return name;
    }

    public String differ() {
        return name + "не различает ";
    }

    public void say(String message) {
        System.out.println(name + "сказал: " + message);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true};
        if (o == null || getClass() != o.getClass()){ return false};
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }
}

