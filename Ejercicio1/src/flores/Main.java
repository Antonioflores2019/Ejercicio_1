package flores;
import java.util.Scanner;
import  java.util.InputMismatchException;
public  class Main {

    public static void main(String[] args){


        Scanner lector = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Operaciones de Matematicas");
        System.out.println("****************************");

        while (true){
            System.out.println("1. Elevar un numero");
            System.out.println("2. Calcular la raiz cuadrada de un numero");
            System.out.println("3. Determinar si un numero es primo");
            System.out.println("4. Salir");

            int opccion = lector.nextInt();

            switch (opccion){

                case 1 :

                    Matematicas operacion1= new Matematicas(1);
                    System.out.println("El resultado es : "+operacion1.elevar_numero());
                    System.out.println("---------------------------------------");

                    break;

                case 2:

                    Matematicas operacion2 = new Matematicas(1);
                    System.out.println("El resultado es :"+operacion2.raiz_cuadrada());
                    System.out.println("-----------------------------------------");

                    break;

                case 3:

                    Matematicas operacion3 = new Matematicas(1);
                    System.out.println(""+operacion3.evaluar_numero_primo());
                    System.out.println("---------------------------------------------");

                    break;

                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (opccion == 4) {
                break;

            }

        }

    }
}
