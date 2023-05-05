import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void testComputeArea() {
        Square square = new Square(4.5);
        assertEquals(20.25, square.computeArea());
    }

    @Test
    void testGetAndSet() {
        Square square = new Square(3.0);

        square.setSide(6.0);

        assertEquals(36.0, square.computeArea());

        assertEquals(6.0, square.getSide());
    }
}
