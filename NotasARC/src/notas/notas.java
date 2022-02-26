package notas;
/**
 * 
 */

import java.util.Scanner;
/**
 * Esta clase  calificara al alumno 
 * @author Adan
 *@version: 26/02/2022
 */
public class notas {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir números por teclado
int notas = 0;
String calificacion = "";
System.out.print("Introduzca una nota: ");
notas = reader.nextInt();
notas.califica.califica(notas);
reader.close();
}

/**
 * @param notas
 * @deprecated Use {@link notas.califica#califica(int)} instead
 */
/*public static void cali(int notas) {
	notas.califica.califica(notas);
}
*/
/**
 * @param num_nota
 * @deprecated Use {@link califica#califica(int)} instead
 */
public static void califica(int num_nota) {
	califica.califica(num_nota);
}
}

