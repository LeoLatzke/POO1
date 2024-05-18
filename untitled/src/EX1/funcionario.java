package EX1;

public class funcionario {

    class Funcionario {
        private String nome;
        private float valorHora;
        private int horasTrabalhadas;

        // Construtor
        public Funcionario(String nome, float valorHora, int horasTrabalhadas) {
            this.nome = nome;
            this.valorHora = valorHora;
            this.horasTrabalhadas = horasTrabalhadas;
        }

        // Método para calcular o salário
        public float calcularSalario() {
            return valorHora * horasTrabalhadas;
        }

        // Getters e setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getValorHora() {
            return valorHora;
        }

        public void setValorHora(float valorHora) {
            this.valorHora = valorHora;
        }

        public int getHorasTrabalhadas() {
            return horasTrabalhadas;
        }

        public void setHorasTrabalhadas(int horasTrabalhadas) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }
}