package COR_Example;

public abstract class LeaveHandler {
    LeaveHandler l;
    abstract void HandleLeave(LeaveRequest l);
    public void setSuccessor(LeaveHandler l){
        this.l=l;
    }
}
