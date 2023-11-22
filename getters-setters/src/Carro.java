public class Carro {
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligou");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Comferindo cambio em P");
    }
}
