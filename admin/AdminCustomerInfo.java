package admin;

import info.Customer;
import Interface.*;

import java.util.ArrayList;

public class AdminCustomerInfo {

    public static final int SCREEN_ID = 7;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AdminCustomerInfo(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(ArrayList<Customer> customers){
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|          Customers          |");
        System.out.println("-------------------------------");


        for (Customer e : customers){
            System.out.println("ID: "+e.getId()+", Name: "+e.getName()+", Address: "+e.getAddress()+", Phone: "+e.getPhone());
        }

        System.out.println("\n");

        if (customers.isEmpty()){
            System.out.println("## No Customers Found.\n");
        }


        System.out.println("1. Add new Customer");
        System.out.println("2. Remove Customer");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        navigationInterface.navigate(SCREEN_ID,takeInputInterface.takeIntInput(1,4));
    }
}
