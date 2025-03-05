package jakub.kniec.dungeongame;

import java.util.Random;

public class CrewMember {
    private int hp;
    private int damage;
    private int defense;
    private int lvl = 1;

    public CrewMember() {
        Random random = new Random();
        this.hp = random.nextInt(50,151); //100  min50 max 150
        this.damage = random.nextInt(5,16); //10 min5 max 15
        this.defense = random.nextInt(5,16); //10 min5 max 15
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

    public static void main(String[] args) {
        CrewMember crewMember = new CrewMember();
        System.out.println(crewMember);
        System.out.println(crewMember.getPrice());
    }

    @Override
    public String toString() {
        return "CrewMember{" +
            "hp=" + hp +
            ", damage=" + damage +
            ", defense=" + defense +
            ", lvl=" + lvl +
            '}';
    }
}
