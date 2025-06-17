package com.vendedor.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "vendedores")
@Data
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Integer idVendedor;
    private Integer idUsuario;

    private String nombreCompleto;
    private String rut;
    private String areaVentas;

}
