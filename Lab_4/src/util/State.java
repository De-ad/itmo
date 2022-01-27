package util;

public enum State {
    DAMAGED("Получил ранение"),
    ACTIVE("активен"),
    TORN("порвался"),
    WIN("победил"),
    LOST("потерялся"),
    SENT("отправлен"),
    RECIEVED("получен"),
    STAYSTILL(null);
    private final String state;
    State(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
