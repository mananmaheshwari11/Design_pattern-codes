public interface Device{
    public boolean isEnabled();
    public void enabled();
    public void disable();
    public int getVolume();
    public void setVolume(int p);
    public int getChannel();
    public void setChannel(int p);
}