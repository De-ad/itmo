import people.*;
import people.Character;

//Полицейский комиссар сказал, что все это увертки, так как отличить полицейского от бандита не так уж трудно.
//В ответ на это стрелявший из пистолета сказал, что теперешнего полицейского не отличишь от бандита,
//так как полицейские часто действуют заодно с бандитами, бандиты же переодеваются в полицейскую форму, чтоб удобнее
//было грабить. В результате честному коротышке уже совершенно безразлично, кто перед ним: бандит или полицейский.
//О чем еще говорил полицейский комиссар Пшигль с задержанными, газеты умалчивали. Печаталось лишь, что похищенная из
//банка сумма очень велика и достигает трех с половиной миллионов фертингов. Сообщалось также, что в результате
//столкновения с бандитами семеро полицейских получили различные повреждения, один же из полицейских, по имени Шмыгль,
//порвал собственные штаны и потерял в суматохе каску.
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
