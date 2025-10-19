package com.fast.senasoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fast.senasoft.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

}
