/*Nama : Muh. Riandy Dwi Putra
Nim : 13020220121
Tanggal : Selasa,3-12-2024
 */

import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i = 1;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n"); 
while (i <= N){
System.out.println (i++); 
} /* (i > N)*/
}
}
