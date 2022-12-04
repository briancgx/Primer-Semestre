public class Ejercicio2
{	public static void main(String args[])
	{	double lado1, lado2, oper1, oper2;
        Teclado x=new Teclado();
        System.out.println("Captura la base del rectangulo: ");
        lado1=x.leeDouble();
        System.out.println("Captura la altura del rectangulo: ");
        lado2=x.leeDouble();
		oper1=(lado1+lado2)*2;
		oper2=lado1*lado2;
		System.out.println("El perimetro es: "+oper1+"\n"+"El area es: "+oper2);
		System.exit(0);
	}
}

        
       