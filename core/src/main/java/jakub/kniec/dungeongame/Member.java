package jakub.kniec.dungeongame;

import java.util.List;
import java.util.Random;

public class Member {
    private String name;
    private int hp;
    private int damage;
    private int defense;
    private int lvl = 1;

    public Member() {
        name = generateName();
        Random random = new Random();
        hp = random.nextInt(50,151); //100  min50 max 150
        damage = random.nextInt(5,16); //10 min5 max 15
        defense = random.nextInt(5,16); //10 min5 max 15
    }

    public int getPrice(){

        //15 -> 50
        //30 -> 100
        // x -> y
        int points = 0;
        points += damage - 5;
        points += defense -5;
        points += hp/10 - 5;

        return  50 + (points * 50) / 30;

        // 50   75  100
    }

    public List<String> getInfo() {
        return List.of(
            name,
            "HP: "+hp,
            "Damage: "+damage,
            "Defense: "+defense,
            "LVL: "+lvl,
            "Price: "+getPrice()
        );
    }

    public String generateName() {
        Random random = new Random();
        List<String> names = CharacterNames.names;
        return names.get(random.nextInt(1,11));
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getLvl() {
        return lvl;
    }

    @Override
    public String toString() {
        return "CrewMember{" + name + ", "+
            "hp=" + hp +
            ", damage=" + damage +
            ", defense=" + defense +
            ", lvl=" + lvl +
            '}';
    }
}
