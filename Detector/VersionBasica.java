public class VersionBasica extends VersionesDecorator
{    
    public VersionBasica(Carro carroBasico) 
    {
        super(carroBasico);
        agregarAccesorio();
    }

    public void acelerar()
    {
        System.out.println("El carro aceleró correctamente");

    } 

    public void agregarAccesorio()
    {
        System.out.println("La versión basica no cuenta con accesorios");
    }
}
