public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Márcio Felipe");
        g1.setCpf("222.222.222-22");
        g1.setSalario(4340.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        g1.setSenha(123);

        System.out.println(g1.autentica(123));

        System.out.println(g1.getBonificacao());


    }
}
