package util;

public enum State {
    DAMAGED("Получил ранение"),
    ACTIVE("активен"),
    TORN("порвался"),
    WIN("победил"),
    LOSE("потерялся"),
    STAYSTILL(null);
    private final String state;
    State(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
