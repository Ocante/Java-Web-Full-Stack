package projeto1_java;

public class Pessoa {
    // Dados pessoais
    private String nome;
    private String sobrenome;
    private int idade;
    private String estadoCivil;
    private String nacionalidade;
    private String cidade;
    private String nivelEscolaridade;
    private String corPele;
    private String sexo;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, String sobrenome, int idade, String estadoCivil, String nacionalidade, String cidade,
                  String nivelEscolaridade, String corPele, String sexo, double peso, double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.nacionalidade = nacionalidade;
        this.cidade = cidade;
        this.nivelEscolaridade = nivelEscolaridade;
        this.corPele = corPele;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Método para imprimir os dados formatados
    public void imprimirDadosPessoais() {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Nível de escolaridade: " + nivelEscolaridade);
        System.out.println("Cor de pele: " + corPele);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Criando uma instância de Pessoa com dados fictícios
        Pessoa pessoa = new Pessoa("João", "Silva", 30, "Solteiro", "Brasileira", "Rio de Janeiro",
                "Ensino Superior", "Branca", "Masculino", 75.5, 1.75);

        // Chamando o método para imprimir os dados
        pessoa.imprimirDadosPessoais();
    }
}
