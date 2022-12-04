public class Ejercicio5
{	public static void main(String args[])
	{	double sd, dt, sph, phe, pinc, percep, smb;
        Teclado x=new Teclado();
        System.out.println("Sueldo mensual base del empleado: ");   
        smb=x.leeDouble();
        sd=smb/30;
		sph=sd/8;
		dt=30-(2+7);
		phe=((9*sph)*(2))+((6*sph)*(3));
		pinc=(3*sd)+((4*sd)*(.75f));
		percep=(sd*dt)+phe+pinc;
        System.out.println("Percepciones totales del empleado: "+percep);
        System.exit(0);
	}
}	
