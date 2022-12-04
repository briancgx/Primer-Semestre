import javax.swing.*;
public class Ejercicio2
{	public static void main(String args[])
	{	float lado1, lado2;
		double oper1, oper2;
		lado1=Float.parseFloat(JOptionPane.showInputDialog("Captura la base del rectangulo: "));
		lado2=Float.parseFloat(JOptionPane.showInputDialog("Captura la altura del rectangulo: "));
		oper1=(lado1+lado2)*2;
		oper2=lado1*lado2;
		JOptionPane.showMessageDialog(null,"El perimetro es: "+oper1+"\n"+"El area es: "+oper2);
		System.exit(0);
	}
}
