package com.fast.senasoft.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @Column(name = "numero_identificacion", nullable = false)
    private Long numeroIdentificacion;

    @OneToOne
    @JoinColumn(name = "id_tipo_identificacion", nullable = false)
    private DocumentoIdentidad tipoIdentificacion;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name="fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name="sexo", nullable = false)
    private String sexo;

    @Column(name="direccion_residencia", nullable = false)
    private String direccionResidencia;

    @Column(name="num_celular", nullable = false)
    private int numCelular;

    @Column(name="correo", nullable = false)
    private String correo;

    @OneToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;


}
