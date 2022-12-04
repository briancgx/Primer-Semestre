import javax.swing.*;
public class Ejercicio17
{	public static void main(String args[])
	{	String cd;
		double ctd, t, s, a, c;
		cd=JOptionPane.showInputDialog("Cantidad donada: ");
		ctd=Integer.parseInt(cd);
		t=ctd*.20f;
		s=ctd*.15f;
		a=ctd*.30f;
		c=ctd*.35f;
		JOptionPane.showMessageDialog(null,"La carrera de telecomunicaciones recibirá: "+Math.round(t)+" pesos."+"\n"+
										"La carrera de sistemas recibirá: "+Math.round(s)+" pesos."+"\n"+
										"La carrera de administración recibirá: "+Math.round(a)+" pesos."+"\n"+
										"La carrera de contabilidad recibirá: "+Math.round(c)+" pesos.");
		System.exit(0);
	}
}