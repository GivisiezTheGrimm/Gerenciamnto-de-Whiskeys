//Aluno: Claudiney Júnoior Givisiez Thomáz R.A.: 2266326

public class Informacoes {
    private int teor_alc;
    private float preco;

    public Informacoes(){
    
        teor_alc = 0;
        preco = 0;
    }

    //Métodos Getters
    public int getTeor(){
        return teor_alc;
    }

    public float getPreco(){
        return preco;
    }

    //Métodos Setters
    public void setTeor(int teor_alc) throws NumberNegException, PercentLimitException{   
        if(teor_alc > 0){
            if(teor_alc <= 100){
                this.teor_alc = teor_alc;
            }
            else{
                throw new PercentLimitException();
            }
        }
        else{
            throw new NumberNegException();
        }
    }

    public void setPreco(float preco) throws NumberNegException{
        if(preco > 0){
            this.preco = preco;
    
        }
        else{
            throw new NumberNegException();
        }
    }
}