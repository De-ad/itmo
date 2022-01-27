package util;

public enum pressAction{
    SAY("говорят "),
    PRINT("печатают "),
    INFORM("сообщают "),
    WRITE("пишут ");

    private final String name;

    pressAction (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
