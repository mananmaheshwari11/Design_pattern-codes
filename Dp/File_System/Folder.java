package File_System;

import java.util.ArrayList;

public class Folder implements FileSystemComponent {
    ArrayList<FileSystemComponent>arr=new ArrayList<>();
    @Override
    public void operation() {
       System.out.println("Folder Operation Started");
    }

    @Override
    public void add(FileSystemComponent c) {
       arr.add(c);
    }

    @Override
    public void remove(FileSystemComponent c) {
        arr.remove(c);
    }

    @Override
    public void getChild(int i) {
       arr.get(i);
    }
    
}
