package simulacao;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dizerOla() {
        System.out.println(this.nome + ": Oiiiiiii! Tudo bem?");
    }

    public void responderPergunta(){
        System.out.println(this.nome + ": Não! :D");
    }

    public void dizerTchau() {
        System.out.println(this.nome +": Tchau! ");
    }

    public void dizerOlaParaPessoa(Pessoa pessoa) {

        if(pessoa.nome != "Raphael Coxinha") {
            System.out.println(this.nome + ": Oiiiii, " + pessoa.getNome() + ", tudo bem?");
        }
        else {
            System.out.println(this.nome + ": Aff oi, " + pessoa.getNome());
        }
        pessoa.dizerOla();
    }

    public void hatearKpop(){
        System.out.println(this.nome + ": Kpop é ruim!");
    }
}
