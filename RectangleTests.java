package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.beans.Transient;
import java.util.ArrayList;

class RectangleTests {

    @Test
    void Test1(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p, 4, 4);

        assertEquals(R.perimeter(), 16);
    }

    @Test
    void Test2(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p,3,3);

        assertEquals(R.area(), 9);
    }

    @Test
    void Test3(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p,3,4);
        assertFalse(R.isSquare());
    }

    @Test
    void Test4(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p,2,2);
        assertTrue(R.isSquare());
    }

    @Test
    void Test5(){
        Point p = new Point(0,0);
        Rectangle R1 = new Rectangle(p,2,3);
        Rectangle R2 = new Rectangle(p,2,4);
        assertFalse(R1.equals(R2));
    }

    @Test
    void Test6(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        Rectangle R1 = new Rectangle(p1,4,4);
        Rectangle R2 = new Rectangle(p2, 4,4);
        assertFalse(R1.equals(R2));
    }

    @Test
    void Test7(){
        Point p = new Point(5,5);
        Rectangle R1 = new Rectangle(p,3,3);
        Rectangle R2 = new Rectangle(p,3,2);
        assertFalse(R1.equals(R2));
    }

    @Test 
    void Test8(){
        Point p = new Point(3,3);
        Rectangle R = new Rectangle(p,2,2);
        assertTrue(R.equals(R));

    }

    @Test
    void Test9(){
        Point p = new Point(0,0);
        Rectangle R = new Rectangle(p,1,1);
        assertFalse(R.equals(null));
    }
    
    @Test
    void Test10() {
    	Point p = new Point(0,0);
    	Rectangle R1 = new Rectangle(p,1,1);
    	Rectangle R2 = new Rectangle(p,1,1);
    	assertTrue(R1.equals(R2));
    }
    
    @Test
    void Test11() {
    	Point p = new Point(1,3);
    	Rectangle R1 = new Rectangle(p,4,5);
    	assertEquals(R1.hashCode(), 13);
    } 
}