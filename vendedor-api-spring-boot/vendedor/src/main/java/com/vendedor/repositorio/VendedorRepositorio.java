package com.vendedor.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;

import com.vendedor.modelo.Vendedor;

public interface VendedorRepositorio extends JpaRepository<Vendedor, Integer> {

    
    

}
