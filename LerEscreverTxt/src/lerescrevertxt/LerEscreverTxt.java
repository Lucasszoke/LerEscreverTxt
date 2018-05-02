package lerescrevertxt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LerEscreverTxt {

    public static void main(String[] args) throws FileNotFoundException {
        lerTxt("saida.txt");
        escreverTxt("saida.txt");
    }
    
    static void lerTxt(String caminho) throws FileNotFoundException{
        InputStream arquivo = new FileInputStream(caminho);
        int i = 0;
        String[] linha = new String[1];
        Scanner sc = new Scanner(arquivo);
        while (sc.hasNextLine()) {
            linha[i] = sc.nextLine();
            System.out.println(linha[i]);
            i++;
            linha = new String[i + 1];
        }
    }
    
    static void escreverTxt(String saida) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        String anotar = "";
        FileOutputStream arquivo = new FileOutputStream(saida);
        PrintStream printStream = new PrintStream(arquivo);
        char alfabeto = 'A';
        
        for (int i = 0; i < 26; i++) {
            //anotar = sc.nextLine();
            printStream.println(alfabeto);
            alfabeto++;
        }
    }
}
