public class Ejercicio1
{	public static void main(String args[])
	{	int num1, num2, oper;
        Teclado x=new Teclado();
		System.out.println("Captura un numero: ");
        num1=x.leeInt();
        System.out.println("Captura otro numero: ");
        num2=x.leeInt();
        oper=num1+num2;
        System.out.print("La suma de "+num1+" y "+num2+" es de: "+oper);
        System.exit(0);
	}
}