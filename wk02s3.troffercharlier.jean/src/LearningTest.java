import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningTest {

    Learning learn;

    @BeforeEach
    void setUp() {
        learn = new Learning();
    }

    @Test
    void countValuePass(){
        learn.setCount(42);
        assertEquals(42,learn.getCount());
    }


    @Test
    void getFriends() {
    }

    @Test
    void getName() {
    }

    @Test
    void setCount() {
    }

    @Test
    void setFriends() {
    }

    @Test
    void setName() {
    }
}