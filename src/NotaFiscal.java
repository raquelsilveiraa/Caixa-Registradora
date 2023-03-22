public class NotaFiscal{


    private String codigoNotaFiscal;
    private Funcionario operadorNome;
    private DadosBox dadosBox;
    private Compras Compras;



    public NotaFiscal(String codigoNotaFiscal, Funcionario operadorNome, DadosBox dadosBox,
    Compras Compras) {
    this.codigoNotaFiscal = codigoNotaFiscal;
    this.operadorNome = operadorNome;
    this.dadosBox = dadosBox;
    this.Compras = Compras;
}

    
    public String getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    public void setCodigoNotaFiscal(String codigoNotaFiscal) {
        this.codigoNotaFiscal = codigoNotaFiscal;
    }

    public Funcionario getOperadorNome() {
        return operadorNome;
    }


    public void setOperadorNome(Funcionario operadorNome) {
        this.operadorNome = operadorNome;
    }

    public DadosBox getDadosBox() {
        return dadosBox;
    }


    public void setDadosBox(DadosBox dadosBox) {
        this.dadosBox = dadosBox;
    }

    public Compras getCompras() {
        return Compras;
    }


    public void setCompras(Compras Compras) {
        this.Compras = Compras;
    }
        
  
     
    public void DadosNotaFiscal() {

    }
        
    public void formaDePagamento(){
        
    }

}