package Lab8.task1;

public class BasicPrinter implements  IPrinter{
    @Override
    public String Print(Document D){
        return "Basic Printer prints "+D.text;
    }
}
