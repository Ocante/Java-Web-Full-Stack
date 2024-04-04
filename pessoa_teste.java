package curso.java;

import java.time.LocalDate; // Importe a classe LocalDate para lidar com datas

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private LocalDate dataNascimento; // Adicione um campo para a data de nascimento
	//agora deu certo mas vou enviar para develop 
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

