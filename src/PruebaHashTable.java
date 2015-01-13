import java.util.Hashtable;
import java.util.Enumeration;

public class PruebaHashTable {

	public static void main(String[] args) {

		Hashtable <String, Integer> aa = new Hashtable <String, Integer> ();

		aa.put("Ruben",1);
		aa.put("Fran", 2);
		aa.put("Raquel", 3);

		// Mostrar el valor de la clave "Ruben"
		System.out.println("Mostrar valor: " + aa.get("Ruben") + "\n");

		//Comprobar si existe
		if (aa.containsKey("Ruben")) {

			System.out.println("Si existe");
		}
		else {

			System.out.println("No existe");
		}

		// Elimina la entrada de clave, valor cuya clave sea "Fran"
		aa.remove("Fran");

		String clave;

		// ".keys" --> Devuelve un objeto de la clase Enumeration que tiene todas las claves de la tabla
		Enumeration names = aa.keys();

		while(names.hasMoreElements()) {

			clave = (String) names.nextElement();

			// Muestra la clave con su valor
			System.out.println(clave + ": " + aa.get(clave));
		}
	}
}