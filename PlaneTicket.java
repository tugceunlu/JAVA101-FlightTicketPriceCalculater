import java.util.Scanner;
public class PlaneTicket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, ticket_type;
        double km, cost_per_km = 0.10, normal_cost, a_discount_rate,t_discount_rate = 1, reduced_cost, final_cost;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your ticket type (Enter 1 for one way ticket, enter 2 for round trip ticket): ");
        ticket_type = input.nextInt();
        System.out.print("Enter the distance in km: ");
        km = input.nextDouble();
        normal_cost = (km * cost_per_km);

        if (age < 12){
            a_discount_rate = 0.50;
        } else if (age > 12 && age <= 24) {
            a_discount_rate = 0.10;

        } else if (age > 24) {
            a_discount_rate = 0.30;

        } else {
            a_discount_rate = 1;

        }


        if (ticket_type == 1){
            t_discount_rate = 1;
        } else if (ticket_type == 2) {
            t_discount_rate = 0.20;

        } else {
            System.out.print("Enter a valid statement.");
        }


        reduced_cost = (normal_cost - (normal_cost * a_discount_rate));
        final_cost = ( reduced_cost - (reduced_cost * t_discount_rate));

        if (ticket_type == 1){
            final_cost = final_cost;
        } else if (ticket_type == 2) {
            final_cost = final_cost*2;

        } else {
            System.out.print("Enter a valid statement.");
        }

        System.out.print("Your ticket costs: " + final_cost);


        



    }
}
