public class Hyundai extends Carro implements Cloneable
{
    Hyundai(Radio radio, String color, int cilindraje)
    {
        super(radio,color,cilindraje);
    }  
    
    public void acelerar()
    {
        System.out.println("El carro Hyundai de color "+ this.colorDelCarro + " se aceleró correctamente con "+this.cilindrajeDelCarro +" CC" );
    }

    public Carro clonar()
    {
        try 
        {
            return (Hyundai) super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            System.out.println("No fue posible duplicar el objeto");
            return null;
        }
    }
}