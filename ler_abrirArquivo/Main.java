package Estudos.ler_abrirArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("C:/Users/gabri/IdeaProjects/estudosNovos/arquivo_teste.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for(String linha: linhas){
            System.out.println(linha);
        }
    }
}
