import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int retirementAge = 65;
        int retirementMoney = 800000;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "! What is your age?");
        int age = sc.nextInt();

        System.out.println(name + ", retirement is at age " + retirementAge + ". Let's see if you're on track for retirement.");
        System.out.println("What is your annual salary?");

        int salary = sc.nextInt();


        if (retirementMoney >= (salary * 10)) {
            System.out.println("Congratulations, you are on track for retirement!");
        } else {
            System.out.println("Oops, you need to save more for retirement!");
        }

    }
}


