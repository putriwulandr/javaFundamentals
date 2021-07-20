package id.putri.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.putri.springproject.model.dto.WilayahDto;
import id.putri.springproject.model.entity.DetailKabupaten;
import id.putri.springproject.model.entity.DetailKecamatan;
import id.putri.springproject.model.entity.DetailKelurahan;
import id.putri.springproject.model.entity.DetailProvinsi;
import id.putri.springproject.repository.KabupatenRepository;
import id.putri.springproject.repository.KecamatanRepository;
import id.putri.springproject.repository.KelurahanRepository;
import id.putri.springproject.repository.ProvinsiRepository;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@Data
@NoArgsConstructor
@RequestMapping("/wilayah")
public class WilayahController 
{
    // ------------------------------------------------------------- Provinsi
    @Autowired
    private ProvinsiRepository provinsiRepository;

    @GetMapping("/provinsi")
    public ResponseEntity<?> getProvinsi() {
        List<DetailProvinsi> provinsis = provinsiRepository.findAll();
        return ResponseEntity.ok().body(provinsis);
    }

    @PostMapping("/insert/provinsi")
    public ResponseEntity<?> insertProv(@RequestBody WilayahDto dto) {
        DetailProvinsi detailProvinsi = new DetailProvinsi(dto.getKodeProvinsi(), dto.getNamaProvinsi());
        detailProvinsi.setKodeProvinsi(dto.getKodeProvinsi());
        detailProvinsi.setNamaProvinsi(dto.getNamaProvinsi());
        provinsiRepository.save(detailProvinsi);

        return ResponseEntity.ok().body(detailProvinsi);
    }

    @PutMapping("/update/provinsi/{id}")
    public ResponseEntity<?> updateProv(@RequestBody WilayahDto dto, @PathVariable Integer id) {
        DetailProvinsi detailProvinsi = provinsiRepository.findById(id).get();

        detailProvinsi.setKodeProvinsi(dto.getKodeProvinsi());
        detailProvinsi.setNamaProvinsi(dto.getNamaProvinsi());
        provinsiRepository.save(detailProvinsi);
        return ResponseEntity.ok().body(detailProvinsi);
    }

    @DeleteMapping("/delete/provinsi/{id}")
    public ResponseEntity<?> deleteProv(@PathVariable Integer id) {
        DetailProvinsi detailProvinsi = provinsiRepository.findById(id).get();
        detailProvinsi.setDeleted(true);
        provinsiRepository.save(detailProvinsi);
        return ResponseEntity.ok().body(detailProvinsi);
    }

    // ------------------------------------------------------------- Kabupaten

    @Autowired
    private KabupatenRepository kabupatenRepository;

    @GetMapping("/kabupaten")
    public ResponseEntity<?> getKabupaten() {
        List<DetailKabupaten> kabupatens = kabupatenRepository.findAll();
        return ResponseEntity.ok().body(kabupatens);
    }

    @PostMapping("/insert/kabupaten")
    public ResponseEntity<?> insertKab(@RequestBody WilayahDto dto) {
        DetailKabupaten detailKabupaten = new DetailKabupaten(dto.getKodeKabupaten(), dto.getNamaKabupaten());
        DetailProvinsi detailProvinsi = provinsiRepository.findByKodeProvinsi(dto.getKodeProvinsi());
        
        detailKabupaten.setDetailProvinsi(detailProvinsi);
        detailKabupaten.setKodeKabupaten(dto.getKodeKabupaten());
        detailKabupaten.setNamaKabupaten(dto.getNamaKabupaten());
        kabupatenRepository.save(detailKabupaten);

        return ResponseEntity.ok().body(detailKabupaten);
    }

    @PutMapping("/update/kabupaten/{id}")
    public ResponseEntity<?> updateKab(@RequestBody WilayahDto dto, @PathVariable Integer id) {
        DetailKabupaten detailKabupaten = kabupatenRepository.findById(id).get();

        detailKabupaten.setKodeKabupaten(dto.getKodeKabupaten());
        detailKabupaten.setNamaKabupaten(dto.getNamaKabupaten());
        kabupatenRepository.save(detailKabupaten);
        return ResponseEntity.ok().body(detailKabupaten);
    }

