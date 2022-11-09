package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo {

    public static void main(String args[]) throws Exception {
        BufferedReader input;
        input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un número: " );
        int i = Integer.parseInt(input.readLine());
        try {
            if ((i % 2 ) == 0) {
                System.out.println("El número " + i + " es par.");
            }else {
                throw new EvenNumberException();
            }
        }catch (EvenNumberException exception) {
            exception.printStackTrace();
        }

    }

}
