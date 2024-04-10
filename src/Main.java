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
        int saldo=1500;
        int retiro=0;
        int deposito=0;
        String datosCliente= """
                ***************************
                Banco: %s
                Cliente: %s
                Tipo de Cuenta: %s
                Saldo Disponible: %s %d
                ***************************
                """.formatted(nombreBanco, nombreCliente, tipoCuenta, moneda, saldo);
        //***
        Boolean ciclo=true;
        //***
        int opcion = 1;
        Scanner teclado = new Scanner(System.in);
        //****************
        while (ciclo) {
            System.out.println(datosCliente);
            System.out.println("** *********************** ***");
            System.out.println("** MENU CAJERO AUTOMATICO ***");
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
                    System.out.println("******************************************************");
                    System.out.println("Sr(a): "+nombreCliente +", saldo actual "+moneda+" "+saldo);
                    System.out.println("Presione cualquier tecla para continuar");
                    System.out.println("******************************************************");
                    System.in.read();
                    break;
                case 2:
                    // Código para realizar un saque
                    System.out.println("******************************************************");
                    System.out.println("Sr(a):"+nombreCliente+ "\nSu saldo actual es: "+ moneda + " "+saldo+"\n¿Cuanto desea retirar?");
                    retiro= teclado.nextInt();
                    if(retiro > saldo){
                        System.out.println("******************************************************");
                        System.out.println("Estimado Sr(a):"+nombreCliente+ "\nSu saldo es insuficiente, recuerde que cuenta con "+moneda+" "+saldo);
                        System.out.println("Presione cualquier tecla para continuar");
                        System.out.println("******************************************************");
                    }
                    else {
                        saldo -= retiro;
                        System.out.println("******* RETIRO EXITOSO *****************************************");
                        System.out.println("Estimado Sr(a):" + nombreCliente + "\nSu nuevo saldo es " + moneda + " " + saldo);
                        System.out.println("Presione cualquier tecla para continuar");
                        System.out.println("******************************************************");
                    }
                    System.in.read();
                    break;
                case 3:
                    // Código para realizar un depósito
                    System.out.println("******************************************************");
                    System.out.println("Sr(a):"+nombreCliente+ "\nSu saldo actual es: "+ moneda + " "+saldo+"\n¿Cuanto desea depositar?");
                    deposito= teclado.nextInt();
                    saldo +=deposito;
                    System.out.println("******* DEPOSITO EXITOSO *****************************************");
                    System.out.println("Estimado Sr(a):" + nombreCliente + "\nSu nuevo saldo es " + moneda + " " + saldo);
                    System.out.println("Presione cualquier tecla para continuar");
                    System.out.println("******************************************************");
                    System.in.read();
                    break;
                case 4:
                    // Código para salir del programa
                    System.out.println("******* SALIENDO DEL SISTEMA *****************************************");
                    System.out.println("Estimado Sr(a):" + nombreCliente + ", " + nombreBanco + " le da las gracias por usar nuestros servicios");
                    System.out.println("******************************************************");
                    ciclo=false;
                    break;
                default:
                    // Código para manejar una opción no válida
                    System.out.println("******************************************************");
                    System.out.println("Error!! Opcion no valida!! \nPresione cualquier tecla para continuar");
                    System.out.println("******************************************************");
                    System.in.read();
                    break;
            }
        }
    }
}