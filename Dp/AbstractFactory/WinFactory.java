package AbstractFactory;

public class WinFactory extends GUIFactory {
    public Buttons makeButton(){
        Buttons b=new WinButtons();
        return b;
    }
    public Checkbox makeCheckbox(){
        Checkbox c=new WinCheckbox();
        return c;
    }
}
