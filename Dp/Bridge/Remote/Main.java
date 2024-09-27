public class Main {
    public static void main(String[] args) {
        Device d=new Tv();
        AdvanceRemote a=new AdvanceRemote(d);
        a.togglePower();
        a.volumeUp();
        a.volumeDown();
        a.channelUp();
        a.channelUp();
        a.channelDown();
        System.out.println(d.getVolume());
        System.out.println(d.getChannel());
    }
}
