package AamProject;

public class Main {
    public static void main(String[] args) {
        String filepath="C:\\Users\\LENOVO\\OneDrive\\Backups\\Dp\\Design_pattern-codes\\Dp\\AamProject\\sample.csv";
        // the adapter we are going to use for the file conversion in parser
        String extension=FileUtils.getFileExtension(filepath);
        FileProcessor fp=FileUtils.createProcessor(extension);
        // setting up the chain of responsibility
        ChainHandler c1=new FileValidatorHandler();
        c1.setnextHandler(new DataParseHandler(fp));// we adapt the processor into the parser 
        c1.handleRequest(filepath);
        // for singleton pattern humme single instance hi milna chaiye otherwise
         //bufferreader new create hoga 
        String path=ReportGeneration.getInstance().generateReport(ChainHandler.arrayList);
        System.out.println("your text file has been created"+path);
    }
}
