public class Dados {
       private int id;
       private String nome;
       private float simpatia;
       private float elegancia;
       private float beleza;
       private float media;

       public void setId(int id){
                this.id = id;
       }

       public void setnome(String nome){
               this.nome = nome;
       }

       public void setSimpatia(float simpatia){
               this.simpatia = simpatia;
       }
       
       public void setElegancia(float elegancia){
               this.elegancia = elegancia;
       }

       public void setBeleza(float beleza){
                this.beleza = beleza;
       }

       public void setMedia(){
        this.media = ((this.elegancia*3)+(this.beleza*4)+this.simpatia)/8;
       }

       public int getId(){
                return this.id;
       }

       public String getnome(){
               return this.nome;
       }
       
       public float getSimpatia(){
               return this.simpatia;
       }
       
       public float getElegancia(){
               return this.elegancia;
       }    

         public float getBeleza(){
               return this.beleza;
       }
       
       public float getMedia(){
                return this.media;
       }
       
       public String toString(){
                return this.getnome() + " " + this.media + " ";
       }

       public String NometoString(){
                return this.getnome();
       }
}