import javax.swing.*;
public class Ejercicio6
{	public static void main(String args[])
	{	String tn;
		double tng, gn;
		tn=JOptionPane.showInputDialog("Total de niños que requieren guardería: ");
		tng=Integer.parseInt(tn);
		gn=tng/5;
		JOptionPane.showMessageDialog(null,"Total de guarderías necesarias: " +Math.ceil(gn));
		System.exit(0);
	}
}