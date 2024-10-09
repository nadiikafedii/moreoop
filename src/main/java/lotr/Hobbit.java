package lotr;

public class Hobbit extends Character {
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }

    @Override
    public void kick(Character c) {
        toCry();
        c.setHp(0);
    }

    private void toCry() {
        System.out.println("Hobbit cries!");
    }
}
