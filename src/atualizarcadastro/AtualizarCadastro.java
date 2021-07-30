/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atualizarcadastro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Qualidade
 */
public class AtualizarCadastro {

    /**
     * @param args the command line arguments
     */
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here       
        System.out.println("Escolha a opcao:");
        System.out.println("A = Atualizar, I = Incluir, S = Sair:");
        String escolha = s.next();
        escolha = escolha.toLowerCase();
        if (escolha.equals("a")) {
            atualizar();
        } else if (escolha.equals("i")) {
            incluir();
        } else {
            System.out.println("Saindo");
        }

    }

    private static void atualizar() {
        System.out.println("Escolha o modo para atualizar:");
        System.out.println("S = Simples, C = Completo");
        String escolha = s.next();
        escolha = escolha.toLowerCase();
        if (escolha.equals("s")) {
            atualizarSimples();
        } else if (escolha.equals("c")) {
            atualizarCompleto();
        } else {
            System.out.println("Saindo");
        }
    }

    private static void atualizarSimples() {
        System.out.println("Digite o codigo do produto:");
        String codigo = s.next();
        Properties pro = new Properties();
        File registro = new File("C:\\Emisor\\PRODUTOS\\" + codigo.substring(0, 1) + "\\" + codigo + ".txt");
        try {
            pro.load(new FileInputStream(registro));
        } catch (IOException ex) {
            System.out.println("Arquivo nao existe");
        }
        System.out.println("Item: " + pro.getProperty("Descricao"));
        System.out.println("Digite a propriedade( \\all para ajuda):");
        String propriedade = s.next();

        if (propriedade.equals("\\all")) {
            listarPropriedades();
        }

    }

    private static void listarPropriedades() {
        System.out.println("f7=\n"
                + "f6=\n"
                + "f5=\n"
                + "f4=\n"
                + "f3=\n"
                + "f2=\n"
                + "f1=\n"
                + "Codigo=\n"
                + "Unidade= \n"
                + "q14=\n"
                + "q13=\n"
                + "q12=\n"
                + "q11=\n"
                + "q10=\n"
                + "Norma=\n"
                + "vf7=\n"
                + "vf6=\n"
                + "vf5=\n"
                + "vf4=\n"
                + "vf3=\n"
                + "vf2=\n"
                + "q9=\n"
                + "vf1=\n"
                + "q8=\n"
                + "q7=\n"
                + "q6=\n"
                + "q5=\n"
                + "q4=\n"
                + "uf7=\n"
                + "q3=\n"
                + "uf6=\n"
                + "q2=\n"
                + "uf5=\n"
                + "q1=\n"
                + "uf4=\n"
                + "uf3=\n"
                + "uf2=\n"
                + "Certificado=\n"
                + "uf1=\n"
                + "v14=\n"
                + "v13=\n"
                + "v12=\n"
                + "v11=\n"
                + "v10=\n"
                + "Descricao=\n"
                + "v9=\n"
                + "v8=\n"
                + "v7=\n"
                + "v6=\n"
                + "v5=\n"
                + "v4=\n"
                + "v3=\n"
                + "v2=\n"
                + "v1=");
    }

    private static void atualizarCompleto() {

    }

    private static void incluir() {

    }
}
