import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Start {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setDni("11111111");
		persona1.setNombre("Persona1");
		
		Persona persona2 = new Persona();
		persona2.setDni("22222222");
		persona2.setNombre("Persona2");
		
		Persona persona3 = new Persona();
		persona3.setDni("33333333");
		persona3.setNombre("Persona3");
		
		Persona persona4 = new Persona();
		persona4.setDni("44444444");
		persona4.setNombre("Persona4");
		
		Persona persona5 = new Persona();
		persona5.setDni("55555555");
		persona5.setNombre("Persona5");
		
		Persona persona6 = new Persona();
		persona6.setDni("55555555");
		persona6.setNombre("Persona6");
		
		
		//HashMap no garantiza el orden
		HashMap<String, Persona> datos = new HashMap<String, Persona>(); 
		
		//LinkedHashMap garantiza el orden en el que se han metido
		//LinkedHashMap<String, Persona> datos = new LinkedHashMap<String, Persona>();
		
		//TreeMap los ordena de manera ascendente
		//TreeMap<String, Persona> datos = new TreeMap<String, Persona>();
		
		datos.put(persona1.getDni(), persona1);
		datos.put(persona2.getDni(), persona2);
		datos.put(persona3.getDni(), persona3);
		datos.put(persona4.getDni(), persona4);
		datos.put(persona5.getDni(), persona5);
		datos.put(persona5.getDni(), persona6);
		
		
		Map<String, Persona> miMap = datos;
		
		
		
		/*
		//Map sabe imprimir las llaves sin falta de iterador
		System.out.println(miMap.keySet());
		
		/*le pido al Map que me de el conjunto de llaves 
		y el iterador y mientras que tenga elementos los imprimo
		Iterator<String> iterador = miMap.keySet().iterator();
		while(iterador.hasNext()) {
			
			System.out.println(iterador.next());
		}
		
		
		Persona persona = miMap.get("33333333");
		System.out.println("Recuperando datos...");
		System.out.println(persona);
		
		*/
		
		/*crea una estructura de datos de tipo valor y para recuperarlas 
		se ayuda con un iterador con lo que esta // */	
		System.out.println("Salida del HashMap ******************");
		//Iterator<Persona> iterador = datos.values().iterator();
		
		/*se queda con la parte del HashMap que solo se corresponda a la interfaz Map
		 * porque asi podemos usar todas las clases de Map*/
		Iterator<Persona> iterador = miMap.values().iterator();
		while(iterador.hasNext()) { //si el iterador tiene elementos que me de el siguiente
			
			Persona persona = iterador.next();
			System.out.println(persona);
		}
		
		
	
	
		
	}

}
