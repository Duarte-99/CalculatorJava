import java.util.Scanner;

/**
 * Ejemplo que nos permite utilizar
 *
 *  - Variables numúricas
 *  - Operadores
 *  - Expresiones
 *  - Estructuras de decisión
 *  - Estructuras de repetición
 *
 */

public class Calculator {

    /**
     * @param args
     */
    public static void main(String ...args) {

        //Variable donde almacenamos el valor seleccionado del menú
        int opcion = 0;

        //Por ahora, es normal si no se comprenden estas dos líneas de código.
        Scanner sc;

        sc = new Scanner(System.in);

        do {
            //Imprimimos por consola el menú
            System.out.println( "\n"); //Este caracter especial nos permite imprimir una línea en blanco
            System.out.println( "***** CALCULADORA HARDSOFTDAY *****" );
            System.out.println( "1. Sumar" );
            System.out.println( "2. Restar" );
            System.out.println( "3. Multiplicar" );
            System.out.println( "4. Dividir" );
            System.out.println( "5. Resto" );
            System.out.println( "0. Salir del programa" );
            System.out.print( "Introduzca una opción válida: " );

            //Estas líneas de código nos permiten leer del teclado
            //y transformar el valor leído de String a int

            // 1) Recoger el valor escrito en el teclado
            // 2) Transformar esa cadena de caracteres en un valor entero

            opcion = Integer.parseInt(sc.nextLine());

            //Si la opcion es menor que 0 o mayor que 5, no es una
            //opción válida
            if (opcion < 0 || opcion > 5) {
                System.out.println( "Opción no válida. Vuelva a escoger" );
                //Si la opcion es diferente a cero, solicitamos los
                //dos operandos (Números)
            } else if (opcion != 0) {

                System.out.println( "\n" );

                float numero1, numero2;

                System.out.print( "Introduzca el primer operando: " );
                numero1 = Float.parseFloat(sc.nextLine());

                System.out.print( "Introduzca el segundo operando: " );
                numero2 = Float.parseFloat(sc.nextLine());  //recoge un valor por teclado y lo convierte en teclado

                System.out.println("\n");

                switch(opcion) {

                    case 1: //Suma
                        System.out.println( "El resultado de la suma es " + ( numero1 + numero2 ) );
                        break;
                    case 2: //Resta
                        System.out.println( "El resultado de la resta es " + ( numero1 - numero2 ) );
                        break;
                    case 3: //Multiplicación
                        System.out.println( "El resultado de la multiplicación es " + ( numero1 * numero2 ) );
                        break;
                    case 4: //División
                        System.out.println( "El resultado de la división es " + ( numero1 / numero2 ) );
                        break;
                    case 5: //Resto
                        System.out.println( "El resto de dividir " +numero1 + " entre " + numero2 + " es " + ( numero1 % numero2 ) );
                        break;
                }
            }
        } while (opcion != 0); //opcion == 0 implicar salir del programa

        //Indicamos que no vamos a leer ningún valor más por teclado.
        sc.close();

        System.out.println( "Finalizando la ejecución de la calculadora" );

    }

}
