import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter the integer: "
        );
        int number = input.nextInt();

        if ((number % 2) == 0)
            System.out.print(
                    "The integer is an even number"
            );
        else
            System.out.print(
                    "The integer is an odd number"
            );
    }
}
