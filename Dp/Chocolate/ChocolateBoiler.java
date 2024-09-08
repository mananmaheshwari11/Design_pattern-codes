package Chocolate;

public class ChocolateBoiler {
    public boolean empty;
    public boolean boiled;
    //private static ChocolateBoiler cb = new ChocolateBoiler();
    private static ChocolateBoiler cb;

    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    }

    public boolean isEmpty(){
        return this.empty;
    }
    public boolean isBoiled(){
        return this.boiled;
    }
    public void fill(){
        this.empty = false;
        this.boiled=false;
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            this.boiled=false;
            this.empty=true;
        }
    }
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            this.boiled = true;
            this.empty = false;
        }
    }
    public static synchronized ChocolateBoiler getBoiler(){
        //return cb;
        if(cb==null){
            cb = new ChocolateBoiler();
        }
        return cb;
    }
}
