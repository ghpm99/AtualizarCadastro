/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atualizarcadastro;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qualidade
 */
public class TesteCertificados {
    public static void main(String[] args){
        File cert = new File("C:\\Users\\Qualidade\\Desktop\\certificado.txt");
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new InputStreamReader(new FileInputStream(cert)));
            String linha = null;
            
            while((linha = buffer.readLine()) != null){
                
                String[] token = linha.split(";");
                
                BufferedWriter escrever = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Emisor\\data\\" + token[0] + ".cert"))));
                
                for(String a : token){
                    escrever.write(a + "\n");
                }
                escrever.flush();
                escrever.close();
                System.out.println(token[0]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesteCertificados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TesteCertificados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
