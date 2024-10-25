package AamProject;

public class FileUtils {

    public static String getFileExtension(String filePath) {
        int dotIndex = filePath.lastIndexOf(".");
        
        if (dotIndex > 0 && dotIndex < filePath.length() - 1) {
            return filePath.substring(dotIndex + 1); 
        }
        return ""; 
    }
    public static FileProcessor createProcessor(String fileType) {
        switch (fileType) {
            case "csv":
                return new CSVFileProcessor(); 
            case "xml":
                return new XMLFileProcessor(); 
            default:
                throw new IllegalArgumentException("Unsupported file type: " + fileType);
        }
    }
}

