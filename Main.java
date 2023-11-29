import admin.*;
import customer.*;
import Interface.*;
import info.Customer;
import info.Employee;
import start.StartApplication;

import java.util.ArrayList;


public class Main{

    static ArrayList<Employee> initialEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1,"Jalal","1200");
        employees.add(emp1);

        Employee emp2 = new Employee(2,"Palal","2500");
        employees.add(emp2);

        Employee emp3 = new Employee(3,"Lalal","2200");
        employees.add(emp3);

        Employee emp4 = new Employee(1,"Talal","2100");
        employees.add(emp4);

        Employee emp5 = new Employee(5,"Galal","1500");
        employees.add(emp5);

        Employee emp6 = new Employee(6,"Falal","3300");
        employees.add(emp6);

        Employee emp7 = new Employee(7,"Nalal","1800");
        employees.add(emp7);

        Employee emp8 = new Employee(1,"Malal","4500");
        employees.add(emp8);

        Employee emp9 = new Employee(9,"Kalal","5000");
        employees.add(emp9);

        Employee emp10 = new Employee(10,"Alal","6000");
        employees.add(emp10);
        return employees;
    }

    static ArrayList<Customer> initialCustomers(){
        ArrayList<Customer> customers = new ArrayList<>();

        Customer cust1 = new Customer(1,"Dutul","Muhammadpur", "01797348384");
        customers.add(cust1);

        Customer cust2 = new Customer(2,"Nutul","Sirajganj", "017454548384");
        customers.add(cust2);

        Customer cust3 = new Customer(3, "Rutul","Bogra","01789767876");
        customers.add(cust3);

        Customer cust4 = new Customer(4,"Lutul","Rangpur","0175568775");
        customers.add(cust4);

        Customer cust5 = new Customer(5, "Futul", "Chittagong", "01236589623");
        customers.add(cust5);

        Customer cust6 = new Customer(6, "Kutul", "Pabna", "01786945314");
        customers.add(cust6);

        Customer cust7 = new Customer(7, "Hutul", "Feni", "01985622434");
        customers.add(cust7);

        Customer cust8 = new Customer(8,"Gutul","Thakurgaon","01563256359");
        customers.add(cust8);

        Customer cust9 = new Customer(9, "Vutul", "Pachbibi", "017866575314");
        customers.add(cust9);

        Customer cust10 = new Customer(10,"Tutul","Hili", "017973434534");
        customers.add(cust10);



        return customers;
    }

    public static void main(String[] args) {
        StartApplication app = new StartApplication(initialCustomers(), initialEmployee());
        app.startApplication();
    }

}

