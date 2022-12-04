import javax.swing.*;
public class Ejercicio15
{	public static void main(String args[])
	{	String ar, ac, ad;
		double adr, adc, add, ta, par, pac, pad;
		ar=JOptionPane.showInputDialog("Alumnos en la asignatura de redes: ");
		ac=JOptionPane.showInputDialog("Alumnos en la asignatura de contaduría: ");
		ad=JOptionPane.showInputDialog("Alumnos en la asignatura de diseño: ");
		adr=Integer.parseInt(ar);
		adc=Integer.parseInt(ac);
		add=Integer.parseInt(ad);
		ta=adr+adc+add;
		par=(adr/ta)*100;
		pac=(adc/ta)*100;
		pad=(add/ta)*100;
		JOptionPane.showMessageDialog(null,"Porcentaje alumnos en la asignatura de redes: "+par+"%"+"\n"+
											"Porcentaje alumnos en la asignatura de contaduría: "+pac+"%"+"\n"+
											"Porcentaje alumnos en la asignatura de diseño: "+pad+"%");
		System.exit(0);
	}
}