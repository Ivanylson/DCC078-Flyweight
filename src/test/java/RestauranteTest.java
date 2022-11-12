import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {
    @Test
    void deveRetornarFuncionarios(){
        Restaurante restaurante = new Restaurante();
        restaurante.registrar("João", "Alex", "123");
        restaurante.registrar("Maria", "Alex", "123");
        restaurante.registrar("Reinaldo", "Ana", "1234");
        restaurante.registrar("Frederico", "Jaime", "1238");

        assertEquals(3, FuncionarioFactory.getTotalFuncionarios());
    }

    @Test
    void deveRetonarClientes(){
        Restaurante restaurante = new Restaurante();
        restaurante.registrar("João", "Alex", "123");
        restaurante.registrar("Maria", "Ana", "1234");
        restaurante.registrar("Frederico", "Jaime", "1238");

        List<String> out = Arrays.asList(
                "Cliente{nome: 'João', funcionario(a): 'Alex', registro: '123'}",
                "Cliente{nome: 'Maria', funcionario(a): 'Ana', registro: '1234'}",
                "Cliente{nome: 'Frederico', funcionario(a): 'Jaime', registro: '1238'}"
               );
        assertEquals(out, restaurante.listaClientes());
    }



}