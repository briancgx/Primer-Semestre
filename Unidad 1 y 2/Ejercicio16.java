import javax.swing.*;
public class Ejercicio16
{	public static void main(String args[])
	{	String ta, aa, ar;
		double tta, taa, tar, paa, par;
		ta=JOptionPane.showInputDialog("¿Cuántos alumnos hay en total?: ");
		aa=JOptionPane.showInputDialog("¿Cuántos aprobaron la materia?: ");
		ar=JOptionPane.showInputDialog("¿Cuántos reprobaron la materia?: ");
		tta=Integer.parseInt(ta);
		taa=Integer.parseInt(aa);
		tar=Integer.parseInt(ar);
		paa=(taa/tta)*100;
		par=(tar/tta)*100;
		JOptionPane.showMessageDialog(null,"El porcentaje de alumnos aprobados es de: "+paa+"%"+"\n"+
											"El porcentaje de alumnos reprobados es de: "+par+"%");
		System.exit(0);
	}
}	