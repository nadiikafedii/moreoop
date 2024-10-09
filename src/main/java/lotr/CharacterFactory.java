package lotr;

import java.util.Random;

public class CharacterFactory {
    private final Random random = new Random();

    public Character createCharacter() {
        int characterType = random.nextInt(4);

        switch (characterType) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new Knight();
            case 3:
                return new King();
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}
