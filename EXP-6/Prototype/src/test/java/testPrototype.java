import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testPrototype {

    @Test
    void testCirclePrototype() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Circle anotherCircle = (Circle) circle.clone();

        assertEquals(circle, anotherCircle);
        assertEquals(circle.x, anotherCircle.x);
        assertEquals(circle.y, anotherCircle.y);
        assertNotSame(circle, anotherCircle);
    }

    @Test
    void testRectanglePrototype() {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();

        assertEquals(rectangle, anotherRectangle);
        assertEquals(rectangle.color, anotherRectangle.color);
        assertNotSame(rectangle, anotherRectangle);

    }

}
