import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        int i = 1;
        
        ControleDados controle = new ControleDados();
        Incluir incluir =  new Incluir();
        Consultar consulta = new Consultar();
        Alterar alterar = new Alterar();
        Excluir excluir =  new Excluir();
        Relatorio relatorio = new Relatorio();
        while(opcao != 6){
           System.out.println("( 1 ) : Incluir\n ( 2 ) : Consultar\n ( 3 ) : Alterar\n ( 4 ) : Excluir\n ( 5 ) : Relatar\n ( 6 ) : Sair");
           opcao = Integer.parseInt(entrada.nextLine()); 
            while(opcao<1 || opcao>6){
                System.out.println("Opcao invalida, selecione outra: ");
                opcao = Integer.parseInt(entrada.nextLine()); 
            }
           if(opcao == 1){
               
                System.out.print("Nome:");
                String nome = entrada.nextLine();

                System.out.println("Simpatia:");
                String simpatiaString = entrada.nextLine();
                float  simpatia = Float.parseFloat(simpatiaString);
                while(simpatia<0 || simpatia>10){
                    System.out.println("Nota invalida, informe outra: ");
                    simpatiaString = entrada.nextLine();
                   simpatia = Float.parseFloat(simpatiaString);
                }

                System.out.println("Elegancia:");
                String eleganciaString = entrada.nextLine();
                float  elegancia = Float.parseFloat(eleganciaString);
                while(elegancia<0 || elegancia>10){
                    System.out.println("Nota invalida, informe outra: ");
                    eleganciaString = entrada.nextLine();
                     elegancia = Float.parseFloat(eleganciaString);
                }

                System.out.println("Beleza:");
                String belezaString = entrada.nextLine();
                float  beleza = Float.parseFloat(belezaString);
                while(beleza<0 || beleza>10){
                    System.out.println("Nota invalida, informe outra: ");
                      belezaString = entrada.nextLine();
                       beleza = Float.parseFloat(belezaString);
                }

                Dados dados = new Dados();
                dados.setId(i);
                dados.setnome(nome);
                dados.setSimpatia(simpatia);
                dados.setElegancia(elegancia);
                dados.setBeleza(beleza);
                dados.setMedia();
                incluir.inserir(dados, controle);
               i++;

           }else if(opcao == 2){
                System.out.println("Digite o id da candidata que quer consultar: ");
                int id = Integer.parseInt(entrada.nextLine()); 
                consulta.consulta(controle, id);

           }else if(opcao == 3){
                System.out.println("Digite o id da candidata que quer alterar: ");
                int id = Integer.parseInt(entrada.nextLine()); 
                consulta.consulta(controle, id);
                System.out.println("O que deseja alterar?\n1-Nome\n2-Nota de beleza\n3-Nota de simpatia\n4-Nota de elegancia\n5-Nao alterar");
                int opc = Integer.parseInt(entrada.nextLine()); 
                while(opc<1 || opc>5){
                    System.out.println("Opcao invalida, selecione outra: ");
                    opc = Integer.parseInt(entrada.nextLine()); 
                }
                if(opc != 5){
                    System.out.println("Insira o novo Dado: ");
                    String dado = entrada.nextLine();
                    alterar.alterDados(id, opc, dado, controle);   
                }

            }else if(opcao == 4){
                System.out.println("Digite o id da candidata que quer excluir: ");
                int id = Integer.parseInt(entrada.nextLine()); 
                consulta.consulta(controle, id);
                System.out.println("Deseja mesmo excluir esses dados? 1-sim 2-nao");
                int opc = Integer.parseInt(entrada.nextLine()); 
                while(opc<1 || opc>2){
                    System.out.println("Digite uma opcao valida 1-sim 2-nao");
                    opc = Integer.parseInt(entrada.nextLine()); 
                }
                if(opc==1)
                    excluir.excluir(id, controle);
                
            }else if(opcao == 5){
                relatorio.relatar(controle);
            }
        }
        controle.Mostrar();
    }   
}
