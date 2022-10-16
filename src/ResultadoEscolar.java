public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        if (nota >= 7) {
            System.out.println("Sua nota: " + nota);
            System.out.println("Resultado: Aprovado");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Sua nota: " + nota);
            System.out.println("Resultado: Prova de recuperação.");
        } else {
            System.out.println("Sua nota: " + nota);
            System.out.println("Resultado: Reprovado");
        }
    }
}
