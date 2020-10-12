package com.company;

public class Pie extends Food{
    private String filling;

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
    public Pie(String filling){
        super("Пирог");
        this.filling = filling;
    }
    @Override
    public String toString() {
        return super.toString()+" с начинкой '"+filling.toUpperCase()+"'";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if(!(o instanceof Pie)) return false;
        return filling.equals(((Pie)o).filling);
    }

    @Override
    public int calculateCalories() {
        int cal = 0;
        if(filling.equals("вишневая")){
            cal+=240;
        }
       else if(filling.equals("клубничная")){
            cal+=320;
        }
       else cal += 210;
        return cal;
    }
}
