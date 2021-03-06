import java.util.Scanner;

public class Main {
	static boolean imprime = true;
	static Dispositivo[] dispositivos = new Dispositivo[999];
	static Audio[] audios = new Audio[999];
	static Documento[] textos = new Documento[999];
	static Imagem[] imagens = new Imagem[999];
	static Video[] videos = new Video[999];
	
	static int numDispositivo = 0;
	static int numArquivoAudio = 0;
	static int numDocumentoTexto = 0;
	static int numArquivoImagem = 0;
	static int numArquivoVideo = 0;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useDelimiter("\r?\n");
		
		
		while(true){
			
			menu();
			
			int opecao = ler.nextInt();
			
			if(opecao == 0){
				break;
			}
				
			if(opecao == 1){
				while(true) {
					menuDispositivo();
					
					int opecaoDis = ler.nextInt();
					
					if(opecaoDis == 0){
						break;
					}
					
					if(opecaoDis == 1){
						Dispositivo dis = new Dispositivo();
						println("Nome do dispositivo de armazenamento: ");
						dis.nome = ler.next();
						dis.capacidade = ler.nextDouble();
						dis.capacidadeUsada = ler.nextDouble();
					
						dispositivos[numDispositivo] = dis;
						numDispositivo++;
					}
					
					if(opecaoDis == 2) {
						for(int indexDis = 0; indexDis < numDispositivo; indexDis++){
							println("Dispositivo[" + indexDis + "]: " + dispositivos[indexDis].nome + 
									" Capacidade...=> " + dispositivos[indexDis].capacidade + " Memoria usada...=> " +
									+ dispositivos[indexDis].capacidadeUsada + " Capacidade restante...=>" + dispositivos[indexDis].getCapacidadeRestante()
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}
					
				
				}
				
									
			}
			
			if(opecao == 2){
				while(true) {
					menuAudio();
					
					int opecaoDis = ler.nextInt();
					
					if(opecaoDis == 0){
						break;
					}
					
					if(opecaoDis == 1){
						Audio aud = new Audio();
						println("Nome do Arquivo de Audio: ");
						aud.nome = ler.next();
						println("Formato: ");
						aud.formato = ler.next();
						println("Tamanho Arquivo: ");
						aud.tamanho = ler.nextDouble();
						println("Arquivo de Audio convertido para formato .mp3 disponivel pelo gerenciador de arquivo : ");
					
						audios[numArquivoAudio] = aud;
						numArquivoAudio++;
					}
					
					if(opecaoDis == 2) {
						for(int indexDis = 0; indexDis < numArquivoAudio; indexDis++){
							println("Audio[" + indexDis + "]: " + audios[indexDis].nome + 
									" Formato...=> "  + audios[indexDis].getFormatarAudio() + " Tamanho do arquivo...=> " +
									+ audios[indexDis].tamanho
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}
					
				
				}
				
									
			}
			
			if(opecao == 3){
				while(true) {
					menuDocumentoDeTexto();
					
					int opecaoDis = ler.nextInt();
					
					if(opecaoDis == 0){
						break;
					}
					
					if(opecaoDis == 1){
						Documento doc = new Documento();
						println("Nome do Arquivo de Texto: ");
						doc.nome = ler.next();
						println("Formato: ");
						doc.formato = ler.next();
						println("Tamanho Arquivo: ");
						doc.tamanho = ler.nextDouble();
						println("Arquivo de texto convertido para formato .txt disponivel pelo gerenciador de arquivo : ");
					
						textos[numDocumentoTexto] = doc;
						numDocumentoTexto++;
					}
					
					if(opecaoDis == 2) {
						for(int indexDis = 0; indexDis < numDocumentoTexto; indexDis++){
							println("Arquivo[" + indexDis + "]: " + textos[indexDis].nome + 
									" Formato...=> "  + textos[indexDis].getFormatarDocumento() + " Tamanho do arquivo...=> " +
									+ textos[indexDis].tamanho
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}
					
				
				}
				
									
			}
			if(opecao == 4){
				while(true) {
					menuImagem();
					
					int opecaoDis = ler.nextInt();
					
					if(opecaoDis == 0){
						break;
					}
					
					if(opecaoDis == 1){
						Imagem img = new Imagem();
						println("Nome do Arquivo de Imagem: ");
						img.nome = ler.next();
						println("Formato: ");
						img.formato = ler.next();
						println("Tamanho Arquivo: ");
						img.tamanho = ler.nextDouble();
						println("Arquivo de imagem convertido para formato .jpg disponivel pelo gerenciador de arquivo : ");
					
						imagens[numArquivoImagem] = img;
						numArquivoImagem++;
					}
					
					if(opecaoDis == 2) {
						for(int indexDis = 0; indexDis < numArquivoImagem; indexDis++){
							println("Imagem[" + indexDis + "]: " + imagens[indexDis].nome + 
									" Formato...=> "  + imagens[indexDis].getFormatarImagem() + " Tamanho do arquivo...=> " +
									+ imagens[indexDis].tamanho
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}
					
				
				}
				
									
			}
			if(opecao == 5){
				while(true) {
					menuVideo();
					
					int opecaoDis = ler.nextInt();
					
					if(opecaoDis == 0){
						break;
					}
					
					if(opecaoDis == 1){
						Video vid = new Video();
						println("Nome do Arquivo de Video: ");
						vid.nome = ler.next();
						println("Formato: ");
						vid.formato = ler.next();
						println("Tamanho Arquivo: ");
						vid.tamanho = ler.nextDouble();
						println("Arquivo de video convertido para formato .mkv disponivel pelo gerenciador de arquivo : ");
					
						videos[numArquivoVideo] = vid;
						numArquivoVideo++;
					}
					
					if(opecaoDis == 2) {
						for(int indexDis = 0; indexDis < numArquivoVideo; indexDis++){
							println("Video[" + indexDis + "]: " + videos[indexDis].nome + 
									" Formato...=> "  + videos[indexDis].getFormatarVideo() + " Tamanho do arquivo...=> " +
									+ videos[indexDis].tamanho
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}
					
				
				}
				
									
			}
		}
		println("Voc?? fechou o File Explorer \nAt?? a pr??xima ;)");
			
		
		

	}
	
	static void menu(){
		println("");
		println("-------------------------------------------");
		println("Gerenciador de Arquivos File Explorer     -"); 
		println("                                          -");
		println("(0) para sair                             -");                 
		println("(1) para dispositivos de Armazenamento    -");        
		println("(2) para Arquivos de Audio                -");    
		println("(3) para Documentos de Texto              -");  
		println("(4) para Arquivos de Imagem               -");   
		println("(5) para Arquivos de Video                -");    
		println("Digite sua op????o:                         -");             
		println("-------------------------------------------");

	}	
	
	static void menuDispositivo(){
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um dispositivo de armazenamento");
		println("(2) para listar os dispositivos atualmente no sistema");
		println("Digite sua op????o:");
	}
	
	static void menuAudio(){
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um aquivo de audio");
		println("(2) para listar os arquivos de audio atualmente no sistema");
		println("Digite sua op????o:");
	}
	
		
	static void menuDocumentoDeTexto(){
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um documento");
		println("(2) para listar os documentos atualmente no sistema");
		println("Digite sua op????o:");
	}
	
	static void menuImagem(){
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir uma imagem");
		println("(2) para listar as imagens atualmente no sistema");
		println("Digite sua op????o:");
	}
	
	static void menuVideo(){
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo video");
		println("(2) para listar os videos atualmente no sistema");
		println("Digite sua op????o:");
	}
	
	static void println(String conteudo) {
		if(imprime)
			System.out.println(conteudo);
		
	}

}
