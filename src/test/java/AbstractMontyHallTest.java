import org.junit.jupiter.api.BeforeEach;
import ru.gb.Door;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMontyHallTest {
    static List<Door> doors;

    @BeforeEach
    public void initializationDoors(){
        doors = new ArrayList<>();
        doors.add(new Door(false));
        doors.add(new Door(false));
        doors.add(new Door(true));
    }

}
