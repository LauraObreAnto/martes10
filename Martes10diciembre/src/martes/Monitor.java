package martes;

public class Monitor {

	private String marca;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	private double precio;
	
	public Monitor(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
}
