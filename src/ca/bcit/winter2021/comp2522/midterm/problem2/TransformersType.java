package ca.bcit.winter2021.comp2522.midterm.problem2;

// FIXME: use associatedvalues in Swift
// FIXME: want to use Uppercase like DECEPTION, AUTOBOT, use String as Value
public enum TransformersType {
    DECEPTION,
    AUTOBOT;

    public String outPutTeamName() {
        if(this == DECEPTION) {
            return "Deceptions";
        } else {
            return "Autobots";
        }
    }
}