package id.putri.springproject.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import id.putri.springproject.model.dto.WilayahDto;
import id.putri.springproject.model.entity.DetailKabupaten;
import id.putri.springproject.model.entity.DetailKecamatan;
import id.putri.springproject.model.entity.DetailKelurahan;
import id.putri.springproject.model.entity.DetailProvinsi;

public interface WilayahService 
{
    public List<DetailProvinsi> getKodeProvinsi();
    public List<DetailKabupaten> getKodeKabupaten();
    public List<DetailKecamatan> getKodeKecamatan();

    public ResponseEntity<?> getById(Integer id);

    public DetailProvinsi insertProv(WilayahDto dto);
    public ResponseEntity<?> updateProv(WilayahDto dto, Integer id);
    public ResponseEntity<?> deleteProv(WilayahDto dto, Integer id);

    public DetailKabupaten insertKab(WilayahDto dto);
    public ResponseEntity<?> updateKab(WilayahDto dto, Integer id);
    public ResponseEntity<?> deleteKab(WilayahDto dto, Integer id);

    public DetailKecamatan insertKec(WilayahDto dto);
    public ResponseEntity<?> updateKec(WilayahDto dto, Integer id);
    public ResponseEntity<?> deleteKec(WilayahDto dto, Integer id);

    public DetailKelurahan insertKel(WilayahDto dto);
    public ResponseEntity<?> updateKel(WilayahDto dto, Integer id);
    public ResponseEntity<?> deleteKel(WilayahDto dto, Integer id);

}