    @DeleteMapping("/delete/kabupaten/{id}")
    public ResponseEntity<?> deleteKab(@PathVariable Integer id) {
        DetailKabupaten detailKabupaten = kabupatenRepository.findById(id).get();
        detailKabupaten.setDeleted(true);
        kabupatenRepository.save(detailKabupaten);
        return ResponseEntity.ok().body(detailKabupaten);
    }

    // ------------------------------------------------------------- Kecamatan

    @Autowired
    private KecamatanRepository kecamatanRepository;

    @GetMapping("/kecamatan")
    public ResponseEntity<?> getKecamatan() {
        List<DetailKecamatan> kecamatans = kecamatanRepository.findAll();
        return ResponseEntity.ok().body(kecamatans);
    }

    @PostMapping("/insert/kecamatan")
    public ResponseEntity<?> insertKec(@RequestBody WilayahDto dto) {
        DetailKecamatan detailKecamatan = new DetailKecamatan(dto.getKodeKecamatan(), dto.getNamaKecamatan());
        DetailKabupaten detailKabupaten = kabupatenRepository.findByKodeKabupaten(dto.getKodeKabupaten());
        
        detailKecamatan.setDetailKabupaten(detailKabupaten);
        detailKecamatan.setKodeKecamatan(dto.getKodeKecamatan());
        detailKecamatan.setNamaKecamatan(dto.getNamaKecamatan());
        kecamatanRepository.save(detailKecamatan);

        return ResponseEntity.ok().body(detailKecamatan);
    }

    @PutMapping("/update/kecamatan/{id}")
    public ResponseEntity<?> updateKec(@RequestBody WilayahDto dto, @PathVariable Integer id) {
        DetailKecamatan detailKecamatan = kecamatanRepository.findById(id).get();

        detailKecamatan.setKodeKecamatan(dto.getKodeKabupaten());
        detailKecamatan.setNamaKecamatan(dto.getNamaKabupaten());
        kecamatanRepository.save(detailKecamatan);
        return ResponseEntity.ok().body(detailKecamatan);
    }

    @DeleteMapping("/delete/kecamatan/{id}")
    public ResponseEntity<?> deleteKec(@PathVariable Integer id) {
        DetailKecamatan detailKecamatan = kecamatanRepository.findById(id).get();
        detailKecamatan.setDeleted(true);
        kecamatanRepository.save(detailKecamatan);
        return ResponseEntity.ok().body(detailKecamatan);
    }

    // ------------------------------------------------------------- Kelurahan

    @Autowired
    private KelurahanRepository kelurahanRepository;

    @GetMapping("/kelurahan")
    public ResponseEntity<?> getKelurahan() {
        List<DetailKelurahan> kelurahans = kelurahanRepository.findAll();
        return ResponseEntity.ok().body(kelurahans);
    }

    @PostMapping("/insert/kelurahan")
    public ResponseEntity<?> insertKel(@RequestBody WilayahDto dto) {
        DetailKelurahan detailKelurahan = new DetailKelurahan(dto.getKodeKelurahan(), dto.getNamaKelurahan());
        DetailKecamatan detailKecamatan = kecamatanRepository.findByKodeKecamatan(dto.getKodeKecamatan());
        
        detailKelurahan.setDetailKecamatan(detailKecamatan);
        detailKelurahan.setKodeKelurahan(dto.getKodeKelurahan());
        detailKelurahan.setNamaKelurahan(dto.getNamaKelurahan());
        kelurahanRepository.save(detailKelurahan);

        return ResponseEntity.ok().body(detailKelurahan);
    }

    @PutMapping("/update/kelurahan/{id}")
    public ResponseEntity<?> updatePKab(@RequestBody WilayahDto dto, @PathVariable Integer id) {
        DetailKabupaten detailKabupaten = kabupatenRepository.findById(id).get();

        detailKabupaten.setKodeKabupaten(dto.getKodeKabupaten());
        detailKabupaten.setNamaKabupaten(dto.getNamaKabupaten());
        kabupatenRepository.save(detailKabupaten);
        return ResponseEntity.ok().body(detailKabupaten);
    }

    @DeleteMapping("/delete/kelurahan/{id}")
    public ResponseEntity<?> deleteKel(@PathVariable Integer id) {
        DetailKelurahan detailKelurahan = kelurahanRepository.findById(id).get();
        detailKelurahan.setDeleted(true);
        kelurahanRepository.save(detailKelurahan);
        return ResponseEntity.ok().body(detailKelurahan);
    }
}
