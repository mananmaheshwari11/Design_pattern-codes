package MenuSystem;

public class Main {
    public static void main(String[] args) {
        Items idli=new Items();
        Submenu southIndian=new Submenu();
        Items dosa=new Items();
        southIndian.addItem(dosa);
        southIndian.addItem(idli);
        southIndian.getItem(0);
        southIndian.removeItem(dosa);
        idli.order();
        idli.addItem(dosa);
        idli.getItem(0);
    }
}
