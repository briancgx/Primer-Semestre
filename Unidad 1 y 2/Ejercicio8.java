import javax.swing.*;
public class Ejercicio8
{	public static void main(String args[])
	{	float cv;
		double ca;
		cv=Float.parseFloat(JOptionPane.showInputDialog("Costo del vehiculo sin impuestos y sin comisiones del vendedor: "));
		ca=cv*1.18f;
		JOptionPane.showMessageDialog(null,"Costo total del automovil: "+ca);
		System.exit(0);
	}
}