package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.beans.Transient;
import java.util.ArrayList;

public class circleTest {
    @Test
    public void emptyConstructorTest(){
        Circle c1 =  new Circle();
        Point p1 = new Point(0,0);
        assertTrue((c1.radius == 1 && c1.center.equals(p1)));
    }

    @Test
    public void twoParameterConstructorTest() {
        Point p1 = new Point(10,1);
        Circle c1 = new Circle(p1, 5);
        assertTrue(c1.radius == 5 && c1.center.equals(p1));
    }

    @Test
    public void threeParameterConstructorTest() {
        Point p1 = new Point(1,2);
        Circle c1 = new Circle(1,2,5);
        assertTrue(c1.radius == 5 && c1.center.equals(p1));
    }

    @Test
    public void areaTest() {
        Circle c1 = new Circle(1,2,5);
        assertEquals(c1.area(), Math.PI * 25);
    }

    @Test
    public void hashCodeTest() {
        Point p1 = new Point(1,2);
        Circle c1 = new Circle(p1, 5);
        assertEquals(p1.hashCode(), c1.hashCode());
    }

    @Test 
    public void sameObjectEqualsTest() {
        Circle c1 = new Circle(3,4,5);
        asserEquals(c1.equals(c1), true);
    }

    @Test
    public void nullEqualsTest() {
        Circle c1 = new Circle(3,4,5);
        assertEquals(c1.equals(null), false);
    }

    @Test
    public void diffClassEqualsTest() {
        Circle c1 = new Circle(3,4,5);
        int i = 0;
        assertEquals(c1.equals(i), false);
    }

    @Test
    public void diffRadiusEqualsTest() {
        Circle c1 = new Circle(1,2,3);
        Circle c2 = new Circle(1,2,5);
        assertEquals(c1.equals(c2), false);
    }

    @Test
    public void finalEqualsTest() {
        Circle c1 = new Circle(1,2,3);
        Circle c2 = new Circle(1,2,3);
        assertEquals(c1.equals(c2), true);
    }
} 
