package lotr;

public class Elf extends Character {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }

    @Override
    public void kick(Character c) {
        if (c instanceof Hobbit) {
            System.out.println("Elf kills Hobbit!");
            c.setHp(0);
        } else {
            System.out.println("Elf attacks!");
            c.setHp(c.getHp() - 1);
        }
    }
}

