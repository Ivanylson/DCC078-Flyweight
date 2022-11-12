import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrar(String nome, String nomeFuncionario, String registroFuncionario){
        Funcionario funcionario = FuncionarioFactory.getFuncionario(nomeFuncionario, registroFuncionario);
        Cliente cliente = new Cliente(nome, funcionario);
        clientes.add(cliente);
    }

    public List<String> listaClientes(){
        List<String> out = new ArrayList<String>();
        for(Cliente cliente : this.clientes){
            out.add(cliente.getClient());
        }
        return out;
    }
}
