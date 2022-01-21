import people.*;
import people.Character;

public class Main {

    public static void main(String[] args) {

        Bandit b1 = new Bandit("Cтрелявший из пистолета ");
        Shorty s = new Shorty("Честный коротышка ");
        Policeman p1 = new Policeman("Пшигль ");
        Policeman p2 = new Policeman("Шпигль ");
        Police p = new Police("семеро");
        Bandits b = new Bandits();
        Dialog d = new Dialog();
        Bag bag = new Bag("похищенная из банка сумма", "три миллиона фертингов");
        Newspaper n = new Newspaper();
        FightEventResult f = new FightEventResult();

        d.talk(p1.getName(), b1.getName(), p1.differ(), b1.differ());
        b1.say(p.criminalAction());
        b1.say(b.criminalAction());
        b1.say(s.differBetween(p.getName(),b.getName()));
        n.staySilentAbout(" о других деталях диалога");
        n.getMessage(bag.getName() + bag.getSize());
        n.getMessage(bag.getName() + bag.getValue());
        n.getMessage(f.fightEvent(b.getName(),p.getName()) + p.gotHurtAfterFight());
        n.getMessage(p2.getName() + p2.ripPants() + " и " + p2.loseHelmet());
    }
}
