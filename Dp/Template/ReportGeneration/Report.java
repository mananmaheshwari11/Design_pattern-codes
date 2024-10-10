package Template.ReportGeneration;

abstract public class Report {
    final void prepareReport(){
        fetchData();
        processData();
        formatData();
    }
    void fetchData(){
        System.out.println("Fetching the data from reports");
    }
    void processData(){
        System.out.println("Processing the data fetch from reports");
    }
    abstract void formatData();
}
