import java.io.IOException;
import java.util.Scanner;
//***
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando el reto de App Bancaria");


        //** DEFINIR LAS VARIABLES
        //************************
        String nombreBanco = "Banco-loco";
        String nombreCliente = "Luis Sanchez";
        String moneda="COP";
        String tipoCuenta="Corriente";
        //***
        Boolean ciclo=true;
        //***
        int opcion = 1;
        int saldo=1500;
        Scanner teclado = new Scanner(System.in);

        //****************
        while (ciclo) {
            System.out.println("** *********************** ***");
            System.out.println("** MENU CAJERO AUTOMATICCO ***");
            System.out.println("** " + nombreBanco + "     ***");
            System.out.println("** *********************** ***");
            System.out.println("1 Consultar mi saldo");
            System.out.println("2 Retirar");
            System.out.println("3 Depositar");
            System.out.println("4 Salir");
            System.out.println("** *********************** ***");
            System.out.print("Ingrese su opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    // Código para consultar saldo
                    System.out.println("Seleccionó Consultar Saldo");
                    System.in.read();
                    break;
                case 2:
                    // Código para realizar un saque
                    System.out.println("Seleccionó Retirar");
                    System.in.read();
                    break;
                case 3:
                    // Código para realizar un depósito
                    System.out.println("Seleccionó Depositar");
                    System.in.read();
                    break;
                case 4:
                    // Código para salir del programa
                    System.out.println("Seleccionó Salir");
                    ciclo=false;
                    break;
                default:
                    // Código para manejar una opción no válida
                    break;
            }
        }
    }
}