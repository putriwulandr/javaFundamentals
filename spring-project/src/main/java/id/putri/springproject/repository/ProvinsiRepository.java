package id.putri.springproject.repository;

import java.util.List;
// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.DetailProvinsi;

@Repository
public interface ProvinsiRepository extends JpaRepository<DetailProvinsi, Integer> {

    DetailProvinsi findByKodeProvinsi(String kodeProvinsi);
    List<DetailProvinsi> findByIsDeleted(boolean b);
}
