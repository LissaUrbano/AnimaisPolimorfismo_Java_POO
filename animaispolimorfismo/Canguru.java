public class Canguru extends Mamifero {
    
   //novo metodo
   public void usarBolsa(){
       System.out.println("Usando Bolsa");
   }

   //metodos sobrescritos da classe mãe Mamifero
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
