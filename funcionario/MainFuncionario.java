package funcionario;

public class MainFuncionario {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Júlio César", "14/03/2005",Sexo.MASCULINO, Setor.OPERACOES, 8500.00,"4560221");
        Diretor diretor=new Diretor("Julia Alves", "16/03/2005", Sexo.FEMININO, Setor.FINANCEIRO, 30000, 500);
        
        System.out.println(motoboy);
        System.out.println(diretor);
    }
    }
