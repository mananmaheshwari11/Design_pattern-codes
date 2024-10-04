package COR_Example;

public class ReportingDirector extends LeaveHandler{
    @Override
    public void HandleLeave(LeaveRequest l) {
       if(l.no_of_days>15 && l.no_of_days<30){
        System.out.println("Leave Request of "+l.no_of_days+"days recieved to director");
       }
       else{
        System.out.println("Leave Rejected Successfully");
       }
    }
}
