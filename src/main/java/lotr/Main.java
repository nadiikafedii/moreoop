package lotr;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();

        System.out.println("Character 1: " + character1.getClass().getSimpleName() + " with hp: " + character1.getHp());
        System.out.println("Character 2: " + character2.getClass().getSimpleName() + " with hp: " + character2.getHp());

        GameManager gameManager = new GameManager();
        gameManager.fight(character1, character2);
    }
}
