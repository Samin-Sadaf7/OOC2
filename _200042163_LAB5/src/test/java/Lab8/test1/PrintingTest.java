package Lab8.test1;
import Lab8.task1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PrintingTest {
    @Test
    public void BasicPrintTest(){
        BasicPrinter bp= new BasicPrinter();
        Document D= new Document();
        D.text="ABCD";
        assertEquals("Basic Printer prints ABCD",bp.Print(D));
    }
    @Test
    public void MultiprinterPrintTest(){
        MulitfunctionPrinter mp= new MulitfunctionPrinter();
        Document D= new Document();
        D.text="ABCD";
        assertEquals("Multifunction prints ABCD",mp.Print(D));
    }
    @Test
    public void MultiprinterScanTest(){
        MulitfunctionPrinter mp= new MulitfunctionPrinter();
        Document D= D=mp.Scan();
        assertEquals("This document has scanned",D.text);
    }
    @Test
    public void MultiprinterFaxTest(){
        MulitfunctionPrinter mp= new MulitfunctionPrinter();
        Document D= new Document();
        D.text="XYZ";
        assertEquals("Multifunction Fax XYZ",mp.Fax(D));
    }
}
