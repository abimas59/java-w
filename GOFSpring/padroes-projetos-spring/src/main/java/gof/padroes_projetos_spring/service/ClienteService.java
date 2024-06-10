package gof.padroes_projetos_spring.service;

import gof.padroes_projetos_spring.model.Cliente;
import org.springframework.stereotype.Component;

//interface que define o padrão Strategy no domínio de cliente.
@Component
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
