import javax.swing.*;
public class Ejercicio4
{	public static void main(String args[])
	{	String agente1, agente2, vagente1, vagente2;
		int va1, va2, cvendidas, ventasa1, ventasa2, ingresos;
		agente1=JOptionPane.showInputDialog("Ingrese el nombre del primer agente: ");
		agente2=JOptionPane.showInputDialog("Ingrese el nombre del segundo agente: ");
		vagente1=JOptionPane.showInputDialog("¿Cuántas computadoras vendió "+agente1+"?");
		vagente2=JOptionPane.showInputDialog("¿Cuántas computadoras vendió "+agente2+"?");
		va1=Integer.parseInt(vagente1);
		va2=Integer.parseInt(vagente2);
		cvendidas=va1+va2;
		ventasa1=va1*12500;
		ventasa2=va2*12500;
		ingresos=((cvendidas*12500)*(80))/100;
		JOptionPane.showMessageDialog(null,"Total de computadoras vendidas: "+cvendidas+"\n"+
															"Total de ventas de "+agente1+" es de: "+ventasa1+"\n"+
															"Total de ventas de "+agente2+" es de: "+ventasa2+"\n"+
															"Ingresos totales descontando comisiones de los vendedores: "+ingresos);
		System.exit(0);
	}
} 