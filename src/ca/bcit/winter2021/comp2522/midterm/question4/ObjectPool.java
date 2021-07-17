package ca.bcit.winter2021.comp2522.midterm.question4;

import java.util.ArrayList;

public class ObjectPool {

    private int capacity;
    ArrayList<DatabaseManager> objects;

    public ObjectPool(int capacity){
        this.capacity = capacity;
        objects = new ArrayList<>();
    }

    public DatabaseManager updatePool(DatabaseManager dm){
        if(objects.size()==0){
            objects.add(dm);
            dm.setIsInUse(true);
            return dm;
        } else {
            if(objects.size()==capacity){
                for(DatabaseManager item: objects){
                    if(item.getIsInUse()==false){
                        item.setIsInUse(true);
                        return item;
                    }
                }
                return null;
            } else {
                for(DatabaseManager instance: objects){
                    if(instance.getIsInUse()==false){
                        instance.setIsInUse(true);
                        return instance;
                    }
                }
                objects.add(dm);
                dm.setIsInUse(true);
                return dm;
            }
        }
    }

    public void makeAllFree(){
        for(DatabaseManager instance: objects){
            instance.setIsInUse(false);
        }
    }
}
