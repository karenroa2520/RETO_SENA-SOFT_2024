package com.fast.senasoft.Service;

import java.util.List;

import com.fast.senasoft.entity.Usuario;

public interface UsuarioService {

    public List<Usuario> obtenerUsuarioPorNumeroIdentificacion(Long numeroIdentificacion);
    
}
