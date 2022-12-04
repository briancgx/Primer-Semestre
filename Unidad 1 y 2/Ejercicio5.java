import javax.swing.*;
public class Ejercicio5
{	public static void main(String args[])
	{	float smb;
		double sd, dt, sph, phe, pinc, percep;
		smb=Float.parseFloat(JOptionPane.showInputDialog("Sueldo mensual base del empleado: "));
		sd=smb/30;
		sph=sd/8;
		dt=30-(2+7);
		phe=((9*sph)*(2))+((6*sph)*(3));
		pinc=(3*sd)+((4*sd)*(.75f));
		percep=(sd*dt)+phe+pinc;
		JOptionPane.showMessageDialog(null,"Percepciones totales del empleado: "+percep);
		System.exit(0);
	}
}	