public class ComplaintHandler extends EmailHandler {

    @Override
    void HandleEmail(EmailRequest e) {
        if(e.type.equalsIgnoreCase("ComplaintMail")){
            System.out.println("Complaint Mail Handled Successfully");
        }
        else{
            throw new UnsupportedOperationException(e.type+"Email doesn't handled");
        }
    }
    
}
