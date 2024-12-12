package martes;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la marca del Monitor");
		Scanner sc=new Scanner(System.in);
		String marcaMonitor=sc.next();
		System.out.println("Introduce el precio del Monitor");
		double precioMonitor=sc.nextDouble();
		
		Monitor m1=new Monitor(marcaMonitor,precioMonitor);
		//System.out.println(m1.getMarca());
		//System.out.println(m1.getPrecio());
		
		System.out.println();
		
		System.out.println("Introduce la marca de la CPU");
		String marcaCPU=sc.next();
		System.out.println("Introduce el procesador de la CPU");
		String procesCPU=sc.next();
		System.out.println("Introduce el precio de la CPU");
		double precioCPU=sc.nextDouble();
		
		CPU cp1=new CPU(marcaCPU,procesCPU,precioCPU);
		//System.out.println(cp1.getMarca());
		//System.out.println(cp1.getProcesador());
		//System.out.println(cp1.getPrecio());
		System.out.println();
		
		Ordenador o=new Ordenador(m1,cp1);
		System.out.println("El precio total del equipo es " +o.getPrecioTotal());
		
	}

}
