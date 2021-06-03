package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {


    public static void main(String[] args) {
        List list = new ArrayList();
        //1 - Type code to create a list of names. Use ArrayList.

        //2 - Call print method to print the list passed as its parameter.
        ListActivity listActivity = new ListActivity();


        list.add("Mariia");
        list.add("Vladislav");
        list.add("Pusheen");
        list.add("Gidget");
        listActivity.print(list);

    }

    void print(List list) {
        //3 - Type code to print this list
        //Notice the order in which elements get printed.

        for (int i = 0; i < list.size(); i++) {
            Object name = list.get(i);
            System.out.println("name: " + name);
        }

    }
}
