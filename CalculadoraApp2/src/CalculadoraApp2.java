import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraApp2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in); /* para obtener datos de entrada por consola (clase)*/
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            // Mostramos el menu
            System.out.println("""
                    1) Suma
                    2) Resta
                    3) Multiplicacion
                    4) Division
                    5) Salir
                    """);
            System.out.println("**** Que operacion desesa realizar ? **** ");
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que este dentro de las Opciones Mencionadas

                if (operacion >= 1 && operacion <= 4) {
                    System.out.print("Proporciona valor operando1: ");
                    var operador1 = Integer.parseInt(consola.nextLine()); /* Convierte un string en un entero*/
                    System.out.print("Proporciona valor operando2: ");
                    var operador2 = Integer.parseInt(consola.nextLine());

                    int resultado;

                    switch (operacion) {
                        case 1: { //suma
                            resultado = operador1 + operador2;
                            System.out.println("El resultado Suma Es : " + resultado);
                            break;
                        }
                        case 2: { //resta
                            resultado = operador1 - operador2;
                            System.out.println("El resultado Resta Es : " + resultado);
                            break;
                        }
                        case 3: {//Multiplicacion
                            resultado = operador1 * operador2;
                            System.out.println("El resultado Multiplicacion Es : " + resultado);
                            break;
                        }
                        case 4: {//Divicion
                            resultado = operador1 / operador2;
                            System.out.println("el resultado Division Es : " + resultado);
                            break;
                        }
                        default: {
                            System.out.println("La Opcion es erronea: " + operacion);
                        }
                    }
                } else if (operacion == 5) { // salir
                    System.out.println("Programa Finalizado ...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                // imprimimos un salto de linea
                System.out.println();
            }// fin del bloque try
            catch (Exception e){
                System.out.println("Ocurrio un error :" + e.getMessage());
            }
        } // fin del ciclo while
    } // fin de main
} // fin de clase