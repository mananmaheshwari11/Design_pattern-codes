package AamProject;

public class DataParseHandler extends ChainHandler {
    private FileProcessor processor;
    public DataParseHandler(FileProcessor processor){
        this.processor=processor;
    }
    @Override
    void handleRequest(String filename){
        try {
            System.out.println("Parsing Data...");
            arrayList=processor.processFile(filename);
            // yaha sb thik h all okkk 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
