public class Reptil extends Animal {

    //atributos    
    private String corEscama;
    
    //metodos sobrescritos da classe mãe Animal
    @Override
	public void locomover() {
		System.out.println("rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
	}

    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
