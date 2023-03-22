
import java.util.Scanner;


public class Main {
    public static void cls()
    {
            for(int i = 0; i < 50; i++)
            System.out.println("");
    }
    public static void imprimeMenu(){
        System.out.println("-- Menu do Usuário -- ");
        System.out.println("1. Inicilizar Sistema");
        System.out.println("2. Ver dados cadastrais.");
        System.out.println("0. Sair do sistema.");
        System.out.printf("Digite a opção desejada: ");
    }
        
    public static double passarCompras() throws InterruptedException{
        try (Scanner leitor = new Scanner(System.in)) {
            int resposta3;
            int quantidade;
            double total = 0;
            do{
                cls();
                System.out.println("Para Encerrar a compra digite 0;");
                System.out.println("1- Guaraná Antartica 2- Miojo Nissin  3- Pippo's 4- Biscoito Treloso 5-Sabonete Dove 6-Peito de Frango");
                System.out.println("Digite o codigo de Barras do Produto: ");
                resposta3 = leitor.nextInt();
                switch(resposta3){
                    case 1:
                        System.out.println("Guaraná - R$5,00");
                        System.out.printf("Quantidade: ");
                        quantidade = leitor.nextInt();
                        total += 5.00*quantidade;
                        break;
                    case 2:
                        System.out.println("Miojo Nissin - R$1,50");
                        System.out.printf("Quantidade: ");
                        quantidade = leitor.nextInt();
                        total += 1.50*quantidade;
                        break;
                    case 3:
                        System.out.println("Pippo's - R$3,39");
                        System.out.println("Quantidade: ");
                        quantidade = leitor.nextInt();
                        total += 5.00*quantidade;
                        break;
                    case 4:
                        System.out.println("Biscoito Treloso - R$2,00");
                        System.out.println("Quantidade: ");
                        quantidade = leitor.nextInt();
                        total += 2.00*quantidade;
                        break;
                    case 5:
                        System.out.println("Sabonete Dove - R$1,00");
                        System.out.println("Quantidade: ");
                        quantidade = leitor.nextInt();
                        total += quantidade*1.00;
                        break;
                    case 6:
                        System.out.println("Peito de Frango - R$19,90");
                        System.out.println("Quantidade: ");
                        quantidade = leitor.nextInt();
                        total += 19.90*quantidade;
                        break;
                    case 0:
                        System.out.println("Fechando a Compra...");
                        Thread.sleep(2000);
                        break;
                    default:
                        System.out.println("CODIGO DE PRODUTO INVÁLIDO!");
                        Thread.sleep(2000);
                }
            }while(resposta3 != 0);
            return total;
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        
        Funcionario F1 = new Funcionario();
        Endereco EndF1 = new Endereco();
        Cliente C1 = new Cliente();
        
        
        
        try (Scanner leitor = new Scanner(System.in)) {
            String usuario;
            String senha;
            int resposta1, resposta2;
            double total = 0.0;
            
            C1.setComprovante_de_renda("R$ 1000");
            C1.setComprovante_de_residencia("Rua Rosendo Pereira de Lucena");
            C1.setTotal_das_compras_realizadas(3000);
            
            
            EndF1.setBairro("Centro");
            EndF1.setCep(45678900);
            EndF1.setNumero_casa(89);
            EndF1.setCidade("Campina Grande");
            EndF1.setRua("Amadeu Batista");
            F1.setIdentidade("PB 12345");
            F1.setEnd(EndF1);
            F1.setCpf(123456789);
            F1.setNcarteiratrabalho("PB-18456789");
            F1.setSexo("Masculino");
            F1.setNome("Flávio José");
            F1.setUsuario_cadastrado("Flavio Jose");
            F1.setSenha_cadastrada("516281");
            
            
            do{
                cls();
                System.out.println("Bem vindo ao Mercado Box");
                System.out.println("Usuário: ");
                usuario = leitor.nextLine();
                F1.setNomeUser(usuario);
            
                System.out.println("Senha: ");
                senha = leitor.nextLine();
                F1.setSenha(senha);
                if(F1.FazerLogin1()==false){
                    System.out.println("Usuário ou senha inválido! Digite Novamente:");
                    Thread.sleep(2000);
                }
            }while(F1.FazerLogin1()==false);
            
            if(F1.FazerLogin1()==true)
            {
                do{
                    cls();
                    System.out.println("Bem vindo ao sistema!");
                    imprimeMenu();
                    resposta1 = leitor.nextInt();
                    switch(resposta1){
                        case 1:
                            cls();
                            System.out.println("CAIXA ABERTO!");
                            System.out.println("Imprimindo código de barras....");
                            Thread.sleep(4000);
                            total = passarCompras();
                            cls();
                            System.out.println("Total a Pagar: R$" + total);
                            C1.RealizarPagamento(total);
                            System.out.println("Obrigado por utilizar o sistema!");
                            Thread.sleep(5000);
                            break;
                        case 2:
                            do{
                                cls();
                                F1.VerDadosCadastrais();
                                System.out.println("Deseja voltar ao menu anterior? (1 - SIM/0 - NÃO)");
                                resposta2 = leitor.nextInt();
                            }while(resposta2 != 1);
                            break;
                        case 0:
                            cls();
                            System.out.println("Saindo do Sistema...");
                            Thread.sleep(2000);
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA!");
                    }
                }while(resposta1 != 0);
            }
        }  
            
              
    }
}
