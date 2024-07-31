import junit.framework.TestCase;
import org.junit.Test;

public class CalcTestes extends TestCase {

    @Test
    public void testSum() {
        Calc calc = new Calc();
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    public void testSub1() {
        Calc calc = new Calc();
        assertEquals(1, calc.add(4, 3));
    }

    @Test
    public void testSub2() {
        Calc calc = new Calc();
        assertEquals(-1, calc.add(3, 4));
    }
}