public class While {
    public static void main(String[] args) {
        
        int contador = 0;
        while (contador<10) {
            System.out.println("O valor de contator é: " + contador);
            //contador = contador + 1;  
            //contador += 1;
            contador ++;
        }
        System.out.println("Essa porra conta só ate: " + contador);
        System.out.println("-------------------------------");

        int contar =0;
        int total = 0;
        while (contar<20) {
            
            //total = total + contar;
            total += contar;

            System.out.println("O valor de contar é: " + contar);
            contar ++;
        }
    }  
}
