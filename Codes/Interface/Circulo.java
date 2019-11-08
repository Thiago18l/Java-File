public class Circulo implements FormaGeometrica{

    private int raio;

    public Circulo(){
        this.raio = 0;
    }
    
    public Circulo(int raio){
        setRaio(raio);
    }

    @Override
    public void CalcularPerimetro(){
        System.out.println("A circuferência do circulo é: "+Math.pow((Math.PI), 2)*this.raio);
    }
    @Override
    public void AreaForma(){
        System.out.println("A area do Circulo é: " + Math.PI*(Math.pow(this.raio, 2)));
    }

    public void setRaio(int raio){
        this.raio = raio;
    }
    public int getRaio(){
        return this.raio;
    }

}