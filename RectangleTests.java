import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTesting {

    @Test
    void testPerimeter(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p, 10, 10);

        assertEquals(R.perimeter(), 16);
    }

    @Test
    void testArea(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p, 10, 10);

        assertEquals(R.area(), 100);
    }

    @Test
    void testIsSquare(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p, 10, 10);

        assertFalse(R.isSquare());
    } 
}
