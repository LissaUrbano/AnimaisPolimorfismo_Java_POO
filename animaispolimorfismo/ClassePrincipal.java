public class ClassePrincipal {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        a.alimentar();

        p.locomover();
        p.soltarBolhas();

        r.locomover();

        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();

        c.locomover();
        ca.emitirSom();
        ca.reagir(true);//utilizando sobrecarga
        ca.reagir(false);//utilizando sobrecarga
        ca.reagir(9); //utilizando sobrecarga
    }
}
