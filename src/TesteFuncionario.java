public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario felipe = new Funcionario();
        felipe.setNome("Felipe Queiroga");
        felipe.setCpf("040.969.123-28");
        felipe.setSalario(3500.00);

        System.out.println(felipe.getNome());
        System.out.println(felipe.getBonificacao());

    }

}
