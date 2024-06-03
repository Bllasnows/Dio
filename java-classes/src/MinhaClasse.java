
public class MinhaClasse {

    public static void main(String[] args) { 

        String primeiroNome ="Isabella";
        String segundoNome ="Neves";
        String a = a (primeiroNome,segundoNome);

        System.out.println(a);
    }

    public static String a (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}