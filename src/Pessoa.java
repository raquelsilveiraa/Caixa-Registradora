public class Pessoa {
    
    protected String nome;
    protected String sexo;
    protected String identidade;
    protected int cpf;
    Endereco end = new Endereco();
    
    
   public Pessoa()
   {
       
   }
    
    //Construtor
    public Pessoa(String nome, String sexo, String identidade, int cpf, Endereco end) {
        this.nome = nome;
        this.sexo = sexo;
        this.identidade = identidade;
        this.cpf = cpf;
        this.end = end;
    }
    
    //Gets
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getIdentidade() {
        return identidade;
    }

    public int getCpf() {
        return cpf;
    }

    public Endereco getEnd() {
        return end;
    }
    
    //Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    
}