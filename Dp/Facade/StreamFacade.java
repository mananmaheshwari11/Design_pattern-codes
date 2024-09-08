package Facade;

/**
 * StreamFacade
 */
public class StreamFacade {
    UserAccount user;
    PaymentProcess pay;
    Streamservice serve;
    MovieSelection movie;
    public StreamFacade(UserAccount user,PaymentProcess pay,Streamservice serve,MovieSelection movie){
        this.movie=movie;
        this.pay=pay;
        this.user=user;
        this.serve=serve;
    }
    void movieSelect(String name, String movies,double amt){
        user.checkSubscription(name);
        pay.processPayment(name, amt);
        movie.selectMovie(movies);
        serve.prepareStream(movies);
        serve.startStream();
    }
    
} 