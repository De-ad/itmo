//Полицейский комиссар сказал, что все это увертки, так как отличить полицейского от бандита не так уж трудно.
//В ответ на это стрелявший из пистолета сказал, что теперешнего полицейского не отличишь от бандита,
//так как полицейские часто действуют заодно с бандитами, бандиты же переодеваются в полицейскую форму, чтоб удобнее
//было грабить. В результате честному коротышке уже совершенно безразлично, кто перед ним: бандит или полицейский.
//О чем еще говорил полицейский комиссар Пшигль с задержанными, газеты умалчивали. Печаталось лишь, что похищенная из
//банка сумма очень велика и достигает трех с половиной миллионов фертингов. Сообщалось также, что в результате
//столкновения с бандитами семеро полицейских получили различные повреждения, один же из полицейских, по имени Шмыгль,
//порвал собственные штаны и потерял в суматохе каску.
//

import people.*;
import util.BagSize;
import util.State;
import util.Story;

public class Main {

    public static void main(String[] args) {
        Story.start();
        Policeman Pshigl = new Policeman("Пшигль ", State.ACTIVE);
        Bandit bandit = new Bandit("Cтрелявший из пистолета ", State.ACTIVE);
        Shorty HonestShorty = new Shorty("Честный коротышка ", State.ACTIVE);
        DialogBetweenTwo dialog = new DialogBetweenTwo(Pshigl.getName(),bandit.getName());
//        d.talk(p1.differ(), b1.differ());
        Bag bag = new Bag("похищенная из банка сумма", "три миллиона фертингов", BagSize.BIG);
        Policeman Shpigl = new Policeman("Шпигль ", State.ACTIVE);
        Police police = new Police("семеро");
        Bandits bandits = new Bandits();
        Newspaper newspapers = new Newspaper();
        FightBanditsAgainstPolice fight = new FightBanditsAgainstPolice(police.getName(), bandits.getName());

//        b1.say(p.criminalAction());
//        b1.say(b.criminalAction());
//        b1.say(s.differBetween(p.getName(),b.getName()));
        newspapers.staySilentAbout();
        newspapers.getMessage(bag.getName() + bag.getSize() + bag.getValue());
        if (police.getState() == State.WIN){
            newspapers.getMessage(fight.fightEvent() + police.win());

        }
        else
        {
            newspapers.getMessage(fight.fightEvent() + police.lose());

        }

//        n.getMessage(p2.getName() + p2.ripPants() + " и " + p2.loseHelmet());
        Story.end();


    }
}
