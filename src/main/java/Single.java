//Aluno: Claudiney Júnoior Givisiez Thomáz R.A.: 2266326

public class Single extends Whiskey implements Codigo{
    
    private String cereal;
    private boolean premium;
    private int temp_envel;

    //Método construtor
        //Polimorfismo por sobrecarga
    public Single(){
        cereal = "";
        premium = false;
        temp_envel = 0;
    }

    public Single(String cereal , boolean premium, int temp_envel){
        this.cereal = cereal;
        this.premium = premium;
        this.temp_envel = temp_envel;
    }

    //Métodos Getters
    public String getCereal(){
        return cereal;
    }

    public boolean getPremium(){
        return premium;
    }

    public int getTempEnvel(){
        return temp_envel;
    }

    //Métodos setter
    public void setCereal(String cereal){
        this.cereal = cereal;
    }

    public void setPremium(boolean premium){
        this.premium = premium;
    }

    public void setTempEnvel(int temp_envel) throws NumberNegException{
        if(temp_envel >= 0){
            this.temp_envel = temp_envel;
    
        }
        else {
            throw new NumberNegException();
        }
    }
    public void impCodigo(){
        System.out.println("Codigo do produto...; ");
    }
}
