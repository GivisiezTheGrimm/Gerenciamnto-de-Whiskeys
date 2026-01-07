//Aluno: Claudiney Júnoior Givisiez Thomáz R.A.: 2266326

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadData {
    public String importData(String rotulo){

        System.out.println(rotulo);

        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(keyboard);

        String ret = "";

        try{
            ret = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\nSystem Error: Keybord");
        }
        return ret;
    }
}
