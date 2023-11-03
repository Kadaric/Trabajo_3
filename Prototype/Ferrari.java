public class Ferrari extends Carro implements Cloneable
{
    Ferrari(Radio radio, String color, int cilindraje)
    {
        super(radio,color,cilindraje);
    }  
    
    public void acelerar()
    {
        System.out.println("El carro Ferrari de color "+ this.colorDelCarro + " se aceleró correctamente con "+this.cilindrajeDelCarro +" CC" );
    }
    
    public Carro clonar()
    {
        try 
        {
            return (Ferrari) super.clone();
        } 
        catch (CloneNotSupportedException e) 
        {
            System.out.println("No fue posible duplicar el objeto");
            return null;
        }
    }
}
