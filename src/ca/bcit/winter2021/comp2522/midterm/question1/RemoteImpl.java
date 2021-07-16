package ca.bcit.winter2021.comp2522.midterm.question1;

public class RemoteImpl implements Remote {
    @Override
    public boolean turnOnOFFTV(TV tv) {
        if(tv.isTVON()) {
            tv.setTVON(false);
            return false;
        } else {
            tv.setTVON(true);
            return true;
        }
    }

    @Override
    public boolean muteUnMuteTV(TV tv) {
        if(tv.isMute()){
            tv.setMute(true);
            return true;
        } else {
            tv.setMute(false);
            return false;
        }
    }

    @Override
    public int changeVolume(int amount, TV tv) {
        int v = tv.getVolume();

        if(amount==+1){
            tv.setVolume(v+1);

            return v+1;
        } else if (amount==-1){
            tv.setVolume(v-1);
            return v-1;
        } else {
            return v;
        }
    }

    @Override
    public int changeChannel(int amount, TV tv) {
        int c = tv.getChannel();
        if(amount==+1){
            tv.setChannel(c+1);
            return c+1;
        } else if (amount==-1){
            tv.setChannel(c-1);
            return c-1;
        } else {
            return c;
        }
    }
}
