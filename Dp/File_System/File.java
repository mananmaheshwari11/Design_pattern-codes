package File_System;

public class File implements FileSystemComponent{
    public void operation(){
        System.out.println("File Operation getting started");
    }
    public void add(FileSystemComponent c){
        throw new UnsupportedOperationException("File does not hold child");
    }
    public void remove(FileSystemComponent c){
        throw new UnsupportedOperationException("Removing... File does not hold child");
    }
    public void getChild(int i){
        throw new UnsupportedOperationException("Getting child, File does not hold child");
    }
}
