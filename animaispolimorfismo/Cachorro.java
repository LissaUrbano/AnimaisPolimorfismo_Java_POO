public class Cachorro extends Mamifero {
    
    //metodos sobrescritos da classe mãe Mamifero
    @Override //polimorfismo de sobreposição(mantem a assinatura da classe mae)
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void reagir(String frase) { //polimorfismo de sobrecarga(na assinatura tem a quantidade e tipo de parametros sem repetir)
        if (frase.equals("toma comida")  || frase.equals("olá")) {
            System.out.println("abanar e latir");
        } else {
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora) { //polimorfismo de sobrecarga(na assinatura tem a quantidade e tipo de parametros sem repetir)
        if (hora < 12) {
            System.out.println("abanar");
        } else {
            System.out.println("ignorar");
        }
    }

    public void reagir(boolean dono) { //polimorfismo de sobrecarga(na assinatura tem a quantidade e tipo de parametros sem repetir)
        if (dono == true) {
            System.out.println("abanar");
        } else {
            System.out.println("rosnar");
        }
    }
}

