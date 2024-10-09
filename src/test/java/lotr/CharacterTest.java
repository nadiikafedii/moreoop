package lotr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @Test
    public void testHobbitKick() {
        Hobbit hobbit = new Hobbit();
        Character enemy = new Elf();

        hobbit.kick(enemy);

        assertEquals(0, enemy.getHp(), "Hobbit should defeat the enemy by crying.");
    }

    @Test
    public void testElfKickAgainstHobbit() {
        Elf elf = new Elf();
        Character hobbit = new Hobbit();

        elf.kick(hobbit);

        assertEquals(0, hobbit.getHp(), "Elf should defeat Hobbit immediately.");
    }

    @Test
    public void testElfKickAgainstKnight() {
        Elf elf = new Elf();
        Knight knight = new Knight();

        int initialHp = knight.getHp();
        elf.kick(knight);
        assertEquals(initialHp - 1, knight.getHp(), "Elf should reduce Knight's HP by 1.");
    }

    @Test
    public void testKingKick() {
        King king = new King();
        Character knight = new Knight();

        int initialHp = knight.getHp();
        king.kick(knight);

        assertTrue(knight.getHp() < initialHp && knight.getHp() >= 0, "King should deal random damage to Knight.");
    }

    @Test
    public void testKnightKick() {
        Knight knight = new Knight();
        King king = new King();

        int initialHp = king.getHp();
        knight.kick(king);

        assertTrue(king.getHp() < initialHp && king.getHp() >= 0, "Knight should deal random damage to King.");
    }

    @Test
    public void testCharacterIsAlive() {
        Character knight = new Knight();
        knight.setHp(0);

        assertFalse(knight.isAlive(), "Character should be dead when HP is 0.");
    }

    @Test
    public void testCharacterFactoryCreatesCharacter() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter();

        assertNotNull(character, "Factory should create a character.");
    }

    @Test
    public void testSetHpDoesNotGoBelowZero() {
        Character hobbit = new Hobbit();
        hobbit.setHp(-5);

        assertEquals(0, hobbit.getHp(), "HP should not go below 0.");
    }
}
