package ca.bcit.winter2021.comp2522.midterm.question3;

import java.util.ArrayList;

public class TestQuestion3 {
    public static void runAllTestScenariosForQuestion3(){

        Webpage webpage = null;
        //TODO: complete creating webpage instance

        TwitterAccount barackObamaAccount = null;
        barackObamaAccount = new TwitterAccount("BarackObama", 129600000, 594500, 2007);

        TwitterAccount joeBidenAccount = null;
        joeBidenAccount = new TwitterAccount("JoeBiden", 28800000, 47, 2007);

        TwitterAccount elonmuskAccount = null;
        elonmuskAccount = new TwitterAccount("elonmusk", 47900000, 103, 2009);

        TwitterAccount billgatesAccount = null;
        billgatesAccount =  new TwitterAccount("BillGates", 53800000, 274, 2009);

        TwitterAccount ladygagaAccount = null;
        ladygagaAccount = new TwitterAccount("ladygaga", 83900000, 120400, 2008);

        TwitterAccount rihannaAccount = null;
        rihannaAccount = new TwitterAccount("rihanna", 102100000, 1015, 2011);

        TwitterAccount michelleObamaAccount = null;
        michelleObamaAccount = new TwitterAccount("MichelleObama", 20300000, 15, 2011);

        ArrayList<TwitterAccount> twitterAccounts = new ArrayList<>();
        twitterAccounts.add(barackObamaAccount);
        twitterAccounts.add(joeBidenAccount);
        twitterAccounts.add(elonmuskAccount);
        twitterAccounts.add(billgatesAccount);
        twitterAccounts.add(ladygagaAccount);
        twitterAccounts.add(rihannaAccount);
        twitterAccounts.add(michelleObamaAccount);

        webpage = new Webpage(twitterAccounts);

        //Note: Do not make changes to the following statements
        //Note: Do not make changes to the following statements
        webpage.sortBasedOnNumberOfFollowers();
        webpage.sortBasedOnNumberOfFollowing();
        webpage.filterBasedOnYearJoinTwitter(2015);

    }
}
