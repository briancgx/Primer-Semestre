public class Ejercicio3
{	public static void main(String args[])
	{	double pulgadas, cm;
        Teclado x=new Teclado();
        System.out.println("Capture la cantidad de pulgadas que desea convertir a centimetros: ");
        pulgadas=x.leeDouble();
        cm=pulgadas*2.54f;
        System.out.println(+pulgadas+" pulgadas convertidas a centimetros son: "+cm);
		System.exit(0);
	}
}	

    
