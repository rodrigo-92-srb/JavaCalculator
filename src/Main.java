import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operations operations = new Operations();

        Scanner scanner = new Scanner(System.in);

        int option=0;
        float a=0, b=0;


        do {
            System.out.println("CALCULATOR");
            System.out.println("[1] - SUM (X, Y) ");
            System.out.println("[2] - SUB (X, Y) ");
            System.out.println("[3] - MULT (X, Y) ");
            System.out.println("[4] - DIV (X, Y) ");
            System.out.println("[5] - EXP (X * X) ");
            System.out.println("[0] - EXIT ");
            System.out.println("-------------------------");
            System.out.println("Select a operation: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Insert first value: ");
                    a = scanner.nextFloat();
                    System.out.println("Insert second value: ");
                    b = scanner.nextFloat();
                    System.out.println(a+" + "+b);
                    System.out.println("Result: "+operations.sum(a, b));
                    System.out.println("Operation finished!");
                    System.out.println("-------------------------");
                    break;

                case 2:
                    System.out.println("Insert first value: ");
                    a = scanner.nextFloat();
                    System.out.println("Insert second value: ");
                    b = scanner.nextFloat();
                    System.out.println("Result: "+operations.sub(a, b));
                    System.out.println("Operation finished!");
                    System.out.println("-------------------------");
                    break;

                case 3:
                    System.out.println("Insert first value: ");
                    a = scanner.nextFloat();
                    System.out.println("Insert second value: ");
                    b = scanner.nextFloat();
                    System.out.println("Result: "+operations.mult(a, b));
                    System.out.println("Operation finished!");
                    System.out.println("-------------------------");
                    break;

                case 4:
                    System.out.println("Insert first value: ");
                    a = scanner.nextFloat();
                    System.out.println("Insert second value: ");
                    b = scanner.nextFloat();
                    System.out.println("Result: "+operations.div(a, b));
                    System.out.println("Operation finished!");
                    System.out.println("-------------------------");
                    break;

                case 5:
                    System.out.println("Insert first value: ");
                    a = scanner.nextFloat();
                    System.out.println("Result: "+operations.exp(a));
                    System.out.println("Operation finished!");
                    System.out.println("-------------------------");
                    break;

                case 0:
                    System.out.println("Finishing Calculator...");
                    System.out.println("Calculator finished!");
                    System.out.println("-------- THANK YOU --------");
                    break;

                default:
                    System.out.println("Invalid Operation...");
                    System.out.println("Cancelling Operation...");
                    System.out.println("Operation canceled!");
                    System.out.println("-------------------------");
                    break;
            }

        }while (option!=0);

    }
}