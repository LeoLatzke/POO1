package EX1;

public class Main {
    public static void main(String[] args) {
        // Exemplo de criação de funcionários
        Funcionario f1 = new Funcionario("João", 10.0f, 100);
        Lider l1 = new Lider("Maria", 26.0f, 180);
        Gerente g1 = new Gerente("Pedro", 30.0f, 160);

        // Exibição dos salários
        System.out.println("Salário de " + f1.getNome() + ": R$" + f1.calcularSalario());
        System.out.println("Salário de " + l1.getNome() + ": R$" + l1.calcularSalario());
        System.out.println("Salário de " + g1.getNome() + ": R$" + g1.calcularSalario());
    }
}