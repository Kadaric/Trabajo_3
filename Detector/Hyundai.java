public class Hyundai extends Carro
{
    Hyundai(Radio radio, String color, int cilindraje)
    {
        super(radio,color,cilindraje);
    }  
    
    public void acelerar()
    {
        System.out.println("El carro Hyundai de color "+ this.colorDelCarro + " se aceleró correctamente con "+this.cilindrajeDelCarro +" CC" );
    }

    public String getMarca()
    {
        return "Ferrari";
    }
}