package id.putri.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.DetailKelurahan;

@Repository
public interface KelurahanRepository extends JpaRepository<DetailKelurahan, Integer> {
    
}
