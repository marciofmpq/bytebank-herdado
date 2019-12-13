public class SistemaInterno {
    private int senha = 2222;

    public void autentica (Autenticavel g){

        if (g.autentica(this.senha) == true){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado !");
        }
    }

}
