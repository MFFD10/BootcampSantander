public class AppRegistraCarros {
    public static void main(String[] args) {
        LojaCarros uno = new LojaCarros();
        LojaCarros celta = new LojaCarros();
        LojaCarros gol = new LojaCarros();

        uno.setMarca("Fiat Uno");
        celta.setMarca("Chevrolet Celta");
        gol.setMarca("Volksvagem Gol");

        System.out.println(uno.getMarca());

        System.out.println("Contador: "+LojaCarros.getQuantidadedeCarros());
    }
}
