public class Menu 
{   public static void main(String[] args)
    {   int opc;
        Teclado t=new Teclado();
        Metodos m=new Metodos();
        do
            {   System.out.println("\nMenu de opciones"+
                                    "\n1.- Temperaturas minimas y maximas."+
                                    "\n2.- Matriz de 4x4."+
                                    "\n3.- Serie Matematica."+
                                    "\n4.- Fin.");
                System.out.print("Seleccione una opcion: ");
                opc=t.leeInt();
                switch(opc)
                    {   case 1: m.temperaturas();
                                break;
                        case 2: m.matriz();
                                break;
                        case 3: m.serie();
                                break;
                        case 4: System.out.println("Fin del programa");
                                break;
                        default: System.out.println("-Seleccion erronea, escoja otra opcion-");
                    }
            }
        while(opc!=4);
        System.exit(0);
    }
    
}
