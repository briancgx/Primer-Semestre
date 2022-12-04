import javax.swing.*;
public class Ejercicio11
{	public static void main(String args[])
	{	float ca, dg;
		double pes, ff;
		ca=Float.parseFloat(JOptionPane.showInputDialog("Capturar Chelines Australianos para convertir a Pesetas: "));
		dg=Float.parseFloat(JOptionPane.showInputDialog("Capturar Dracmas Griegos para convertir a Francos Franceses: "));
		pes=ca*9.56871f;
		ff=(dg*0.88607f)/20.110f;
		JOptionPane.showMessageDialog(null,+ca+" Chelines Australianos convertidos a Pesetas son: "+pes+"\n"+dg+" Dragmas Griegos convertidos a Francos Franceses son: "+ff);
		System.exit(0);
	}
}