public class Boolean {
    public static void main(String[] args) {

        System.out.println("Sera que podera entrar na troca de casais?");
        int idade = 20;
        int quantidadePessoas =3;
        //boolean acompanhado = true;
        boolean acompanhado = quantidadePessoas >= 2;

        // O simbulo || significa "ou", && significa "E"
        if (idade >= 18 && acompanhado){
            System.out.println("seja bem vindo a troca de casais");
        }else{
                 System.out.println("Infelizmente vc n pode entrar");   
        }
             
    }
}
    