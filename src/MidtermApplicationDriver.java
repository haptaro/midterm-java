import ca.bcit.winter2021.comp2522.midterm.question1.TestQuestion1;
import ca.bcit.winter2021.comp2522.midterm.question2.TestQuestion2;
import ca.bcit.winter2021.comp2522.midterm.question3.TestQuestion3;
import ca.bcit.winter2021.comp2522.midterm.question4.TestQuestion4;
import ca.bcit.winter2021.comp2522.midterm.question7.TestQuestion7;

//********************************************************************************//
//Please write your information here:
//********************************************************************************//
//first name:
//last name:
//student ID
//Your github ID:
//********************************************************************************//

public class MidtermApplicationDriver {

    public static void main(String[] args){
        //************************************************************************************************//
        System.out.println("I" + "[YOUR FULL NAME HERE]" + "with student id "+ "[YOUR STUDENT ID HERE]" +
                "certify that I have read the exam policy and agree with them all.");
        //***********************************************************************************************//

        TestQuestion1.runAllTestScenariosForQuestion1();
        TestQuestion2.runAllTestScenariosForQuestion2();
        TestQuestion3.runAllTestScenariosForQuestion3();
        TestQuestion4.runAllTestScenariosForQuestion4();
        TestQuestion7.runAllTestScenariosForQuestion7();
    }
}
