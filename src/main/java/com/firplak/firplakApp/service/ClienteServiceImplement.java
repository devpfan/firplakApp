package com.firplak.firplakApp.service;

import com.firplak.firplakApp.model.Cliente;
import com.firplak.firplakApp.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImplement implements ClienteService {

   @Autowired
    private clienteRepository clienteRepo;

   @Override
    public Cliente saveCliente(Cliente cliente){
       return clienteRepo.save(cliente);
   }

   @Override
    public List<Cliente> getAllClientes(){
       return clienteRepo.findAll();
   }

}
