public class AdvanceRemote implements Remote {
    Device d;
    public AdvanceRemote(Device d){
        this.d=d;
    }
    @Override
    public void togglePower() {
        if(d.isEnabled()){
            d.enabled();
        }
        else{
            d.disable();
        }
    }
    @Override
    public void volumeDown() {
        d.setVolume(d.getVolume()-1);
    }

    @Override
    public void volumeUp() {
       d.setVolume(d.getVolume()+1);
    }

    @Override
    public void channelDown() {
        d.setChannel(d.getChannel()-1);
    }

    @Override
    public void channelUp() {
        d.setChannel(d.getChannel()+1);
    }
    
}
