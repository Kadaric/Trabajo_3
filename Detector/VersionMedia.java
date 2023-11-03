public class VersionMedia extends VersionesDecorator
{    
    private String proteccion = "airBag";
    private String ventilacion = "aire acondicionado";

    public VersionMedia(Carro carroMedio) 
    {
        super(carroMedio);
        agregarAccesorio();
    }

    public boolean accionar()
    {
        return true;        
    }

    public void acelerar()
    {
        System.out.println("El carro aceleró correctamente");

    } 

    public void agregarAccesorio()
    {
        System.out.println("La versión media cuanta con: \n- "+this.proteccion+"\n- "+this.ventilacion);
    }
}