public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Tabuada do 1 a 10");
        System.out.println();

        for (int multiplicador = 1; multiplicador <=10; multiplicador++) {
            for (int contador = 1; contador <=10; contador++) {
                System.out.print(contador * multiplicador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
