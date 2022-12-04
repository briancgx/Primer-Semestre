import javax.swing.JOptionPane;
public class Ejercicio1
{	public static void main(String args[])
	{	String n1, n2;
		int num1, num2, oper;
		n1=JOptionPane.showInputDialog("Captura un numero");
		n2=JOptionPane.showInputDialog("Captura otro numero");
		num1=Integer.parseInt(n1);
		num2=Integer.parseInt(n2);
		oper=num1+num2;
		JOptionPane.showMessageDialog(null,"La suma es : " +oper);
		System.exit(0);
	}
}