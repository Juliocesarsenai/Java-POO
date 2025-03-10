package juridica;

public class MainJuridica {
    public static void main(String[] args) {
        
    
    Fisica fisica = new Fisica("João", "1234-5678", "123.456.789-00", "12.345.678-9");
    Juridica juridica = new Juridica("Pedro", "1234-5678", "12.345.678/0001-90", "123.456.789.00");   
    
    System.out.println(fisica);
    System.out.println();
    System.out.println(juridica);

}

}
