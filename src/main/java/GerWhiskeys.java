//Aluno: Claudiney Júnior Givisiez Thomáz R.A.: 2266326

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerWhiskeys{
    
    private static ReadData read = new ReadData();
    private static Blended blend;
    private static Single single;

    private static List<Blended> bdBlend = new ArrayList<Blended>();
    private static List<Single> bdSingle = new ArrayList<Single>();
    
    public List<Blended> getBdBlend(){
        return bdBlend;
    }
    
    public List<Single> getBdSingle(){
        return bdSingle;
    }

    public static void main(String arg[]){

         
    }// end main


    public static Blended cadBlend(Blended blend){
        /*boolean index = true;
        while(index){
            try{    
                blend.setCodigo(Integer.parseInt(read.importData("\nEntre com o codigo do produto: ")));
                index = false;
            }
            catch(NumberNegException nne){
                nne.impNumbNeg();
            }
            if(consBlendCodigo(blend) != null){
                System.out.println("\nErro!\nCodigo do produto ja cadastrado");
                return null;  
            } 
        }
        index = true;

        blend.setMarca(read.importData("\nEntre com a marca do produto: "));
        blend.setOrigem(read.importData("\nEntre com a origem o produto: "));

        while(index){
            try{
                blend.getInfos().setPreco(Float.parseFloat(read.importData("\nInforme o preco do produto: ")));
                index = false;
            }
            catch(NumberNegException nne){
                nne.impNumbNeg();
            }
        }
        index = true;

        while(index){
            try{
                blend.getInfos().setTeor(Integer.parseInt(read.importData("\nInforme o teor alcoolico do produto: ")));
                index = false;
            }

            catch(NumberNegException nne){
                nne.impNumbNeg();
            }
            catch(PercentLimitException ple){
                ple.impTeorLimit();
            }
            catch(NumberFormatException nfe){
                System.out.println("\n\tErro:O teor alcoolico nao pode conter caracteres fora do tipo inteiro");
            }
        }
        index = true;
    
        String malte = read.importData("\n\nInforme de o produto é feito por graos maltados <s/n>: ");
        if(malte.equals("n")){
            blend.setMalte(false);

        }
        else{blend.setMalte(true);}                
        blend.setCereais(read.importData("\nInforme o cereal utilizado no produto: "));*/
        
        if(consBlendCodigo(blend) == null){
            System.out.println("\n\n Produto cadastrado!\n");
            blend.impCodigo();
            bdBlend.add(blend);
            return blend;
        }
        else{
            return null;
        }
            /*System.out.println("   " + blend.getCodigo() + "\n");
        System.out.println("Marca: \t\t\t" + blend.getMarca());
        System.out.println("Origem: \t\t" + blend.getOrigem());
        System.out.println("Preco: \t\t\t" + blend.getInfos().getPreco() + " R$");
        System.out.println("Teor alcoolico: \t" + blend.getInfos().getTeor() + "%");
        System.out.println("Maltado: \t\t" + blend.getMalte());
        System.out.println("Grao: \t\t\t" + blend.getCereais());*/
    }



    public static Single cadSingle(Single single){
        /*boolean index = true;
        while(index){
            try{
                single.setCodigo(Integer.parseInt(read.importData("\nEntre com o codigo do produto: ")));
                index = false;
            }
            catch(NumberNegException nne){
                nne.impNumbNeg();
            }
            if(consSingleCodigo(single) != null){
                System.out.println("\nErro!\nCodigo do produto ja cadastrado");
                return null;  
            } 
        }
        index = true;

        single.setMarca(read.importData("\nEntre com a marca do produto: "));
        single.setOrigem(read.importData("\nEntre com a origem o produto: "));
    
    
        while(index){
            try{
                single.getInfos().setPreco(Float.parseFloat(read.importData("\nInforme o preco do produto: ")));
                index = false;
            }
            catch (NumberNegException nne){
                nne.impNumbNeg();
            }
        }
        index = true;

        while(index){
            try{
                single.getInfos().setTeor(Integer.parseInt(read.importData("\nInformo o teor alcoolico do produto: ")));
                index = false;
            }
            catch(NumberNegException nne){
                nne.impNumbNeg();
            }
            catch(PercentLimitException ple){
                ple.impTeorLimit();
            }
            catch(NumberFormatException nfe){
                System.out.println("\n\tErro:O teor alcoolico nao pode conter caracteres fora do tipo inteiro.");
            }
            }
            index = true;

            single.setCereal(read.importData("\nInforme o cereal utilizado na fabricação do produto: "));
            String premium = read.importData("\nInforme se o produto e premium <s/n>: ");
            if(premium.equals("n")){
                single.setPremium(false);
            }
            else {
                single.setPremium(true);
            }
    
            while(index){
               try{
                    single.setTempEnvel(Integer.parseInt(read.importData("\nInforme o tempo de envelhecimento do produto em meses: ")));
                    index = false;
                }
                catch(NumberNegException nne){
                    nne.impNumbNeg();
                }
        }
        index = true;*/
        if(consSingleCodigo(single)== null){
            System.out.println("\n\n Produto cadastrado!\n");
            single.impCodigo();
            bdSingle.add(single);
            return single;
        }
        else{
            return null;
        }
            /*System.out.println("   " + single.getCodigo() + "\n");
        System.out.println("Marca: \t\t\t\t" + single.getMarca());
        System.out.println("Origem: \t\t\t" + single.getOrigem());
        System.out.println("Preco: \t\t\t\t" + single.getInfos().getPreco() + " R$");
        System.out.println("Teor alcoolico: \t\t" + single.getInfos().getTeor() + "%");
        System.out.println("Grao: \t\t\t\t" + single.getCereal());
        System.out.println("Premium: \t\t\t" + single.getPremium());
        System.out.println("Tempo de envelheciemnto: \t" + single.getTempEnvel() + " meses");*/
    }

    public static void impBDblended(){

        System.out.println("\n\n\t\tProdutos BLENDED cadastrados\n");
        for(int i = 0; i < bdBlend.size(); i++){
            bdBlend.get(i).impCodigo();
            System.out.print("   " + bdBlend.get(i).getCodigo() + "\n");
            System.out.println("Marca: \t\t\t" + bdBlend.get(i).getMarca());
            System.out.println("Origem: \t\t" + bdBlend.get(i).getOrigem());
            System.out.println("Preco: \t\t\t" + bdBlend.get(i).getInfos().getPreco() + " R$");
            System.out.println("Teor alcoolico: \t" + bdBlend.get(i).getInfos().getTeor() + "%");
            System.out.println("Maltado: \t\t" + bdBlend.get(i).getMalte());
            System.out.println("Grao: \t\t\t" + bdBlend.get(i).getCereais());
            System.out.println("\n");
        }
    }


    public static void impBDsingle(){

        System.out.println("\n\n\t\tProdutos SINGLE cadastrados\n");
        for(int i = 0; i<bdSingle.size(); i++){
            bdSingle.get(i).impCodigo();
            System.out.print("   " + bdSingle.get(i).getCodigo() + "\n");
            System.out.println("Marca: \t\t\t\t" + bdSingle.get(i).getMarca());
            System.out.println("Origem: \t\t\t" + bdSingle.get(i).getOrigem());
            System.out.println("Preco: \t\t\t\t" + bdSingle.get(i).getInfos().getPreco() + " R$");
            System.out.println("Teor alcoolico: \t\t" + bdSingle.get(i).getInfos().getTeor() + "%");
            System.out.println("Grao: \t\t\t\t" + bdSingle.get(i).getCereal());
            System.out.println("Premium: \t\t\t" + bdSingle.get(i).getPremium());
            System.out.println("Tempo de envelheciemnto: \t" + bdSingle.get(i).getTempEnvel() + " meses");
            System.out.println("\n");
        }
    }

    public static Blended consBlendCodigo(Blended blend){
        for(int i = 0; i < bdBlend.size(); i++){
            if(blend.getCodigo() == bdBlend.get(i).getCodigo())
                return bdBlend.get(i);
        }   
        return null;
    }

    public static Single consSingleCodigo(Single single){

        for(int i = 0; i < bdSingle.size(); i++){
            if(bdSingle.get(i).getCodigo() == single.getCodigo())
                return bdSingle.get(i);
        }
        return null;
    }

    public static Blended consBlendMarca(Blended blend){
        String consMarc = read.importData("Qual marca deseja consutar?");

        for(int i = 0; i < bdBlend.size(); i++){
            if(bdBlend.get(i).getMarca().equals(consMarc))
                return bdBlend.get(i); 
        }
        return null;
    }

    public static Single consSingleMarca(Single single){
        String consMarc = read.importData("Qual marca deseja consutar?");

        for(int i = 0; i < bdSingle.size(); i++){
            if(bdSingle.get(i).getMarca().equals(consMarc))
                return bdSingle.get(i); 
        }
        return null;
    }

    public Blended altPrecoBlend(Blended blend){

        for(int i = 0; i < bdBlend.size(); i++){
            if(bdBlend.get(i).getCodigo() == blend.getCodigo()){
                //String marca = JOptionPane.showInputDialog(null,"Informe a marca: ","Alteração de cadastro", 1);
                //blend.setMarca(marca);
                try{
                    int preco = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o preco: ","Alteracao de preco", 1));
                    blend.getInfos().setPreco(preco);
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "O preco deve ser um valor inteiro", "Erro de formato de entrada", 0);
                }catch(NumberNegException nne){
                    JOptionPane.showMessageDialog(null, "O preco deve ser um valor positivo", "Erro de formato de entrada", 0);
                }
            }
        }
        return null;
    }

    public Single altPrecoSingle(Single single){

        for(int i = 0; i < bdSingle.size(); i++){
            if(bdSingle.get(i).getCodigo() == single.getCodigo()){
                try{
                    int preco = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o preco: ","Alteracao de preco", 1));
                    single.getInfos().setPreco(preco);
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "O preco deve ser um valor inteiro", "Erro de formato de entrada", 0);
                }catch(NumberNegException nne){
                    JOptionPane.showMessageDialog(null, "O preco deve ser um valor positivo", "Erro de formato de entrada", 0);
                }
            }
        }
        return null;
    }


    public static Blended delBlend(Blended blend){
        blend = consBlendCodigo(blend);
        if(blend != null){
            bdBlend.remove(blend);
            return null;
        }else{return blend;}
    }


    public static Single delSingle(Single single){
        single = consSingleCodigo(single);
        if(single != null){
            bdSingle.remove(single);
            return null;
        }else{return single;}
        
    }
    

  }// end class
