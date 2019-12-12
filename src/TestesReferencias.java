public class TestesReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.00);

        Funcionario f1 = new Funcionario();
        f1.setNome("Lua");
        f1.setSalario(2000.00);

        EditorVideo e1 = new EditorVideo();
        e1.setNome("Joca");
        e1.setSalario(2500.00);

        Designer d = new Designer();
        e1.setNome("Julia");
        e1.setSalario(2000.00);

        ControleBonificacao controle =  new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(e1);
        controle.registra(d);

        System.out.println(controle.getSoma());



    }
}
