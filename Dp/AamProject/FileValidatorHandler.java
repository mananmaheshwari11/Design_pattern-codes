package AamProject;

import java.io.File;

public class FileValidatorHandler extends ChainHandler{

    @Override
    void handleRequest(String filename) {
        try {
            java.io.File f=new File(filename);
            if (f.exists() && f.isFile()){
                System.out.println("File Validated: "+f.getName());
                super.handler.handleRequest(filename);
            }
            else{
                System.out.println("Invalid File");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
