package admin;

import info.*;
import Interface.*;
import java.util.ArrayList;

public class AddNewCustomer {
    public static final int SCREEN_ID = 8;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AddNewCustomer(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(ArrayList<Customer> customers){
        System.out.println("\n\n");
        System.out.print("Enter New Customer ID: ");
        int id = takeInputInterface.takeIntInput(1,Integer.MAX_VALUE);
        System.out.print("Enter New Customer Name: ");
        String name = takeInputInterface.takeStringInput();
        System.out.print("Enter New Customer Address: ");
        String address = takeInputInterface.takeStringInput();
        System.out.print("Enter New Customer Phone: ");
        String phone = takeInputInterface.takeStringInput();

        Customer newCustomer = new Customer(id, name, address, phone);
        customers.add(newCustomer);

        navigationInterface.navigate(SCREEN_ID, 0);
    }
}