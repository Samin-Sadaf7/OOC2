package Lab9;

public class ChooseExporterType {
    public IExport chooseExporter(ExporterType type){
        IExport export;
        if(type.equals(ExporterType.CSV)){
            export=new ExportToCSV();
        }
        else{
            export=new ExportToXML();
        }
        return  export;
    }
}
