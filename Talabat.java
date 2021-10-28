package talabat;

import java.util.Scanner;
import java.sql.Connection;

public class Talabat {

    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);
        while (true) {
            String Choice;
            System.out.println("---------------------------");
            System.out.println("1.Sign In");
            System.out.println("2.Sign Up");
            System.out.print("Enter Your Choice:  ");
            Choice = input.next();
            if (Choice.equals("1")) {
                System.out.println("---------------------------");
                System.out.println("1.Sign In As A Restaurant Owner");
                System.out.println("2.Sign In As A Customer");
                System.out.print("Please Enter Your Choice:  ");
                String Choice1 = input.next();
                if (Choice1.equals("1")) {
                    Owner o = new Owner("", "", "");
                    o.Login_Restaurantowner();
                    String choice;
                    while (true) {
                        System.out.println("---------------------------");
                        System.out.println("1.Add Meal");
                        System.out.println("2.edit Meal");
                        System.out.println("3.remove Meal");
                        System.out.println("4.Show History");
                        System.out.println("5.Log Out");
                        System.out.print("Please Enter Your Choice: ");
                        choice = input.next();
                        System.out.println("---------------------------");
                        if (choice.equals("1")) {
                            o.addMeal();
                        } else if (choice.equals("2")) {
                            System.out.println("1.Edit on Name");
                            System.out.println("2.Edit on Price");
                            System.out.println("3.Edit on Describtion");
                            System.out.println("4.Edit on Quantity");
                            System.out.print("Enter Your Choice:  ");
                            choice = input.next();
                            System.out.println("---------------------------");
                            if (choice.equals("1")) {
                                String newName;
                                System.out.print("Enter The New Name:  ");
                                newName = input.next();
                                o.EditMeal_name(newName);
                                System.out.println("---------------------------");
                            } else if (choice.equals("2")) {
                                double newPrice;
                                System.out.print("Enter The New Price:  ");
                                newPrice = input.nextDouble();
                                o.EditMeal_price(newPrice);
                                System.out.println("---------------------------");
                            } else if (choice.equals("3")) {
                                String newDescribtion;
                                System.out.print("Enter the New Describtion:  ");
                                newDescribtion = input.next();
                                o.EditMeal_details(newDescribtion);
                                System.out.println("---------------------------");
                            } else if (choice.equals("4")) {
                                int newQuantity;
                                System.out.print("Enter The new Quantity:  ");
                                newQuantity = input.nextInt();
                                o.EditMeal_quantity(newQuantity);
                                System.out.println("---------------------------");
                            } else {
                                System.out.println("Invalid Choice");
                            }
                        } else if (choice.equals("3")) {
                            o.Remove_Meal();
                            System.out.println("---------------------------");
                        } else if (choice.equals("4")) {
                            o.showRestaurantHistory();
                            System.out.println("---------------------------");
                        } else if (choice.equals("5")) {
                            break;
                        } else {
                            System.out.println("Invalid Choice");
                            System.out.println("---------------------------");
                        }
                    }
                } else if (Choice1.equals("2")) {
                    Customer c = new Customer("", "", "", "");
                    c.Login_Customer();
                } else {
                    System.out.println("Invalid Choice");
                }
            } else if (Choice.equals("2")) {
                String choice1;
                System.out.println("---------------------------");
                System.out.println("1.Create Account As Restaurant Owner");
                System.out.println("2.Create Account As Customer");
                System.out.print("Please Enter Your Choice:  ");
                choice1 = input.next();
                System.out.println("---------------------------");
                if (choice1.equals("1")) {
                    Owner m = new Owner("", "", "");
                    m.Register();
                } else if (choice1.equals("2")) {
                    Customer temp = new Customer("", "", "", "");
                    temp.Register();
                } else {
                    System.out.println("Invalid Choice");
                }
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
