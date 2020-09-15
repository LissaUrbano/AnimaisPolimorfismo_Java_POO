public class Ave extends Animal {
    
    //atributos
    private String corPena;

    //metodos criados
    public void fazerNinho(){
        System.out.println("construindo ninho");
    }

    //metodos sobrescritos da classe mãe Animal
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    //getters e setters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
   
}
