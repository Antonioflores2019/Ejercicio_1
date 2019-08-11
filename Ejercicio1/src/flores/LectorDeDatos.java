package flores;

import  java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDeDatos  {

    public static double solicitarDouble (String mensaje) {
        Scanner Lector = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            double n1 = Lector.nextDouble();
            return n1;
        } catch (InputMismatchException e) {
            System.out.println("El dato ingresado no es valido");
            return solicitarDouble(mensaje);
        }
    }
}
