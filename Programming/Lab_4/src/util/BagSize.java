package util;

public enum BagSize {
    TREMENDOUS("очень велика"),
    BIG("велика" ),
    MEDIUM("средняя"),
    SMALL("невелика");

    private final String value;

    BagSize(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
