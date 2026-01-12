package Estudos.verificandoDiretorio_Arquivo;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        //verificar se é um diretório
        Path diretorio = Paths.get("C:/Users/gabri/IdeaProjects/estudosNovos");
        Path arquivo = Paths.get("C:/Users/gabri/IdeaProjects/estudosNovos/arquivo_teste.txt");

        if(Files.isDirectory(diretorio)){
            System.out.println("Diretório existe");
        }else{
            System.out.println("Diretório não existe");
        }

        if(Files.exists(arquivo)){
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não existe");
        }
    }
}
