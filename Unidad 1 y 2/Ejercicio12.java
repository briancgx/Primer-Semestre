import javax.swing.*;
public class Ejercicio12
{	public static void main(String args[])
	{	String hd, hv, dhd, dhv;
		int hd1, hv1, dhd1, dhv1, phd, phv, pdhd, pdhv, pagot;
		hd=JOptionPane.showInputDialog("Horas diurnas laboradas (sin contabilizar las del domingo): ");
		hv=JOptionPane.showInputDialog("Horas nocturnas trabajadas (sin contabilizar las del domingo): ");
		dhd=JOptionPane.showInputDialog("Horas diurnas trabajadas en domingo: ");
		dhv=JOptionPane.showInputDialog("Horas nocturnas trabajadas en domingo: ");
		hd1=Integer.parseInt(hd);
		hv1=Integer.parseInt(hv);
		dhd1=Integer.parseInt(dhd);
		dhv1=Integer.parseInt(dhv);
		phd=hd1*50;
		phv=hv1*80;
		pdhd=dhd1*70;
		pdhv=dhv1*120;
		pagot=phd+phv+pdhd+pdhv;
		JOptionPane.showMessageDialog(null,"El pago total del sueldo del empleado es: "+pagot+" pesos.");
		System.exit(0);
	}
}