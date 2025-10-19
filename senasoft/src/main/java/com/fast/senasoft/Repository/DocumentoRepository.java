package com.fast.senasoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fast.senasoft.entity.DocumentoIdentidad;

@Repository
public interface DocumentoRepository extends JpaRepository<DocumentoIdentidad, Long> {

}
