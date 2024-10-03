public class SpamHandler extends EmailHandler {

    @Override
    void HandleEmail(EmailRequest e) {
        if(e.type.equalsIgnoreCase("SpamMail")){
        System.out.println("Spam Mail Handled Successfully");
    }
    else{
        System.out.println("Email passed out from Spam ");
        // super.setSuccessor(new FanHandler());
        super.e.HandleEmail(e);
    }
}
    
}
