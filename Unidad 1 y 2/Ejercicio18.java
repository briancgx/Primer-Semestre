import javax.swing.*;
public class Ejercicio18
{	public static void main(String args[])
	{	String cat1, cat2, cat3, p1, p2, p3;
		int pa1, pa2, pa3, c1, c2, c3, at, pc1, pc2, pc3, tp;
		cat1=JOptionPane.showInputDialog("Muebles de la categoría 1 adquiridos: ");
		cat2=JOptionPane.showInputDialog("Muebles de la categoría 2 adquiridos: ");
		cat3=JOptionPane.showInputDialog("Muebles de la categoría 3 adquiridos: ");
		p1=JOptionPane.showInputDialog("Precio los muebles de la categoria 1: ");
		p2=JOptionPane.showInputDialog("Precio los muebles de la categoria 2: ");
		p3=JOptionPane.showInputDialog("Precio los muebles de la categoria 3: ");
		pa1=Integer.parseInt(p1);
		pa2=Integer.parseInt(p2);
		pa3=Integer.parseInt(p3);
		c1=Integer.parseInt(cat1);
		c2=Integer.parseInt(cat2);
		c3=Integer.parseInt(cat3);
		at=c1+c2+c3;
		pc1=c1*pa1;
		pc2=c2*pa2;
		pc3=c3*pa3;
		tp=pc1+pc2+pc3;
		JOptionPane.showMessageDialog(null,"Cantidad de articulos que adquirió el cliente: "+at+"\n"+"\n"+
											"Historial de compra:"+"\n"+
											"Categoría            "+"Cantidad de art.            "+"Precio unitario            "+"Total a pagar por cat."+"\n"+
											"1                             "+c1+"                                       $"+pa3+"                                     $"+pc1+"\n"+
											"2                             "+c2+"                                       $"+pa2+"                                     $"+pc2+"\n"+
											"3                             "+c3+"                                       $"+pa3+"                                     $"+pc3+"\n"+"\n"+
											"Total a pagar: $"+tp);
		System.exit(0);
	}
}