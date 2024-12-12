package martes;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(3);
		
		
		System.out.println(lista.reversed());
		System.out.println();
		System.out.println(lista);
		System.out.println();
		System.out.println(lista.getFirst());
		System.out.println();
		System.out.println(lista.getLast());
		System.out.println();
		System.out.println(lista.getClass());
		System.out.println();
		System.out.println(lista.contains(2));
		System.out.println();
		System.out.println(lista.toString());
		System.out.println();
		
		for (int i=0;i<lista.size();i++) {
			
		System.out.println(lista.get(i));
		}
		
		System.out.println();
		
	
		
		
		
	}

}
