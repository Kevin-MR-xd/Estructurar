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
public class EstructuraOperaciones {
    public double res;
    Scanner input = new Scanner(System.in);
    public void suma(double n1,double n2) {
    System.out.printf("Ingresa el valor del primer numero: ");
    n1=input.nextDouble();
    System.out.printf("Ingresa el segundo número: ");
    n2=input.nextDouble();
    res=n1+n2;
    }
    public void resta(double n1, double n2){
    System.out.printf("Ingresa el valor del primer numero");
    n1=input.nextDouble();
    System.out.printf("Ingresa el segundo número");
    n2=input.nextDouble();
    res=n1-n2;
    }
    public void multiplicacion(double n1, double n2){
    System.out.printf("Ingresa el valor del primer numero");
    n1=input.nextDouble();
    System.out.printf("Ingresa el segundo número");
    n2=input.nextDouble();
    res=n1*n2;
    }
    public void division(double n1, double n2){
    System.out.printf("Ingresa el valor del primer numero");
    n1=input.nextDouble();
    System.out.printf("Ingresa el segundo número");
    n2=input.nextDouble();
    res=n1/n2;    
    }
    
    public void resultado(){
        System.out.printf("El resultado es: %5.0f\n",res);
    }
    
    }
