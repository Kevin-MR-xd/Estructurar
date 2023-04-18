/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraOperaciones;
import java.util.Scanner;
/**
 *
 * @author SAC2-8
 */
public class Numeros {
    public void menu(){
    Scanner pro = new Scanner(System.in);
    int opcion = 0;
    double n1 = 0,n2 = 0;
                System.out.println("Seleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                opcion = pro.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                EstructuraOperaciones input = new  EstructuraOperaciones();    
                    if (opcion == 1) {
                        input.suma(n1, n2);
                    } else if (opcion == 2) {
                       input.resta(n1, n2);
                    } else if (opcion == 3) {
                        input.multiplicacion(n1, n2);
                    } else if (opcion == 4) {
                        input.division(n1, n2);
                    }
                    
                    input.resultado();
                } else if (opcion != 5) {
                    System.out.println("Opción inválida");
                }
}
}
