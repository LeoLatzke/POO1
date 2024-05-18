package EX2;
    public class RetanguloAsciiArt extends Retangulo {
        public AsciiArt(String texto) {
            super(texto);
        }

        @Override
        public void desenhar() {
            // Implementação para desenhar um retângulo com arte ASCII
            System.out.println("Retângulo com arte ASCII:");
            System.out.println("*************");
            System.out.println("*  " + texto + "  *");
            System.out.println("*           *");
            System.out.println("*           *");
            System.out.println("*************");
        }
    }
