package AamProject;
    import java.io.BufferedWriter;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.ArrayList;
    
    public class ReportGeneration {
        private static ReportGeneration instance;
    
        private ReportGeneration() {}
    
        public static synchronized ReportGeneration getInstance() {
            if (instance == null) {
                instance = new ReportGeneration();
            }
            return instance;
        }
    
        public String generateReport(ArrayList<String> data) {
            String cur_dir=System.getProperty("user.dir");
            String reportname="report.txt";
            File reportFile = new File(cur_dir, reportname);
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(reportFile))) {
                for (String word : data) {
                    writer.write(word + " "); 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return reportFile.getAbsolutePath();
        }
    }
    
    

