public class Cadastro {

    public static void main(String[] args) {

        System.out.println("Controle de Entrada e Saída de Pessoas no Banco do Brasil: "  + "\n");

        System.out.println("Nome do Ususário: " + "\n");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Pedro";
        pessoa1.sexo = "Masculino";
        pessoa1.rg = "1234567";
        pessoa1.telefone = "81987654321";
        pessoa1.email = "pedro@gmail.com";
        pessoa1.endereco = "Rua Testando, 100 - Centro";

        System.out.println(pessoa1);

        //Abaixo, os possiveis destinos que os clientes ou visitantes poderão se dirigir dentro do estabelecimento

        System.out.println("Local da visita: ");

        Destinos destinolocal1 = Destinos.SECAO_ADMINISTRATIVA;
        System.out.println(destinolocal1.toString());

        Destinos destinolocal2 = Destinos.SECO_DE_PESSOAL;
        System.out.println(destinolocal2.toString());

        Destinos destinolocal3 = Destinos.SECAO_DE_LICITACOES_E_CONTRATOS;
        System.out.println(destinolocal3.toString());

        Destinos destinolocal4 = Destinos.SECAO_DE_SAUDE;
        System.out.println(destinolocal4.toString());

        Destinos destinolocal5 = Destinos.SECAO_INFORMATICA;
        System.out.println(destinolocal5.toString());

        Destinos destinolocal6 = Destinos.TESOURARIA;
        System.out.println(destinolocal6.toString());

        Destinos destinolocal7 = Destinos.AUDITORIO;
        System.out.println(destinolocal7.toString());
    }
}
