import java.util.Scanner;

public class Cliente 
{
    public static void main(String[] args)
    {
        Carro carrodemisSuenos;
        Carro carroVersionado;
        Scanner leer = new Scanner (System.in);
        
        try
        {    
            System.out.println("El cliente va a comprar un carro, ingrese 1 para Ferrari, 2 para Hyundai");
            int opcion = leer.nextInt();
            if(opcion==1)
            {
                Radio miRadio = new Radio();
                miRadio.setMarca("Panasonic");
                carrodemisSuenos = new Ferrari(miRadio, "rojo", 4038);
            }
            else
            {
                Radio miRadio = new Radio();
                miRadio.setMarca("Sony");
                carrodemisSuenos = new Hyundai(miRadio, "amarillo", 1600);
            }

            System.out.println("Elija la versión: \n1. Básica\n2. Media\n3. Lujo");
            opcion = leer.nextInt();

            if(opcion==1)
            {
                carroVersionado = new VersionBasica(carrodemisSuenos);
                carroVersionado.acelerar();
                
            }
            else if(opcion==2)
            {
                carroVersionado = new VersionMedia(carrodemisSuenos);
                carroVersionado.acelerar();
            }
            else if(opcion==3)
            {
                carroVersionado = new VersionLujo(carrodemisSuenos);
                carroVersionado.acelerar();
            }
            else
            {
                System.out.println("Elija una opción valida");
            }
        
        }
        
        catch(Exception ex)
        {
            
        }
        finally
        {
            leer.close();
        }
    }   
}
