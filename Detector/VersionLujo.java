public class VersionLujo extends VersionesDecorator
{    
    private String proteccion = "airBag";
    private String ventilacion = "aire acondicionado";
    private String sensor = "sensor de parqueo";
    private String freno = "freno ABS";

    public VersionLujo(Carro carroLujo) 
    {
        super(carroLujo);
        agregarAccesorio();
    }

    public void acelerar()
    {
        System.out.println("El carro aceleró correctamente");

    } 

    public void agregarAccesorio()
    {
        System.out.println("La versión de lujo cuenta con: \n- "+this.proteccion+"\n- "+this.ventilacion +"\n- "+this.sensor +"\n- "+this.freno);
    }
}
