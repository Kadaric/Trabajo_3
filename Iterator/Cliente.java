public class Cliente 
{
    public static void main(String[] args)
    {
        try
        {
            ColeccionCarros coleccionCarros = new ColeccionCarros();
            Carro carrodemisSuenos;
            
            Radio miRadio = new Radio();
            miRadio.setMarca("Panasonic");
            coleccionCarros.agregarCarro(new Hyundai(miRadio, "amarillo", 1600));
            
            miRadio = new Radio();
            miRadio.setMarca("Sony");
            coleccionCarros.agregarCarro(new Ferrari(miRadio, "rojo", 4308));
            
            miRadio = new Radio();
            miRadio.setMarca("Pionner");
            coleccionCarros.agregarCarro(new Lamborghini(miRadio, "azul", 3996));
            
            miRadio = new Radio();
            miRadio.setMarca("Jvc");
            coleccionCarros.agregarCarro(new Corvette(miRadio, "negro", 6162 ));

            CarroIterator iterator = coleccionCarros.getIterator();

            while (iterator.hasNext()) {
                Carro carro = iterator.next();
                carro.acelerar();
            }
        }
        catch(Exception ex)
        {
            
        }
    }   
}
