public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B"; // M | T | B

        switch (plano) {
            case "M": {
                System.out.println("100 Minutos de Ligação.");
                System.out.println("Whats e Instagram Grátis.");
                break;
            }
            case "T": {
                System.out.println("100 Minutos de Ligação.");
                System.out.println("Whats e Instagram Grátis.");
                System.out.println("5GB de YouTube.");
                break;
            }
            case "B": {
                System.out.println("100 Minutos de Ligação.");

                break;
            }

            default: {
                System.out.println("Entrada inválida.");
                break;
            }

        }
    }
}
