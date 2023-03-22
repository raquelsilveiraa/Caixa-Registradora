public class Produto {

    private String codigoDeBarras;
    private double preco;
    private int quantidade;
    private String marca;
    private String setor;
    private Compras Compras;
    
    //Construtor

    public Produto(String codigoDeBarras, double preco, int quantidade, String marca, String setor) {
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
        this.setor = setor;
    }
        
    //Get
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getSetor() {
        return setor;
    }
    
    public Compras getCompras() {
        return Compras;
    }

    //Set
    public void setCodigoDeBarras(String codigoDeBarras) {
        if(codigoDeBarras != " "){
            this.codigoDeBarras = codigoDeBarras;  
        }
    }

    public void setPreco(double preco) {
        if(preco > 0.0f){
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setCompras(Compras Compras) {
        this.Compras = Compras;
    }
        
        
        
    //Método
    public void ListarDados() {

    }

}