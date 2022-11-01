
public class Vehiculo {

	public void instancia() {
		new Avion();
		new Barco();
		new Velero();
		new Helicoptero();
	}

	private int modeloVehiculo;

	private String nombreVehiculo = "";

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public int getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(int modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public void transportar() {
		System.out.println( "Metodo trasportar de la clase vehiculo");
	}

}
