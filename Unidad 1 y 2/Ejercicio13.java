import javax.swing.*;
public class Ejercicio13
{	public static void main(String args[])
	{	String pg, pp, pe;
		int pg1, pp1, pe1, g, e, p, pt;
		pg=JOptionPane.showInputDialog("Partidos ganados: ");
		pp=JOptionPane.showInputDialog("Partidos perdidos: ");
		pe=JOptionPane.showInputDialog("Partudos empatados: ");
		pg1=Integer.parseInt(pg);
		pp1=Integer.parseInt(pp);
		pe1=Integer.parseInt(pe);
		g=pg1*3;
		p=pp1*0;
		e=pe1*1;
		pt=g+p+e;
		JOptionPane.showMessageDialog(null,"Puntos totales: "+pt);
		System.exit(0);
	}
}