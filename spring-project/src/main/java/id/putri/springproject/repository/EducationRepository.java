package id.putri.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer > {
    
}
