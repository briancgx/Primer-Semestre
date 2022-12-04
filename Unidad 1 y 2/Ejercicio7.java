import javax.swing.*;
public class Ejercicio7
{	public static void main(String args[])
	{	float rc, re;
		double ac, ve;
		rc=Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es el radio de la circunferencia?: "));
		re=Float.parseFloat(JOptionPane.showInputDialog("¿Cuál es el radio de la esfera?: "));
		ac=(3.1416f)*(rc*rc);
		ve=((4*3.1416f)*(re*re*re))/3;
		JOptionPane.showMessageDialog(null,"El área de la circunferencia es: "+ac+"\n"+"El volumen de la esfera es: "+ve);
		System.exit(0);
	}
}