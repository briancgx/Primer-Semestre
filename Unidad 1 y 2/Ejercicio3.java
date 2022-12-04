import javax.swing.*;
public class Ejercicio3
{	public static void main(String args[])
	{	float pulgadas;
		double cm;
		pulgadas=Float.parseFloat(JOptionPane.showInputDialog("Capturar pulgadas que desea convertir a centimetros: "));
		cm=pulgadas*2.54f;
		JOptionPane.showMessageDialog(null,+pulgadas+" Pulgadas convertidas a Centimetros son: "+cm);
		System.exit(0);
	}
}	