package id.putri.springproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.DetailKelurahan;

@Repository
public interface KelurahanRepository extends JpaRepository<DetailKelurahan, Integer> {
    DetailKelurahan findByKodeKelurahan(String kodeKelurahan);
    List<DetailKelurahan> findByIsDeleted(boolean b);
    
}
