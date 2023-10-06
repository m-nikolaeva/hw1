import org.junit.jupiter.api.Test;
import ru.gb.Door;
import ru.gb.Game;
import ru.gb.Player;

import static org.junit.jupiter.api.Assertions.*;

public class MontyHallTest extends AbstractMontyHallTest{

    @Test
    void notRiskyWinTest(){
        //given
        Player gamer = new Player("Не рисковый", false);
        Game  game = new Game(gamer, doors);
        //when
        Door door = game.round(2);
        //then
        assertTrue(door.isPrize());
    }

    @Test
    void riskyWinTest(){
        //given
        Player gamer = new Player("Рисковый", true);
        Game  game = new Game(gamer, doors);
        //when
        Door door = game.round(1);
        //then
        assertTrue(door.isPrize());
    }

    @Test
    void notRiskyLoseTest(){
        //given
        Player gamer = new Player("Не рисковый", false);
        Game  game = new Game(gamer, doors);
        //when
        Door door = game.round(0);
        //then
        assertFalse(door.isPrize());
    }

    @Test
    void riskyLoseTest(){
        //given
        Player gamer = new Player("Рисковый", true);
        Game  game = new Game(gamer, doors);
        //when
        Door door = game.round(2);
        //then
        assertFalse(door.isPrize());
    }

    @Test
    void indexOutOfBoundsTest(){
        assertThrows(IndexOutOfBoundsException.class, () -> doors.get(3));
    }
}
