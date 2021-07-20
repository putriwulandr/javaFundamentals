package id.putri.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.DetailProvinsi;

@Repository
public interface ProvinsiRepository extends JpaRepository<DetailProvinsi, Integer> {

    DetailProvinsi findByKodeProvinsi(String kodeProvinsi);
}
