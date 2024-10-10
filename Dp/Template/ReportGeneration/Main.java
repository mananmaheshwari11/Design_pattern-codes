package Template.ReportGeneration;

public class Main {
    public static void main(String[] args) {
        Report p1;
        p1=new Pdf();
        p1.prepareReport();
        p1=new Html();
        p1.prepareReport();
    }
}
