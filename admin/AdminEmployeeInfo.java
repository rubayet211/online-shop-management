package admin;

import info.Employee;
import Interface.*;

import java.util.ArrayList;

public class AdminEmployeeInfo {
    public static final int SCREEN_ID = 4;

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;

    public AdminEmployeeInfo(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }

    public void displayScreen(ArrayList<Employee> emps){
        System.out.println("\n\n");
        System.out.println("-------------------------------");
        System.out.println("|          Employees          |");
        System.out.println("-------------------------------");

        for (Employee e : emps){
            System.out.println("ID: "+e.getId()+", Name: "+e.getName()+", Salary: "+e.getSalary());
        }

        if (emps.isEmpty()){
            System.out.println("## No Employees Found.\n");
        }


        System.out.println("1. Add new Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        navigationInterface.navigate(SCREEN_ID, takeInputInterface.takeIntInput(1,4));
    }
}

