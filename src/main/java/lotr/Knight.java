package lotr;

import java.util.Random;

public class Knight extends Character {
    private Random rand = new Random();

    public Knight() {
        this.power = rand.nextInt(11) + 2;
        this.hp = rand.nextInt(11) + 2;
    }

    @Override
    public void kick(Character c) {
        int damage = rand.nextInt(power) + 1;
        System.out.println("Knight attacks with damage: " + damage);
        c.setHp(c.getHp() - damage);
    }
}

