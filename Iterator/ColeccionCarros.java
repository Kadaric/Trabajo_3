import java.util.ArrayList;
import java.util.List;

public class ColeccionCarros 
{
    private List<Carro> carros;

    public ColeccionCarros() 
    {
        carros = new ArrayList<>();
    }

    public void agregarCarro(Carro carro) 
    {
        carros.add(carro);
    }

    public CarroIterator getIterator() 
    {
        return new CarroIterator(carros);
    }
}
