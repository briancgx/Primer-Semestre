public class Ejercicio13 
    {   public static void main(String[] args)
        {   double com;
            Teclado x=new Teclado();
            System.out.println("Capture el total de su compra:");
            com=x.leeDouble();
            if(com<1999)
                System.out.println("Su compra no tiene descuento, por lo tanto su pago es de: "+Math.round(com));
            else
                {   if((com>=2000)&&(com<=3000))
                        {   com=com*(0.95f);
                            System.out.println("Su compra tiene un descuento del 5%, por lo tanto su pao es de: "+Math.round(com));
                        }
                    else
                        {   if((com>=3001)&&(com<=5000))
                                {   com=com*(0.93f);
                                    System.out.println("Su compra tiene un descuento del 7%, por lo tanto su pago es de: "+Math.round(com));
                                }
                            else
                                {   if(com>=5000)
                                        com=com*(0.90f);
                                        System.out.println("Su compra tiene un descuento del 10%, por lo tanto su pago es de: "+Math.round(com));
                                }
                        }
                }

        }

    }