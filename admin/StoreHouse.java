package admin;

import Interface.*;
import start.StartApplication;

import static start.StartApplication.*;

public class StoreHouse{

    public static String book=new String("Books");
    public static String compu=new String("Computer");
    public static String cl=new String("Clothes");

    public static final int SCREEN_ID = 10;


    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public StoreHouse(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displaScreen(){
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|          Store House         |");
        System.out.println("-------------------------------");

        System.out.println("\nStock\n"+book+": "+ TOTAL_BOOKS+"\n"+compu+": "+TOTAL_COMPUTERS+"\n"+cl+": "+TOTAL_CLOTHS+"\n");
        System.out.println("1. Back");
        System.out.println("2. Exit");

        navigationInterface.navigate(SCREEN_ID,takeInputInterface.takeIntInput(1,2));
    }
}

