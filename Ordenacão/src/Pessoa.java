public class Pessoa implements Comparable<Pessoa>{

    //atributos
    private String nome;

    private int idade;

    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int compareTo(Pessoa p){
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    
    @Override
    public String toString() {
        return "Pessoas{" + 
        "nome = '" + nome + '\'' +
        ", idade =" + idade + 
        ", altura" + altura +
        '}';
    }
}
