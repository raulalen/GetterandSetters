package getterandsetters;

public class Circle {

    private double raio;
    private static int numeroCirculos;
    
    public double getRaio() {
        return raio;
    }
    public void setRaio(double novoRaio) {
        this.raio = novoRaio;
    }
    
    public Circle()
    {
        numeroCirculos++;
    }
    
    public Circle(double novoRaio)
    {
        this.raio = novoRaio;
        numeroCirculos++;
    }     
    
    public double getArea(double raio)
    {
        return Math.PI*Math.pow(raio, 2);
    }
    
    public int getNum()
    {
        return numeroCirculos;
    }
    
}
