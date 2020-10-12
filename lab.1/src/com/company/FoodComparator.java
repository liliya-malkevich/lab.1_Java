package com.company;

import java.util.Comparator;
public class FoodComparator implements Comparator<Food> {
    public int compare(Food f1, Food f2){
        if(f1==null) return 1;
        if(f2==null) return -1;
        if(((Food)f1).calculateCalories()==((Food)f2).calculateCalories()) return 0;
        if(((Food)f1).calculateCalories()>((Food)f2).calculateCalories()) return 1;
        return -1;
    }

}
