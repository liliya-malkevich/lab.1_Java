package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	Food[] breakfast = new Food[20];
    int i =0;
    boolean calories_needed=false;
        boolean sort_needed=false;
    for(String arg: args){
        if (args[i].equals("-calories")) {
            calories_needed = true;
        }
        if (args[i].equals("-sort")) {
            sort_needed = true;
        }
String[] parts = arg.split("/");
if(parts[0].equals("Cheese")){
    breakfast[i]=new Cheese();
}
else if(parts[0].equals("Apple")){
    breakfast[i]=new Apple(parts[1]);
}
else if(parts[0].equals("Pie")){
    breakfast[i]=new Pie(parts[1]);
}
else if(parts[0].equals("-calories")){
   continue;
}
else if(parts[0].equals("-sort")){
    continue;
}
i++;
    }

	for (int ind = 0; ind < breakfast.length; ind++) {
            if (breakfast[ind] == null) break;
            breakfast[ind].consume();
        }
	Food[] breakfasttrue = new Food[i];
	int count = 0;
	int count_2 = 0;
	for(int j= 0;j<i;j++){
	    count = 1;
	    boolean contin = false;
	    for(int k = 0;k<i;k++){
	        if(breakfasttrue[k]==null) break;
	        if(breakfasttrue[k].equals(breakfast[j])){
	            contin = true;
            }
        }
	    if(contin) continue;
     for(int k = j+1;k<i;k++){
         if(breakfast[k].equals(breakfast[j])){
             count++;
             breakfasttrue[count_2] = breakfast[j];
             count_2++;
         }
     }
	    breakfast[j].consume();
	    System.out.println(count+" раз");
    }
        if(calories_needed){
            int calorii = 0;
            for (int j = 0; j < i; j++) calorii += breakfast[j].calculateCalories();
            System.out.println("калорийность: " + calorii);
        }
        if(calories_needed){
        Arrays.sort(breakfast, new FoodComparator());
        System.out.println("отсортированные продукты");
        for (int j= 0; j < breakfast.length; j++) {
            if (breakfast[j] == null) break;
            System.out.println(breakfast[j].toString() + " " + breakfast[j].calculateCalories());}
        }
    }
}
