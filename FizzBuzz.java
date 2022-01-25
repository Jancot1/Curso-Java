import java.util.Scanner;

public class FizzBuzz {

    public int fizzBuzz(int number) {
        Scanner numero = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero:");
        num = numero.nextInt();
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
            System.out.println(num);
        }
        return num;
    }
}
