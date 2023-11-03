public abstract class Carro 
{
    protected Radio radioDelCarro;
    protected String colorDelCarro;
    protected int cilindrajeDelCarro;
    public Carro(Radio radio, String color, int cilindraje )
    {
        this.radioDelCarro = radio;
        this.colorDelCarro = color;
        this.cilindrajeDelCarro = cilindraje;
    }
    
    public Radio getRadio() {
        return radioDelCarro;
    }

    public String getColor() {
        return colorDelCarro;
    }

    public int getCilindraje() {
        return cilindrajeDelCarro;
    }


    public abstract void acelerar();
}
