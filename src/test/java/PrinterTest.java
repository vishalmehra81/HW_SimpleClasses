import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest{

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }
    @Test
    public void has125PagesRemainingAfter5copiesPrintedHaving5CopiesEach(){
        printer.print(5,5);
        assertEquals(125, printer.getPagesRemaining());
    }
    @Test
    public void willNotPrintIfPrintRequestExceedsAvailablePaper(){
        printer.print(20,6);
        printer.print(30,2);
        assertEquals(30,printer.getPagesRemaining());
        assertEquals("Paper Out",printer.getErrorMessage());
    }
    @Test
    public void tonerVolumeDecresesProportionallyToPaperUsed(){
        printer.print(30,4);
        assertEquals(380,printer.getToner());
    }
}