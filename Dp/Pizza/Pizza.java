class Pizza{
    String name;
    //Sring extraMessage;t
    public Pizza(){

    }
    public Pizza(String name){
        this.name=name;
    }
    public void prepare(){
        System.out.println("Preparing....");
    }
    public void bake(){
        System.out.println("Baking....");
    }
    public void cut(){
        System.out.println("Cutting....");
    }
    public void box(){
        System.out.println("Boxing....");
    }

    public void orderPizza(Pizza pizza){
        System.out.println("Your order is being placed....");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Your Pizza is ready! Have a nice day!");
    }
}