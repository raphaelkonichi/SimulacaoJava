package simulacao;

public class SimulacaoConversa {

    public static void main(String[] args) {

        try {
            Pessoa raphael = new Pessoa();
            raphael.setNome("Raphael Coxinha");
            raphael.setIdade(56);

            Pessoa maria = new Pessoa();
            maria.setNome("Maria Linda");
            maria.setIdade(20);

            Kpopper isabelle = new Kpopper();
            isabelle.setNome("Isa Okuma");
            isabelle.setIdade(20);

            Directioner laura = new Directioner();
            laura.setNome("Laurinha Gabriela");
            laura.setIdade(21);

            System.out.println("\nChat do MSN\n");
            raphael.dizerOla();
            maria.dizerOlaParaPessoa(raphael);
            maria.responderPergunta();
            maria.dizerOlaParaPessoa(laura);
            laura.responderPergunta();
            maria.dizerOlaParaPessoa(isabelle);
            raphael.hatearKpop();
            maria.hatearKpop();
            laura.hatearKpop();
            isabelle.dizerTchau();
            raphael.dizerTchau();
            laura.dizerTchau();
            maria.dizerTchau();

        }
        catch(Exception ex) {

        }
    }

}
