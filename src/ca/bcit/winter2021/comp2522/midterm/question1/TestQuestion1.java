package ca.bcit.winter2021.comp2522.midterm.question1;

public class TestQuestion1 {

    public static void runAllTestScenariosForQuestion1(){

        TV tv1 = null;
        tv1 = new TV(10, 100, false, false);
        WhiteRemote whiteRemote = null;
        BlackRemote blackRemote = null;
        whiteRemote = new WhiteRemote();
        blackRemote = new BlackRemote();

        whiteRemote.turnOnOFFTV(tv1);

        whiteRemote.changeVolume(+1, tv1);
        whiteRemote.changeVolume(+1, tv1);
        whiteRemote.changeVolume(+1, tv1);

        whiteRemote.changeVolume(-1, tv1);
        whiteRemote.changeVolume(-1, tv1);

        blackRemote.changeChannel(+1, tv1);
        blackRemote.changeChannel(+1, tv1);
        blackRemote.changeChannel(+1, tv1);

        blackRemote.muteUnMuteTV(tv1);

        whiteRemote.muteUnMuteTV(tv1);


        //TODO: Make sure the following print statement, prints out the information of the TV (volume, channle, mute or unmute, on or off)
        //Note: Do not make changes to this print statement
        //Note: Do not make changes to this print statement
        System.out.println(tv1);

        //TODO: add anything else needed here (if needed)

        //Note: Do not make changes to the following statements
        //Note: Do not make changes to the following statements
        System.out.println("TV Volume Test: "+testTVVolume(tv1));
        System.out.println("TV Mute Test: "+isTVMute(tv1));
        System.out.println("TV Off Test: "+isTVOff(tv1));
        System.out.println("TV Channel Test: "+testTVChannel(tv1));
    }

    //TODO: There are 4 compile errors here. Do not make changes here. Make changes in the right place to fix these issues.
    //The following code does not compile as there are some compile errors. Please fix them without making any change in the code below.
    //Note: Do not change this method
    //Note: Do not change this method

    private static boolean testTVVolume(TV tv){
        if(tv.getVolume()==13){
            return true;
        } else {
            return false;
        }
    }

    //Do not change this method
    //Do not change this method
    private static boolean isTVMute(TV tv){
        return tv.isMute();
    }

    //Do not change this method
    //Do not change this method
    private static boolean isTVOff(TV tv){
        return !(tv.isTVON());
    }

    //Do not change this method
    //Do not change this method
    private static boolean testTVChannel(TV tv){
        if (tv.getChannel()==103){
            return true;
        } else {
            return false;
        }
    }
}
