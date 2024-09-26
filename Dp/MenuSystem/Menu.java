package MenuSystem;


public interface Menu {
    void order();
    void addItem(Menu m);
    void removeItem(Menu m);
    void getItem(int i);
}
