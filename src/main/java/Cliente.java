public class Cliente {
    private String name;
    private Funcionario funcionario;

    public Cliente(String nome, Funcionario funcionario){
        this.name = nome;
        this.funcionario = funcionario;
    }

    public String getClient(){
        return "Cliente{" + "nome: '" + this.name + '\'' +
                ", funcionario(a): '" + funcionario.getNome() + '\'' +
                ", registro: '" + funcionario.getRegistro() + '\'' +
                '}';
    }
}
