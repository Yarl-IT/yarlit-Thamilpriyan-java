import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.next();

        System.out.println("Your name is " + name);

        System.out.println("********");

        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("Your marks is " + marks);

        sc.close();
    }
}
