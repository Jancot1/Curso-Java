import java.util.Scanner;

public class FizzBuzz {

    public int fizzBuzz(int number) {
        System.out.println("Ingresa un numero:");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        if (num % 3 == 0){
            System.out.println("Fizz");
        }
        if (num % 15 == 0) {
            System.out.println(" FizzBuzz ");
        }
        if (num % 2 == 0) {
            System.out.println("2");
        }
        return num;
    }
}
