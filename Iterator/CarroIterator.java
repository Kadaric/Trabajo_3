import java.util.List;

public class CarroIterator
{
    private List<Carro> carros;
    private int indiceActual;

    public CarroIterator(List<Carro> carros) 
    {
        this.carros = carros;
        indiceActual = 0;
    }

    public boolean hasNext() 
    {
        if(indiceActual<carros.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Carro next() 
    {
        if (hasNext()) 
        {
            Carro carro = carros.get(indiceActual);
            indiceActual++;
            return carro;
        } 
        else 
        {
            return null;
        }
    }
}