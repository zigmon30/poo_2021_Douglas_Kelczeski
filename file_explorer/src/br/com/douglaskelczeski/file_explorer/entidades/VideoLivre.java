package br.com.douglaskelczeski.file_explorer.entidades;

public class VideoLivre extends Video {

	public VideoLivre(String nome, String formato, double tamanho) {
		super(nome, formato, tamanho);
	}

	@Override
	public String getType() {
		return "  Visibilidade...==>Video Livre para todos ***** ;)";
	}

}
