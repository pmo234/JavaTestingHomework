import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100,150);
    }

    @Test
    public void enoughPaperToPrint() {
        assertEquals(20, printer.print(4, 20));
    }
    @Test
    public void notEnoughPaperToPrint() {
        assertEquals(100, printer.print(6, 20));
    }
    @Test
    public void canReduceToner() {
        printer.print(4,20);
        assertEquals(70, printer.reduceToner(4,20));
    }
}
