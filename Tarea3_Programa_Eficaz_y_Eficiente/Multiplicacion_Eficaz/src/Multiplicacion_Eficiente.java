
import java.util.Scanner;

/*
 * Universidad Nacional Autónoma de México
 * Facultad de Estudios Superiores Aragón
 * Hernández Bárcenas Miguel Ángel
 */

/**
 *
 * @author Miguel Angel
 */
public class Multiplicacion_Eficiente {
    
    public static void main(String[] args) {
        
        int otra = 0;
        do{
            Scanner entrada = new Scanner(System.in);
        
            System.out.println("================ Calculador de tablas de multiplicar ================\n");

            int contador;
            int tabla = 0;
            int inicio = 0;
            int fin = 0;

            do{
                try{
                    contador = 0;
                    System.out.print("¿Que tabla quieres saber?: ");
                    tabla = entrada.nextInt();
                }catch(Exception e){
                    System.out.println("¡¡¡ ERROR !!!");
                    System.out.println("Solo se aceptan numeros enteros...\n");
                    contador = 1;
                    entrada.nextLine();
                }
            }while(contador != 0);

            do{
                try{
                    contador = 0;
                    System.out.print("¿En que numero deseas iniciar?: ");
                    inicio = entrada.nextInt();
                }catch(Exception e){
                    System.out.println("¡¡¡ ERROR !!!");
                    System.out.println("Solo se aceptan numeros enteros...\n");
                    contador = 1;
                    entrada.nextLine();
                }
            }while(contador != 0);

            do{
                try{
                    contador = 0;
                    System.out.print("¿En que numero deseas terminar?: ");
                    fin = entrada.nextInt();
                    System.out.println("");
                }catch(Exception e){
                    System.out.println("¡¡¡ ERROR !!!");
                    System.out.println("Solo se aceptan numeros enteros...\n");
                    contador = 1;
                    entrada.nextLine();
                }
                if(fin <= inicio){
                    System.out.println("El numero final debe ser mayor que el inicial...\n");
                    contador = 1;
                    entrada.nextLine();
                }
            }while(contador != 0);


            System.out.println("-------CALCULANDO--------\n");
            for(int i=inicio; i<=fin; i++){
                System.out.println(tabla + " x " + i + " = " + (tabla*i));
            }
            System.out.println("\n");

            do{
                try{
                    contador = 0;
                    System.out.print("¿Quieres hacer otro cálculo?\n"
                                    + "1) Si\n"
                                    + "2) No\n"
                                    + "Respuesta: ");
                    int opcion = entrada.nextInt();
                    System.out.println("");
                    
                    switch(opcion){
                        case 1: otra = 1;
                             break;
                        case 2: otra = 0;
                             break;
                        default: System.out.println("Por favor escoje una opcion valida...\n");
                            contador = 1;
                    }
                }catch(Exception e){
                    System.out.println("Por favor escoje una opcion valida...\n");
                    contador = 1;
                    entrada.nextLine();
                }
            }while(contador != 0);
        }while(otra == 1);
    }
    
}
