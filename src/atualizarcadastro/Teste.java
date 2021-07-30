/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atualizarcadastro;

import java.io.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qualidade
 */
public class Teste {

    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Qualidade\\Desktop\\Banco.txt");
        BufferedReader ler = null;
        try {
            ler = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        String linha = null;
        try {
            while ((linha = ler.readLine()) != null) {
                String[] tokem = linha.split(";");
                File pasta = new File("C:\\Emisor\\PRODUTOS\\" + tokem[0].substring(0, 1) + "\\" + tokem[0] + ".txt");
                Properties pro = new Properties();
                try {
                    pro.load(new FileInputStream(pasta));
                } catch (Exception e) {
                    e.printStackTrace();
                    continue;
                }
                pro.setProperty("Norma", tokem[1]);
                pro.setProperty("Certificado", tokem[2]);
                pro.setProperty("q1", "C");
                pro.setProperty("q2", "Mn");
                //C;MN;S;P;Si;B;CR;NI;Mo;Fe;CU;Mg;AL;Sn
                pro.setProperty("q3", "S");
                pro.setProperty("q4", "P");
                pro.setProperty("q5", "Si");
                pro.setProperty("q6", "B");
                pro.setProperty("q7", "Cr");
                pro.setProperty("q8", "Ni");
                pro.setProperty("q9", "Mo");
                pro.setProperty("q10", "Fe");
                pro.setProperty("q11", "Cu");
                pro.setProperty("q12", "Mg");
                pro.setProperty("q13", "Al");
                pro.setProperty("q14", "Sn");

                for (int i = 1; i < 15; i++) {
                    pro.setProperty("v" + i, tokem[2 + i]);
                }
                pro.setProperty("f1", "Dureza");
                pro.setProperty("f2", "RESISTÊNCIA À TRAÇÃO");
                pro.setProperty("f3", "CARGA DE RUPTURA");
                pro.setProperty("f4", "LIMITE DE ESCOAMENTO");
                pro.setProperty("f5", "ALONGAMENTO");
                pro.setProperty("f6", "ESTRICÇÃO");
                pro.setProperty("f7", "CARGA DE PROVA");

                pro.setProperty("uf1", tokem[17]);
                pro.setProperty("vf1", tokem[18]);
                pro.setProperty("uf2", tokem[19]);
                pro.setProperty("vf2", tokem[20]);
                pro.setProperty("uf3", tokem[21]);
                pro.setProperty("vf3", tokem[22]);
                pro.setProperty("uf4", tokem[23]);
                pro.setProperty("vf4", tokem[24]);
                pro.setProperty("uf5", tokem[25]);
                pro.setProperty("vf5", tokem[26]);
                pro.setProperty("uf6", tokem[27]);
                pro.setProperty("vf6", tokem[28]);
                pro.setProperty("uf7", tokem[29]);
                pro.setProperty("vf7", tokem[30]);

                pro.store(new FileOutputStream(pasta), "Certificado do produto" + tokem[0]);
                System.out.println(pasta.getAbsolutePath());
            }
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
