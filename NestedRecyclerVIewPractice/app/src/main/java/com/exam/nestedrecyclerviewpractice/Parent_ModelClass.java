package com.exam.nestedrecyclerviewpractice;

import java.util.ArrayList;

public class Parent_ModelClass {

    String title;
    ArrayList<Child_ModelClass> childModelClass;

    public Parent_ModelClass(String title,ArrayList<Child_ModelClass>childModelClass){
        this.title = title;
        this.childModelClass = childModelClass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Child_ModelClass> getChildModelClass() {
        return childModelClass;
    }

    public void setChildModelClass(ArrayList<Child_ModelClass> childModelClass) {
        this.childModelClass = childModelClass;
    }
}
