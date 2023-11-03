public class Lamborghini extends Carro
{
    Lamborghini(Radio radio, String color, int cilindraje)
    {
        super(radio,color,cilindraje);
    }  
    
    public void acelerar()
    {
        System.out.println("El carro Lamborghini de color "+ this.colorDelCarro + " se aceleró correctamente con "+this.cilindrajeDelCarro +" CC" );
    }
}
