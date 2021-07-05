public class parImpar {
    
    public static String par_o_impar (int num) {

        String res = num%2==0?"numero par":"numero impar";
        return res;

    }
    public static void main(String[] args) {

        int variable = 15;

        String respuesta = par_o_impar(variable);

        System.out.println(respuesta);

    }
}
