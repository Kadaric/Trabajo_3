public class Ferrari extends Carro
{
    Ferrari(Radio radio, String color, int cilindraje)
    {
        super(radio,color,cilindraje);
    }  
    
    public void acelerar()
    {
        System.out.println("El carro Ferrari de color "+ this.colorDelCarro + " se aceleró correctamente con "+this.cilindrajeDelCarro +" CC" );
    }

    public String getMarca()
    {
        return "Ferrari";
    }
}
