package lotr;

import java.util.Random;

public class King extends Character {
    private Random rand = new Random();

    public King() {
        this.power = rand.nextInt(11) + 5;
        this.hp = rand.nextInt(11) + 5;
    }

    @Override
    public void kick(Character c) {
        int damage = rand.nextInt(power) + 1;
        System.out.println("King attacks with damage: " + damage);
        c.setHp(c.getHp() - damage);
    }
}
