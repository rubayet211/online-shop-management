package admin;

import info.Employee;
import Interface.*;

import java.util.ArrayList;

public class RemoveEmployee {

    public static final int SCREEN_ID = 6;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public RemoveEmployee(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(ArrayList<Employee> emps){
        System.out.println("\n\n");
        System.out.print("Enter Employee ID: ");
        int id = takeInputInterface.takeIntInput(1,Integer.MAX_VALUE);
        for (Employee e:emps){
            if (e.getId() == id){
                emps.remove(e);
                break;
            }
        }
        System.out.println("Saved Successful!");
        navigationInterface.navigate(SCREEN_ID, 0);
    }
}

