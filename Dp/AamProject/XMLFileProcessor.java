package AamProject;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLFileProcessor implements FileProcessor {
    ArrayList<String>arrayList=new ArrayList<>();
    @Override
    public ArrayList<String> processFile(String filename){
        try {
            System.out.println("Processing XML File: "+filename);
            java.io.File file=new java.io.File(filename);

            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc= builder.parse(file);
            NodeList node=doc.getElementsByTagName("p");
            for(int i=0;i<node.getLength();i++){
                String content=node.item(i).getTextContent();
                processXML(content);
            }
            return arrayList;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void processXML(String content){
        System.out.println(content);
        arrayList.add(content);
    }
}
