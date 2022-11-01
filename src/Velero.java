import javax.swing.JOptionPane;

public class Velero extends Acuatico{
	
	Vehiculo miVehiculo = new Vehiculo();
	Acuatico miAcuatico = new Acuatico();
	
	public void construrtor() {
		miVehiculo.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de modelo de su velero")));
		miVehiculo.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese un tipo para su velero"));
		miAcuatico.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese nombre para su velero"));
	}

	public String izarVelas() {
		return "Metodo izarVelas de la clase Velero";

	}
	
	public void imprimirDatos() {
		System.out.println();
		construrtor();
		System.out.println(miVehiculo.getModeloVehiculo());
		System.out.println(miVehiculo.getNombreVehiculo());
		System.out.println(miAcuatico.getNombreAcuatico());

	}


}
