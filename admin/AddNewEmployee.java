package admin;

import info.*;
import Interface.*;

import java.util.ArrayList;

public class AddNewEmployee {
    public static final int SCREEN_ID = 5;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AddNewEmployee(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(ArrayList<Employee> emps){
        System.out.println("\n\n");
        System.out.print("Enter New Employee ID: ");
        int id = takeInputInterface.takeIntInput(1,Integer.MAX_VALUE);
        System.out.print("Enter New Employee Name: ");
        String name = takeInputInterface.takeStringInput();
        System.out.print("Enter New Employee Salary: ");
        String salary = takeInputInterface.takeStringInput();

        Employee newEmployee = new Employee(id, name, salary);
        emps.add(newEmployee);
        navigationInterface.navigate(SCREEN_ID, 0);
    }
}
