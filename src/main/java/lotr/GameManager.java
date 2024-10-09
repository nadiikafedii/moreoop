package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight begins between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c2.getClass().getSimpleName() + " hp: " + c2.getHp());

            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is defeated!");
                break;
            }

            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName() + " hp: " + c1.getHp());

            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is defeated!");
            }
        }

        System.out.println("Fight has ended.");
    }
}

