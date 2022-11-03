package com.algaCurso.cursoAlga.notificadorEmail;

import com.algaCurso.cursoAlga.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
