package LeituraEscritaArquivos;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
// Aprendizado criada outra classe main
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		
		ArrayList<String> Linhas = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Jogador " + i + ":");
			String nome  = scanner.nextLine();
			
			Linhas.add(nome);	
		}
		
		Path arquivo = Paths.get("E:/leitura/arquivo.txt");
		Files.write(arquivo, Linhas);
		
		scanner.close();
		System.out.println("Fim");

	}

}
