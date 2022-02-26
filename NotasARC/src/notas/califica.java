/**
 * 
 */
package notas;

/**
 * @author Adan
 *@version: 26/02/2022
 */
public class califica {

	/**
	 * Codigo que calculara la calificación pasada por el parametro
	 * @param num_nota  
	 * Pasa un numero de la nota del alumno entre 0 y 10
	 */
	public static void califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
		calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
		calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota <9)
		calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
		calificacion = "Sobresaliente";
		else
		calificacion = "La nota introducida no es correcta";
		System.out.println(calificacion);
	}


}
