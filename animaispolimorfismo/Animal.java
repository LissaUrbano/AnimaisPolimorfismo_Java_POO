public abstract class Animal { //uma classe abstrata deve possuir métodos abstratos, vice e versa.

    //atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;

    //metodos abstratos de Animal que as filhas serao obrigadas a sobrescrever.
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //getters e setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
