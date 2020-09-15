public class Mamifero extends Animal{

    //atributos
    private String corPelo;

    //metodos sobrescritos da classe mãe Animal
    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    //getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    
}
