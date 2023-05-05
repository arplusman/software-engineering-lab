import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testComputeArea() {
        Rectangle rectangle = new Rectangle(3, 7);
        double area = rectangle.computeArea();
        assertEquals(21.0, area);
    }

    @Test
    void testGetAndSet() {
        Rectangle rectangle = new Rectangle(5, 8);
        assertEquals(40.0, rectangle.computeArea());

        rectangle.setHeight(4.1);
        assertEquals(20.5, rectangle.computeArea());

        rectangle.setWidth(10.0);
        assertEquals(41.0, rectangle.computeArea());

        assertEquals(4.1, rectangle.getHeight());

        assertEquals(10.0, rectangle.getWidth());

    }

}
