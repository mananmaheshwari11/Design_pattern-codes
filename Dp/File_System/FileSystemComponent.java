package File_System;

public interface FileSystemComponent {
    void operation();
    void add(FileSystemComponent c);
    void remove(FileSystemComponent c);
    void getChild(int i);
}
