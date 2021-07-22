package id.putri.springproject.repository;

import java.util.List;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// import id.putri.springproject.model.dto.WilayahDto;
import id.putri.springproject.model.entity.DetailKabupaten;

@Repository
public interface KabupatenRepository extends JpaRepository<DetailKabupaten, Integer> 
{
    DetailKabupaten findByKodeKabupaten(String kodeKabupaten);
    List<DetailKabupaten> findByIsDeleted(boolean b);
//     @Query(value = "select kode_provinsi from provinsi where id = ?", nativeQuery = true)
//    public List<String> getKodeProvinsi(WilayahDto dto); // Query manual
    // WilayahDto findByKodeProvinsi(String kodeProvinsi);    
}
