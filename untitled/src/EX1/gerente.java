package EX1;

public class gerente {

    class Gerente extends Funcionario {
        private static final float BONUS_GERENTE = 0.05f;

        // Construtor
        public Gerente(String nome, float valorHora, int horasTrabalhadas) {
            super(nome, valorHora, horasTrabalhadas);
        }

        // Sobrescrita do método calcularSalario para incluir a bonificação
        @Override
        public float calcularSalario() {
            float salarioBase = super.calcularSalario();
            return salarioBase + (salarioBase * BONUS_GERENTE);
        }
    }
}

