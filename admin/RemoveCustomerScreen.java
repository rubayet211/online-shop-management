package admin;

import info.Customer;
import Interface.*;

import java.util.ArrayList;

public class RemoveCustomerScreen {

    public static final int SCREEN_ID = 9;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public RemoveCustomerScreen(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(ArrayList<Customer> cust ){
        System.out.println("\n\n");
        System.out.print("Enter Customer ID: ");
        int id = takeInputInterface.takeIntInput(1,Integer.MAX_VALUE);

        for (Customer e:cust){
            if (e.getId() == id){
                cust.remove(e);
                break;
            }
        }
        System.out.println("Saved Successfully!");
        navigationInterface.navigate(SCREEN_ID, 0);
    }



}
