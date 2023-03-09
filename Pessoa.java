public class Pessoa {

    //Dados cadastrais de uma Pessoa
    String nome;
    String sexo;
    String rg;
    String telefone;
    String email;
    String endereco;

    @Override
    public String toString(){
        return "Visitante " + '\n' +
                "- Nome: "+ nome + '\n' +
                "- Sexo: " + sexo + '\n' +
                "- Rg: " + rg + '\n' +
                "- Telefone: " + telefone + '\n' +
                "- E-mail: " + email + '\n' +
                "- Endereço: " + endereco + '\n';

    }
}
