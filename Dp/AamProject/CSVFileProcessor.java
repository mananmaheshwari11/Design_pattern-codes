package AamProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVFileProcessor implements FileProcessor {
    ArrayList<String>arrayList=new ArrayList<>();
    @Override 
    public ArrayList<String> processFile(String filename){
        System.out.println("Processing CSV file"+filename);
        try {
            java.io.File file=new File(filename);
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Processing CSV data....");
            while((line=br.readLine())!=null){
                String[]data=line.split(",");
                processCSV(data);
            }
            br.close();
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void processCSV(String[] data){
         for (String value : data) {
            arrayList.add(value);
    }
}
}
