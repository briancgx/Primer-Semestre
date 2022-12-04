import javax.swing.*;
public class Ejercicio10
{	public static void main(String args[])
	{	String entrada, salida;
		int ent, sal, th, ph, pt;
		entrada=JOptionPane.showInputDialog("Hora de ingreso al estacionamiento, usando sistema 24hrs: ");
		salida=JOptionPane.showInputDialog("Hora de salida del estacionamiento, usando sistema 24hrs: ");
		ent=Integer.parseInt(entrada);
		sal=Integer.parseInt(salida);
		th=sal-ent;
		ph=(th-1)*60;
		pt=ph+40;
		JOptionPane.showMessageDialog(null,"Pago total por usar el estacionamiento: "+pt);
		System.exit(0);
	}
}