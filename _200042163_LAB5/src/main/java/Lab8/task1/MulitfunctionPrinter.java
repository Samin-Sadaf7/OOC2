package Lab8.task1;

public class MulitfunctionPrinter implements IPrinter,IScanner, IFax{
    @Override
    public String Print(Document D){
        return "Multifunction prints "+D.text;
    }
    @Override
    public String Fax(Document D){
        return "Multifunction Fax "+D.text;
    }
    @Override
    public Document Scan(){
        Document D= new Document();
        D.text="This document has scanned";
        return D;
    }
}
