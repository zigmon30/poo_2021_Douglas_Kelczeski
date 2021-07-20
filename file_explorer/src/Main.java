import java.util.Scanner;

public class Main {
	static boolean imprime = true;
	static Dispositivo[] dispositivos = new Dispositivo[999];
	static int numDispositivo = 0;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useDelimiter("\r?\n");
		
		println("Gerenciador de Arquivos");
		while(true){
			
			menu();
			int opecao = ler.nextInt();
			
			if(opecao == 0){
				break;
			}
				
			if(opecao == 1){				
				Dispositivo dis = new Dispositivo();
				println("Nome do dispositivo de armazenamento: ");
				dis.nome = ler.next();
				dis.capacidade = ler.nextDouble();
				dis.capacidadeUsada = ler.nextDouble();
				
				dispositivos[numDispositivo] = dis;
				numDispositivo++;
			}
			
			if(opecao == 2){
				for(int indexDis = 0; indexDis < numDispositivo; indexDis++){
					println("Dispositivo[" + indexDis + "]: " + dispositivos[indexDis].nome + 
							" Capacidade...=> " + dispositivos[indexDis].capacidade + " Memoria usada...=> " +
							+ dispositivos[indexDis].capacidadeUsada + " Capacidade restante...=>" + dispositivos[indexDis].getCapacidadeRestante()
							+ "\n");
					println("------------------------------------------------------------------");
				}
			}
		}
		println("Você fechou o File Explorer \nAté a próxima ;)");
			
		
		

	}
	
	static void menu(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para inserir um dispositivo de armazenamento");
		println("(2) para listar os dispositivos atualmente no sistema");
		println("Digite sua opção:");
	}	
	
	
	static void menuAudio(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para inserir um aquivo de audio");
		println("(2) para listar os arquivos de audio atualmente no sistema");
		println("Digite sua opção:");
	}
	
	static void menuDispositivos(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para inserir um dispositivo de armazenamento");
		println("(2) para listar os dispositivos atualmente no sistema");
		println("Digite sua opção:");
	}
	
	static void menuDocumento(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para inserir um documento");
		println("(2) para listar os documentos atualmente no sistema");
		println("Digite sua opção:");
	}
	
	static void menuImagem(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para inserir uma imagem");
		println("(2) para listar as imagens atualmente no sistema");
		println("Digite sua opção:");
	}
	
	static void menuVideo(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para inserir um novo video");
		println("(2) para listar os videos atualmente no sistema");
		println("Digite sua opção:");
	}
	
	static void println(String conteudo) {
		if(imprime)
			System.out.println(conteudo);
		
	}

}





/*Dispositivo sa = new Dispositivo();
sa.nome = "HD Samsung Douglas";
sa.capacidade = 500;
sa.capacidadeUsada = 250;

Dispositivo sk = new Dispositivo();
sk.nome = "skan disk";
sk.capacidade = 16;
sk.capacidadeUsada = 5;

	
println("Dispositivo:....." + sa.nome + " Capacidade:....." + sa.capacidade + 
		" Espaço livre:....." + sa.getCapacidadeRestante() + "\npos mem: " + (sa));
println("_____________________________________________________________________"
		+ "___________________________\n");

println("Dispositivo:....." + sk.nome + " Capacidade:....." + sk.capacidade + 
        " Espaço livre:....." + sk.getCapacidadeRestante() + "\npos mem: " + (sa));
*/