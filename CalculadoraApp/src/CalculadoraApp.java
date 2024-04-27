import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Aplicacion Calculadora ****");
        System.out.println("Proporciona valor operando1: ");
        Scanner consola = new Scanner(System.in); /* para obtener datos de entrada por consola (clase)*/
        var operador1 = Integer.parseInt(consola.nextLine()); /* Convierte un string en un entero*/
        System.out.println("Proporciona valor operando2: ");
        var operador2 = Integer.parseInt(consola.nextLine());
        var resultado = operador1 + operador2;
        System.out.println("Resultado : " + resultado);

    }
}