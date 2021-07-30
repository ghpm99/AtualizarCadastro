/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atualizarcadastro;

/**
 *
 * @author Qualidade
 */
public class codigo {

    public static void main(String[] args) {
        String[] bito = {"3/16", "1/4", "5/16", "3/8", "7/16", "1/2", "5/8"};
        String[] com = {"3/4", "1", "1.1/4", "1.1/2", "1.3/4", "2", "2.1/4", "2.1/2", "2.3/4", "3", "3.1/4", "3.1/2", "4", "4.1/2", "5", "5.1/2", "6", "6.1/2", "7", "7.1/2", "8", "8.1/2", "9", "9.1/2", "10", "11", "12"};
        
        String[] bito2 = {"316", "14", "516", "38", "716", "12", "58"};
        String[] com2 = {"34", "1", "114", "112", "134", "2", "214", "212", "234", "3", "314", "312", "4", "412", "5", "512", "6", "612", "7", "712", "8", "812", "9", "912", "10", "11", "12"};
        
        for(int i = 0; i < bito.length; i++){
            for(int b = 0; b < com.length;b++){
                System.out.println("2230" + bito2[i] + com2[b] + ";" +bito[i] + "x" + com[b] +  ";");
            }
        }
    
    }
}
