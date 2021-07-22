package id.putri.springproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.DetailKecamatan;

@Repository
public interface KecamatanRepository extends JpaRepository<DetailKecamatan, Integer> {

    DetailKecamatan findByKodeKecamatan(String kodeKecamatan);
    List<DetailKecamatan> findByIsDeleted(boolean b);
    
}
