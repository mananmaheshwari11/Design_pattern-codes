public class RequestHandler extends EmailHandler {

    @Override
    void HandleEmail(EmailRequest e) {
        if(e.type.equalsIgnoreCase("RequestMail")){
            System.out.println("Business Request Handled Successfully");
        }
        else{
            // super.setSuccessor(new ComplaintHandler());
            super.e.HandleEmail(e);
        }
    }
    
}
