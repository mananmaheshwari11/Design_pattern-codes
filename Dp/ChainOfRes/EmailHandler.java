public abstract class EmailHandler {
    EmailHandler e;
    void setSuccessor(EmailHandler e){
        this.e=e;
    }
    abstract void HandleEmail(EmailRequest e);
}
