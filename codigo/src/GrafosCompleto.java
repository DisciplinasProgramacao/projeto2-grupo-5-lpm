public class GrafosCompleto extends Grafo {

    private ABB<Aresta> arestas;    
    public int ordem;

    public GrafosCompleto(String nome) {
        super(nome);
    }

    /**
     * n é o quantidade do Vertice
     * 
     * @param n
     * @return
     */
    public boolean completo(int n) {
        if (n * (n - 1) / 2 == this.arestas.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Aresta existeAresta(int verticeA, int verticeB) {
        return super.existeAresta(verticeA, verticeB);
    }

    @Override
    public Vertice existeVertice(int idVertice) {
        return super.existeVertice(idVertice);
    }

    public boolean euleriano() {
        return false;
    }

    public Grafo subGrafo(Lista<Vertice> vertices) {
        Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);
        return subgrafo;
    }

}
