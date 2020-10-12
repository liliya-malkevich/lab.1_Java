package com.company;

import java.util.Objects;

public class Apple extends Food {
    private String size;
    @Override
    public void consume(){
        System.out.println(this + "съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public Apple(String size){
        super("Яблоко");
        this.size = size;
            }

    @Override
    public String toString() {
        return super.toString()+" размера '"+size.toUpperCase()+"'";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if(!(o instanceof Apple)) return false;
        return size.equals(((Apple)o).size);
    }

    @Override
    public int calculateCalories() {
        int cal = 0;
        if(size.equals("большое")){
            cal+=20;
        }
        else if(size.equals("небольшое")){
            cal+=15;
        }
        else {
        cal +=10;
        }
        return cal;
    }
}
