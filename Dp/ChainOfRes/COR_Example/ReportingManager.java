package COR_Example;

public class ReportingManager extends LeaveHandler {

    @Override
        public void HandleLeave(LeaveRequest l){
            if(l.no_of_days<5){
                System.out.println("Leave Request of "+l.no_of_days+"days recieved ");
            }
            else{
                super.l.HandleLeave(l);
            }
        }
    }
