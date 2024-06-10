package gof.padroes_projetos_spring.service.impl;

import gof.padroes_projetos_spring.model.Cliente;
import gof.padroes_projetos_spring.model.ClienteRepository;
import gof.padroes_projetos_spring.model.Endereco;
import gof.padroes_projetos_spring.model.EnderecoRepository;
import gof.padroes_projetos_spring.service.ClienteService;
import gof.padroes_projetos_spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

// singleton injetar os componentes com @Autowired
//strategy implementar os médotos definidos na interface
//facade abstrair integrações com subsistemas
@Component
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {

        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvandoClienteComCep(cliente);

    }

    private void salvandoClienteComCep(Cliente cliente) {
        //caso cep não exista no banco de dados iremos buscar na api
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            //integrando com o ViaCep
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional <Cliente> clienteBd =clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            salvandoClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);

    }
}
