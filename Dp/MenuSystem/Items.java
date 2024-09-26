package MenuSystem;

public class Items implements Menu {

    @Override
    public void order() {
        System.out.println("The items is getting ordered ");
    }

    @Override
    public void addItem(Menu m) {
        throw new UnsupportedOperationException("Unimplemented method 'addItem'");
    }

    @Override
    public void removeItem(Menu m) {
        throw new UnsupportedOperationException("Unimplemented method 'removeItem'");
    }

    @Override
    public void getItem(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'getItem'");
    }
    
}
