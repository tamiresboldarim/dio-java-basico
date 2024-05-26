public class MinhaClasse {
    
    

    public static void main (String [] args) {

        String primeiroNome = "Tamires";
        String segundoNome = "Boldarim";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    
    }
}
