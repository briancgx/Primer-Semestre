import javax.swing.*;
public class Ejercicio14
{	public static void main(String args[])
	{	String m;
		double metros, pie;
		m=JOptionPane.showInputDialog("¿Cuántos metros deseas convertir a pies? ");
		metros=Integer.parseInt(m);
		pie=metros*3.28084f;
		JOptionPane.showMessageDialog(null,m+"m son equivalentes a: "+pie+" pies");
		System.exit(0);
	}
}