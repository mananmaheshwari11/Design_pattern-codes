public class FanHandler extends EmailHandler {

    @Override
    void HandleEmail(EmailRequest e) {
        if(e.type.equalsIgnoreCase("FanMail")){
        System.out.println("Fan Mail Handled Successfully");
    }
    else{
        // super.setSuccessor(new RequestHandler());
        super.e.HandleEmail(e);
    }
}
    
}
