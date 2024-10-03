public class ClientEmail {
    public static void main(String[] args) {
        EmailRequest e=new EmailRequest("Spammail", "Hello");
        EmailHandler fHandler=new FanHandler();
        EmailHandler coEmailHandler=new ComplaintHandler();
        EmailHandler rHandler=new RequestHandler();
        EmailHandler spamHandler=new SpamHandler();
        //set the successor
        spamHandler.setSuccessor(fHandler);
        fHandler.setSuccessor(rHandler);
        rHandler.setSuccessor(coEmailHandler);
        //executing the method
        spamHandler.HandleEmail(e);
    }
}
