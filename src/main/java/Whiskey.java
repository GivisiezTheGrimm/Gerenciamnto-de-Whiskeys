//Aluno: Claudiney Júnoior Givisiez Thomáz R.A.: 2266326

public class Whiskey {
        private int codigo;
    private String marca;
    private String origem;
    
    private Informacoes infos;


    //Método Construtor
    public Whiskey(){
        codigo = 0;
        marca = "";
        origem = "";
        infos = new Informacoes();
    }

    //Clonar objeto de forma distinta
    public Whiskey(Whiskey whis){
        this.codigo = 0;
        this.marca = "";
        this.origem ="";
        infos = new Informacoes();
    }

    //métodos de entrada
    public Informacoes getInfos(){
        return infos;
    }

    public void setInfos(Informacoes infos){
        this.infos = infos;
    }

    //Métodos Getters
    public int getCodigo(){
        return codigo;
    }

    public String getMarca(){
        return marca;
    }

    public String getOrigem(){
        return origem;
    }

    //Métodos Setters
    public void setCodigo(int codigo) throws NumberNegException{
        if(codigo > 0){
            this.codigo = codigo;
        }
        else{
            throw new NumberNegException();
        }
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setOrigem(String origem){
        this.origem = origem;
    }
}
