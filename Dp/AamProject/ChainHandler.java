package AamProject;

import java.util.ArrayList;

public abstract class ChainHandler {
    ChainHandler handler;
    static ArrayList <String>arrayList;
    public void setnextHandler(ChainHandler handler){
        this.handler=handler;
    }
    abstract void handleRequest(String filename); 
}
