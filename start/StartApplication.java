package start;
import Interface.NavigationInterface;
import Interface.TakeInputInterface;
import admin.*;
import customer.*;
import info.Customer;
import info.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApplication implements NavigationInterface, TakeInputInterface { //Interface Navigation interface implemented here
    static Scanner scanner = new Scanner(System.in);


    public static final int TOTAL_BOOKS = 250;
    public  static final int TOTAL_COMPUTERS = 450;
    public  static final int TOTAL_CLOTHS = 500;

    ArrayList<Customer> customers;
    ArrayList<Employee> employees;

    public StartApplication(ArrayList<Customer> customers, ArrayList<Employee> employees) {
        this.customers = customers;
        this.employees = employees;
    }

    private final StartScreen startScreen = new StartScreen(this, this);
    private final AdminLogin adminLogin = new AdminLogin(this, this);
    private final CustomerLogin customerLogin = new CustomerLogin(this, this);
    private final StoreHouse storeHouse = new StoreHouse(this, this);
    private final AdminEmployeeInfo adminEmployeeInfo = new AdminEmployeeInfo(this, this);
    private final AdminCustomerInfo adminCustomerInfo = new AdminCustomerInfo(this, this);
    private final AddNewEmployee addNewEmployee = new AddNewEmployee(this, this);
    private final AdminAccess adminAccess = new AdminAccess(this, this);
    private final RemoveEmployee removeEmployee = new RemoveEmployee(this, this);
    private final AddNewCustomer addNewCustomer = new AddNewCustomer(this, this);
    private final RemoveCustomerScreen removeCustomerScreen = new RemoveCustomerScreen(this, this);

    private final WishList wishList = new WishList(this, this);
    private final PaymentScreen paymentScreen = new PaymentScreen(this, this);

    public void startApplication(){
        startScreen.displayScreen();
    }

    public int takeIntInput(int minValue, int maxValue){
        while(true){
            String inp = scanner.nextLine();
            try{
                int input = Integer.parseInt(inp);
                if (input >= minValue && input <= maxValue) return input;
            }catch (Exception ignored){ }
            System.out.println("Invalid Input. Please try again!");
        }
    }

    @Override
    public String takeStringInput() {
        return scanner.nextLine();
    }



    @Override //Polymorphism
    public void navigate(int from, int to) {
        switch (from){
            case 1:
                switch (to){
                    case 1:
                        adminLogin.displayScreen();
                    case 2:
                        customerLogin.displayScreen(customers);
                    case 3:
                        System.exit(0);
                }

            case 2:
                switch (to){
                    case 0:
                        adminAccess.displayScreen();
                    case 1:
                        adminLogin.displayScreen();
                    case 2:
                        startScreen.displayScreen();
                }

            case 3:
                switch (to){
                    case 1:
                        adminEmployeeInfo.displayScreen(employees);
                    case 2:
                        adminCustomerInfo.displayScreen(customers);
                    case 3:
                        storeHouse.displaScreen();
                    case 4:
                        startScreen.displayScreen();
                    case 5:
                        System.exit(0);
                }

            case 4:
                switch (to){
                    case 1:
                        addNewEmployee.displayScreen(employees);
                    case 2:
                        removeEmployee.displayScreen(employees);
                    case 3:
                        adminAccess.displayScreen();
                    case 4:
                        System.exit(0);
                }

            case 5:
            case 6:
                adminEmployeeInfo.displayScreen(employees);

            case 7:
                switch (to){
                    case 1:
                        addNewCustomer.displayScreen(customers);
                    case 2:
                        removeCustomerScreen.displayScreen(customers);
                    case 3:
                        adminAccess.displayScreen();
                    case 4:
                        System.exit(0);
                }

            case 8:
            case 9:
                adminCustomerInfo.displayScreen(customers);

            case 10:
                switch (to){
                    case 1:
                        adminAccess.displayScreen();
                    case 2:
                        System.exit(0);
                }

            case 11:
                switch (to){
                    case 0:
                        startScreen.displayScreen();
                    case 1:
                        wishList.displayScreen();
                    case 2:
                        startScreen.displayScreen();
                    case 3:
                        System.exit(0);
                }

            case 12:
                switch (to){
                    case 1:
                        paymentScreen.displayScreen();
                    case 2:
                        customerLogin.displayScreen(customers);
                    case 3:
                        System.exit(0);
                }

            case 13:
                wishList.displayScreen();
        }
    }
}
