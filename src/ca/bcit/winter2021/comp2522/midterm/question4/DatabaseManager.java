package ca.bcit.winter2021.comp2522.midterm.question4;

//TODO: Change this class to support an Object Pool for this class. Checkout the Problem4's description.
public final class DatabaseManager {

    private static DatabaseManager INSTANCE;
    private boolean isInUse;

    private DatabaseManager() {
        isInUse = true;
    }

    public static DatabaseManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseManager();
        }

        return INSTANCE;
    }

}
