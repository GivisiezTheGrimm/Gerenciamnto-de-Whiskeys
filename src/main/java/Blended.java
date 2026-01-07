//Aluno: Claudiney Júnoior Givisiez Thomáz R.A.: 2266326

public class Blended extends Whiskey  implements Codigo{

    private boolean maltado;
    private String cereais;

    //Métodos construtor
        //Polimorfismo por sobrecarga
    public Blended(){
        maltado = false;
        cereais = "";
    }

    public Blended(boolean maltado, String cereais){
        this.maltado = maltado;
        this.cereais = cereais;
    }
    
    //Métodos Getter para heranca
    public boolean getMalte(){
        return maltado;        
    }

    public String getCereais(){
        return cereais;
    }

    //Métodos Setter para herenca
    public void setMalte(boolean maltado){
        this.maltado = maltado;
    }

    public void setCereais(String cereais){
        this.cereais = cereais;
    }

    public void impCodigo(){
        System.out.println("-> Código do produto: ");
    }
    

}
