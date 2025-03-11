package heranca_funcionario;

public class MainFuncionario {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "123", "Bairro 1", "Cidade 1","12345-678");
        Endereco endereco1=new Endereco("Rua 1","123","Bairro 1","Cidade 1","12345-678");
        Engenheiro engenheiro=new Engenheiro("Julio Cesar","julio@gmail.com",70000,endereco,"123456");
        Medico medico=new Medico("Julia","julia@gmail.com",70000,endereco1,"123456");

        System.out.println(engenheiro);
        System.out.println();
        System.out.println(medico);
}
}

