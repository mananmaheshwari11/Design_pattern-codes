public class Tv implements Device {
    boolean isEnabled=false;
    int vol=0;
    int channel=0;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enabled() {
        this.isEnabled=true;
    }

    @Override
    public void disable() {
        this.isEnabled=false;
    }

    @Override
    public int getVolume() {
            return this.vol;        
    }

    @Override
    public void setVolume(int p) {
            this.vol=p;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int p) {
        this.channel=p;
    }
}
