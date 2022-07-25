
/*Scrieti o clasa cu metoda main in ea.
In main scrieti logica care calculeaza suma tuturor numerelor pina la un anumit numar.
De ex.: Suma tuturor numerelor pina la 5 este 15. Faca-ti asta cu toate cele 3 tipuri de loop-uri.

 */

import java.sql.SQLOutput;

public class Lesson8 {
    public static void main(String[] args){
       /*  for loop
       int num = 10; int suma=0;
        for(int i=1;i<=num;i++){
            suma += i;
        }
        System.out.println("Suma tuturor numerelor este: " +suma);
        */
       /* // while loop
        int num = 15; int suma = 0; int i = 1;
        while (i <= num){
          suma += i;
          i++;
        }
        System.out.println("Suma tuturor numerelor este: " +suma);
        */
        // do-while loop
        int suma = 0; int i =1;
        do{
            suma += i;
            i++;
        }
        while(i<=15);
        System.out.println("Suma tuturor numerelor este: " +suma);
    }
}
