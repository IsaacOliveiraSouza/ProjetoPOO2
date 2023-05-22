import javax.xml.transform.Source;

public class ControleDados {
    private Dados[] dados = new Dados[100];
    private int total = 0;  
      
    public void adiciona(Dados elem) {    
         this.dados[this.total] = elem;
         this.total++;
    }
    
    public void Mostrar(){
           String s = " ";
           int posicao=1;
           for(int i=0;i<=this.total-1;i++){
            if(i>0){
                if(this.dados[i].getMedia() == this.dados[i-1].getMedia()){
                    posicao--;
                    System.out.println(posicao +"° posição: "+ this.dados[i].getnome() +" media: " + this.dados[i].getMedia());
                }else{
                    System.out.println(posicao +"° posição: "+ this.dados[i].getnome() +" media: " + this.dados[i].getMedia());            
                }
            }else{
                System.out.println(posicao +"° posição: "+ this.dados[i].getnome() +" media: " + this.dados[i].getMedia());      
       
            }
               posicao++;           
            }
    }
      
    public void Consultar(int id){
        for(int i=0;i<=total-1;i++){ 
            if(dados[i].getId() == id){
                System.out.println("Nome: " +  this.dados[i].getnome());
                System.out.println("Nota de beleza: " +  this.dados[i].getBeleza());
                System.out.println("Nota de elegancia: " +  this.dados[i].getElegancia());
                System.out.println("Nota de simpatia: " +  this.dados[i].getSimpatia());
                System.out.println("Media: " +  this.dados[i].getMedia());
            }
        }
    }

    public void Alterar(int id, int opc, String novoDdado){
            id--;
            if(opc==1){
                dados[id].setnome(novoDdado);
            }else if(opc == 2){
                float  beleza = Float.parseFloat(novoDdado);
                dados[id].setBeleza(beleza);     
            }else if(opc == 3){
                float  simpatia = Float.parseFloat(novoDdado);
                dados[id].setSimpatia(simpatia);
            }else{
                float  elegancia = Float.parseFloat(novoDdado);
                dados[id].setElegancia(elegancia);
            }
            System.out.println("Alterado com sucesso");

    }
// | | | |  | | |
    public void Excuir(int id){
        for(int i=0;i<this.total;i++){
            if(id ==  this.dados[i].getId()){
                for(int cont=i;cont < this.total-1;cont++){
                    Dados novoDado =  this.dados[cont];
                    this.dados[cont] = this.dados[cont+1];
                    this.dados[cont+1] = novoDado;
                }
                this.total--;
            }
        }
        System.out.println("Excluido com sucesso");
    }

    public void Relatar(){
        Dados aux = new Dados();
        for(int i = 0; i<this.total; i++){
            for(int j = 0; j<this.total-1; j++){
                if(dados[j].getMedia() <dados[j+1].getMedia()){
                    aux = dados[j];
                    dados[j] = dados[j+1];
                    dados[j+1] = aux;
                }
            }
        }
        Mostrar();
    }
       
}
