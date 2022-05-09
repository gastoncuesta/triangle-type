import model.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTypeApplication {

    @Test
    void testIsEquilateral() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertTrue(triangle.isEquilateral());
        assertEquals("EQUILATERAL", triangle.getType().name());
    }

    @Test
    void testIsIsosceles() {
        Triangle triangle = new Triangle(5, 2, 5);
        assertTrue(triangle.isIsosceles());
        assertEquals("ISOSCELES", triangle.getType().name());
    }

    @Test
    void testIsScalene() {
        Triangle triangle = new Triangle(4, 2, 5);
        assertTrue(triangle.isScalene());
        assertEquals("SCALENE", triangle.getType().name());
    }

    @Test
    void testIsNotATriangle() {
        Triangle triangle1 = new Triangle(3, 2, 5);
        Triangle triangle2 = new Triangle(-4, 2, 5);

        assertTrue(triangle1.isNotATriangle());
        assertTrue(triangle2.isNotATriangle());

        assertEquals("INVALID", triangle1.getType().name());
        assertEquals("INVALID", triangle2.getType().name());
    }
}
