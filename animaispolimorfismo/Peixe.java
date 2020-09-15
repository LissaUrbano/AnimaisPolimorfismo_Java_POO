public class Peixe extends Animal {
    
    //atributos
    private String corEscama;

    //metodos criados
    public void soltarBolhas(){
        System.out.println("Soltando bolha");
    }
    
    //metodos sobrescritos da classe mãe Animal
    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não faz som");
    }

    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
