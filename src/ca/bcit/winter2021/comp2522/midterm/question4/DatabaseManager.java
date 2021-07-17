package ca.bcit.winter2021.comp2522.midterm.question4;

//TODO: Change this class to support an Object Pool for this class. Checkout the Problem4's description.
public final class DatabaseManager {

    private static DatabaseManager INSTANCE;
    private boolean isInUse;
    private static ObjectPool objectPool;

    private DatabaseManager() {
        isInUse = true;
    }

    public static DatabaseManager getInstance(int capacity) {
        if(objectPool == null) {
            objectPool = new ObjectPool(capacity);
        }
        DatabaseManager dm = new DatabaseManager();

        INSTANCE = objectPool.updatePool(dm);
        return INSTANCE;
    }

    public void setIsInUse(boolean isInUse){
        this.isInUse = isInUse;
    }

    public boolean getIsInUse(){
        return this.isInUse;
    }

    public static void makeObjectsFree(){
        objectPool.makeAllFree();
    }
}
