public abstract class VersionesDecorator extends Carro 
{
    protected Carro carroVersionado;

    public VersionesDecorator(Carro carro) {
        super(carro.getRadio(),carro.getColor(),carro.getCilindraje());
        this.carroVersionado = carro;
    }

    public abstract void agregarAccesorio();
}
