import java.util.Scanner;

public class Cliente 
{
    public static void main(String[] args)
    {
        Carro carrodemisSuenos;
        Scanner leer = new Scanner (System.in);
        Radio miRadio = new Radio();
        miRadio.setMarca("Panasonic");
        //Prototipos de los objetos de marcas de carros
        Carro prototipoFerrari = new Ferrari(miRadio, "rojo", 4308);
        miRadio = new Radio();
        miRadio.setMarca("Sony");
        Carro prototipoHyundai = new Hyundai(miRadio, "amarillo", 1600);


        System.out.println("El cliente va a comprar un carro, ingrese 1 para Ferrari, 2 para Hyundai");
        int opcion = leer.nextInt();
        if(opcion==1)
        {
            carrodemisSuenos = prototipoFerrari.clonar();
        }
        else
        {
            carrodemisSuenos = prototipoHyundai.clonar();
        }

        try
        {
            carrodemisSuenos.acelerar();
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
