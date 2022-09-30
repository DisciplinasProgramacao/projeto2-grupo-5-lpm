public class App {
      
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo(10);

        BuscaProfundidade solucao = new BuscaProfundidade();
        solucao.buscaProfundidade();
    }
}
