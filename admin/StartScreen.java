package admin;

import Interface.NavigationInterface;
import Interface.TakeInputInterface;

public class StartScreen {

    public static final int SCREEN_ID = 1;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public StartScreen(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(){
        System.out.println("###############################");
        System.out.println("#   Welcome to Online Shop    #");
        System.out.println("###############################");

        System.out.println("Please choose an option to continue...");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Exit");

        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1,3));
    }
}

