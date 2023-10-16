package com.firplak.firplakApp.service;

import com.firplak.firplakApp.model.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente saveCliente(Cliente cliente);
    List<Cliente> getAllClientes();
}
