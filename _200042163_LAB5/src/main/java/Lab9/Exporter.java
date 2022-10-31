package Lab9;

public class Exporter {
        IExport type;
        public String export(ExporterType exportType, StudentEnrollment studentEnrollment){
            ChooseExporterType chooseExporterType= new ChooseExporterType();
            type=chooseExporterType.chooseExporter(exportType);
            String result=type.export(studentEnrollment);
            return result;
        }
}
