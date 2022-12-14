
package com.alkemy.challenge.repository;

import com.alkemy.challenge.entity.PersonajeEntity;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */

@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long>, JpaSpecificationExecutor<PersonajeEntity>{
    
    List<PersonajeEntity> findAll(Specification<PersonajeEntity> spec);
}
