package flores;
import java.lang.Math;
import java.util.Scanner;
import  java.util.InputMismatchException;
public  class Matematicas {
    Scanner lector = new Scanner(System.in);
   public double n1;
    public double n2;
    public double resultado;
    public double i;
   public double acumulador;


    public Matematicas(double resultado) {

        this.resultado = resultado;
        this.n1 = n1;
        this.n2 = n2;
        this.i = i;
        this.acumulador = acumulador;


    }


    public double elevar_numero() {

        double n1 = LectorDeDatos.solicitarDouble("Ingrese el numero que desea elevar:");
        double n2 = LectorDeDatos.solicitarDouble("Ingrese la potencia :");
        return resultado = resultado * Math.pow(n1,n2);


    }

    public double raiz_cuadrada() {
        double n1 =LectorDeDatos.solicitarDouble("Ingrese el numero :");
        return resultado = resultado * Math.sqrt(n1);
    }

    public double evaluar_numero_primo() {


        double n1 = LectorDeDatos.solicitarDouble("Ingrese el numero que desea evaluar :");


        for (i = 1; i < (n1 + 1); i++) {
            if (n1 % i == 0) {
                acumulador++;
            }
        }
        if (acumulador != 2) {
            System.out.println("No es Primo" );

        } else {
            System.out.println("Si es Primo");
        }

        return n1;
    }
}


