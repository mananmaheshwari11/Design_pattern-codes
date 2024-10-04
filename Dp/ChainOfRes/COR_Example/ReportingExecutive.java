package COR_Example;

public class ReportingExecutive extends LeaveHandler{

    @Override
    public void HandleLeave(LeaveRequest l) {
       if(l.no_of_days>5 && l.no_of_days<15){
        System.out.println("Leave Request of "+l.no_of_days+"days recieved to executive");
       }
       else{
        super.l.HandleLeave(l);
       }
    }
    
}
