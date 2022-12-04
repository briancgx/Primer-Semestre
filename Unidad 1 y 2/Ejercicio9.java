import javax.swing.*;
public class Ejercicio9
{	public static void main(String args[])
	{	String m;
		double s1, s2, st;
		m=(" metros");
		s1=((9.81f)*(.5f))*(1);
		s2=((9.81f)*(.5f))*(9);
		st=s1+s2;
		JOptionPane.showMessageDialog(null,"La distancia de una piedra cayendo de un edificio de 100m entre el segundo 1 y 3 es de: "+st+m);
		System.exit(0);
	}
}