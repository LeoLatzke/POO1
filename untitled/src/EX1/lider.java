package EX1;

public class Lider {
    class Lider extends Funcionario {
        private static final float BONUS_LIDER = 0.02f;

        // Construtor
        public Lider(String nome, float valorHora, int horasTrabalhadas) {
            super(nome, valorHora, horasTrabalhadas);
        }

        // Sobrescrita do método calcularSalario para incluir a bonificação
        @Override
        public float calcularSalario() {
            float salarioBase = super.calcularSalario();
            return salarioBase + (salarioBase * BONUS_LIDER);
        }
    }
}
