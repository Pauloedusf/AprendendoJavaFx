package model;

public class Categoria {
	private int Id;
	private String nome;

	public Categoria(int id, String nome) {
		
		this.Id = id;
		this.nome = nome;
	} 
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return getNome();
	}

	
}
