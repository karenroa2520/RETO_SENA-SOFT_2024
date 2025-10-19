package com.fast.senasoft.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fast.senasoft.Service.UsuarioService;
import com.fast.senasoft.entity.Usuario;
import com.fast.senasoft.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository UsuarioRepository;

    @Override
    public List<Usuario> obtenerUsuarioPorNumeroIdentificacion(Long numeroIdentificacion) {
        
        return UsuarioRepository.findByNumeroIdentificacion(numeroIdentificacion);
    }

}
