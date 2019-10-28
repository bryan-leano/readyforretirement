public class Main {

    public static void main(String[] args) {
//  age
        int age = 29;
        String name = "Bryan";
        int retirementAge = 65;
        int salary = 100000;
        int retirementMoney = 800000;

        System.out.println("You are " + name + " and you are " + age + " years old.");

        if (retirementMoney >= (salary * 10)) {
            System.out.println("Congratulations, you are ready for retirement!");
        } else {
            System.out.println("Oops, you need to save more for retirement!");
        }

    }
}


