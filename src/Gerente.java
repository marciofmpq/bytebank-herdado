public class Gerente extends Funcionario {
    public double getBonificacao() {
       return super.getSalario() + 300;
    }
}
