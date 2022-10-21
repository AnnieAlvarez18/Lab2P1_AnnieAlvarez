/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_anniealvarez;
import java.util.Scanner;
/**
 *
 * @author anniealvarez
 */
public class Lab2P1_AnnieAlvarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        boolean menu = true;
        int resp = 1;
        System.out.println("Ingrese 1 si quiere ver el menu");
        resp = lectura.nextInt();
        while (resp == 1){
            System.out.println("--MENU--");
            System.out.println("1. MCD");
            System.out.println("2. Sumatoria");
            System.out.println("3. Supermercado");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opcion que desee");
            int opcion = lectura.nextInt();
            
            if (opcion == 1){
                System.out.println("--MCD--");
                System.out.println("Ingrese el primer numero positivo");
                int num1 = lectura.nextInt();
                System.out.println("Ingrese el segundo numero positivo");
                int num2 = lectura.nextInt();
                
                if (num1 > 0 && num2 > 0){
                    int acum;
                    if (num1 > num2){
                        int resta1 = num1 - num2;
                        if (resta1 == num2){
                          acum = resta1;
                                  
                          System.out.println("El MDC de "+ num1 +" y "+ num2 +" es: "+ acum);
                        }//fin if
                        
                        if(resta1 != num2){ 
                            int acumm = num2 - resta1;
                            System.out.println("El MDC de "+ num1 +" y "+ num2 +" es: "+ acumm);
                        } 
                    }//fin while 1:1
                    if (num1 < num2){
                        int acum2;
                       int resta2 = num2 - num1;
                        if (num1 == num2){
                            acum2 = resta2;
                            System.out.println("El MDC de "+ num1 +" y "+ num2 +" es: "+ acum2); 
                        }//fin if
                        if(resta2 != num1){
                            int acumu;
                             acumu = num1 - resta2;
                             System.out.println("El MDC de "+ num1 +" y "+ num2 +" es: "+ acumu);
                        }
                     
                    }//fin while 1
                    }else {
                    System.out.println("Los numeros ingresados deben ser positivos");
                }//fin else
            }//fin if 1
            
            if (opcion == 2){
                System.out.println("--Sumatoria--");
                System.out.println("Ingrese un numero k");
                 int k = lectura.nextInt();
                 int n = 1;
                 double sumatoria;
                 double suma = 0;
                
                if(k > 0){
                    while(n <= k){
                        suma = suma + (n/(n+1));
                    n += 1;
                    }
                    sumatoria = (suma)*(suma);
                    System.out.println("La sumatoria es: "+ sumatoria);    
                }else{
                    System.out.println("Solo numeros positivos");  
                }
                        
            }//fin if 2
            
            if (opcion == 3){
                System.out.println("--Supermercado--");
                System.out.println("--TIPO DE CLIENTES--");
                System.out.println("Tipo 0");
                System.out.println("Tipo 1");
                System.out.println("Tipo 2");
                System.out.println("Ingrese el tipo de cliente: ");
                int opct = lectura.nextInt();
                int productos;
                int total;
                if (opct == 0){
                    int precio = lectura.nextInt();
                    System.out.println("Ingrese el precio de la unidad del producto: ");
                    int cantidad = lectura.nextInt();
                    System.out.println("Ingrese la cantidad de producto: ");
                    
                    if (cantidad >= 10 && cantidad <= 19){
                        
                        productos = cantidad - 2;
                        
                        total = productos * precio;
                        System.out.println("El total a pagar es: "+total);
                    }//fin 
                    if (cantidad > 20){
                        productos = cantidad - 5;
                        total = productos * precio;
                        System.out.println("El total a pagar es: "+total);
                    }
                }
                if (opct == 1){
                    int precio = lectura.nextInt();
                    System.out.println("Ingrese el precio de la unidad del producto: ");
                    int cantidad = lectura.nextInt();
                    System.out.println("Ingrese la cantidad de producto: ");
                    
                    if (cantidad >= 20 && cantidad <= 29){
                        
                        productos = cantidad - 2;
                        
                        total = productos * precio * (10/100);
                        System.out.println("El total a pagar es: "+total);
                    }//fin 
                    if (cantidad > 30){
                        productos = cantidad - 5;
                        total = productos * precio* (10/100);
                        System.out.println("El total a pagar es: "+total);
                    }
                }
                if (opct ==2){
                    int precio = lectura.nextInt();
                    System.out.println("Ingrese el precio de la unidad del producto: ");
                    int cantidad = lectura.nextInt();
                    System.out.println("Ingrese la cantidad de producto: ");
                    
                    if (cantidad >= 30 && cantidad <= 39){
                        
                        productos = cantidad - 2;
                        
                        total = productos * precio * (30/100);
                        System.out.println("El total a pagar es: "+total);
                    }//fin 
                    if (cantidad > 40){
                        productos = cantidad - 5;
                        total = productos * precio* (30/100);
                        System.out.println("El total a pagar es: "+total);
                    }
                    
                }
                
                
            }//fin if 3
            
            else {
                System.out.println("--Salir--");
                menu = false;
            }//fin if 4
        }//fin while 1
        System.out.println(".");
        
        
    }//fin metodo main
    
}//fin clase 
