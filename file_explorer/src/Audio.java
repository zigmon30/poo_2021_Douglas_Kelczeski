
public class Audio {
	private String nome;
	private String formato;
	private double tamanho;
	
	public Audio(String nome, String formato, double tamanho) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	String getFormatarAudio() {
		return  formato = ".txt";
	}
}