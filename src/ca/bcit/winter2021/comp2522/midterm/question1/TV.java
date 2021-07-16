package ca.bcit.winter2021.comp2522.midterm.question1;

public class TV {
    private boolean isOn;
    private boolean isMute;
    private int volume;
    public int currnetChannel;

    public TV(int volume, int currnetChannel, boolean isOn, boolean isMute) {
        this.volume = volume;
        this.currnetChannel = currnetChannel;
        this.isOn = isOn;
        this.isMute = isMute;
    }

    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public boolean isMute(){
        return this.isMute;
    }
    public void setMute(boolean status){
        this.isMute = status;
    }
    public boolean isTVON(){
        return isOn;
    }
    public void setTVON(boolean status){
        this.isOn = status;
    }
    public int getChannel(){ return this.currnetChannel; }
    public void setChannel(int channel){
        this.currnetChannel = channel;
    }
}
