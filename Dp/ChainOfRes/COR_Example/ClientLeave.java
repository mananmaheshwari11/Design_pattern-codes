package COR_Example;

public class ClientLeave {
    public static void main(String[] args) {
        LeaveRequest l1=new LeaveRequest(31);
        LeaveRequest l2=new LeaveRequest(14);
        LeaveRequest l3=new LeaveRequest(4);
        LeaveHandler emp1=new ReportingDirector();
        LeaveHandler emp2=new ReportingExecutive();
        LeaveHandler emp3=new ReportingManager();
        //successor set
        emp3.setSuccessor(emp2);
        emp2.setSuccessor(emp1);

        emp3.HandleLeave(l1);
        emp3.HandleLeave(l2);
        emp3.HandleLeave(l3);
    }
}
