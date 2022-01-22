package people;

import util.CriminalGroupOfShorties;

public class Bandits implements CriminalGroupOfShorties {
    private String name = "бандиты ";

    public Bandits() {
    }

    public Bandits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String criminalAction() {
        return name + "переодеваются в полицейскую форму, чтобы удобнее было грабить ";
    }
}
