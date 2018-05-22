/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author elsyc
 */
public class Binario implements Conversor {
    @Override
    public String convertir(int c){
        String bin = "";
        if(c>0){
            while(c>0){
                if(c%2 == 0){
                    bin = "0" + bin;
                }
                else{
                    bin = "1" + bin;
                }
                c= (int) c / 2;
            }
        }
        else if (c==0){
            bin = "0";
     }
        else {
            System.out.println("No es valido, intente de nuevo.");
        }
        return bin;
    }
}
