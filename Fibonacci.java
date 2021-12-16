import java.util.*;
/**
 * Write a description of class FIbonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
   public int fib(int a){
       if(a == 0){
           return 0;
       }
       if(a == 1||a == 2){
           return 1;
        }else{
            return fib(a-1) + fib(a-2);
        }
    } 
    
   public int fibAb(int n){
       if(n == 0){
           return 0;
       }
       if(n == 1){
           return 1;
       }
       if(n>1){
           return fibAb(n-1) + fibAb(n-2);
       }else{
           return 0;
       }
   }
   
   public void zeitMessen(int fibonacciZahl){
       long start_time = System.nanoTime();
       fib(fibonacciZahl);
       long end_time = System.nanoTime();
   
       //return (end_time - start_time)/1000000; double als RckgabeParameter zu ungenau
       System.out.println("Der Methodenaufruf hat: " + (end_time - start_time)/1000000 + " Millisekunden gedauert.");
   }
}
