// package id.putri.springproject.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import id.putri.springproject.model.dto.WilayahDto;
// import id.putri.springproject.model.entity.DetailKabupaten;
// import id.putri.springproject.model.entity.DetailKecamatan;
// import id.putri.springproject.model.entity.DetailKelurahan;
// import id.putri.springproject.model.entity.DetailProvinsi;
// import id.putri.springproject.repository.KabupatenRepository;
// import id.putri.springproject.repository.KecamatanRepository;
// import id.putri.springproject.repository.ProvinsiRepository;

// @Service
// @Transactional
// public class WilayahServiceImpl implements WilayahService
// {
//     @Autowired
//     private ProvinsiRepository provinsiRepository;
//     private KabupatenRepository kabupatenRepository;
//     private KecamatanRepository kecamatanRepository;

//     @Override
//     public List<DetailProvinsi> getKodeProvinsi() {
//         List<DetailProvinsi> provinsis = provinsiRepository.findAll();
//         return provinsis;
//     }
//     @Override
//     public List<DetailKabupaten> getKodeKabupaten() {
//         List<DetailKabupaten> kabupatens = kabupatenRepository.findAll();
//         return kabupatens;
//     }
//     @Override
//     public List<DetailKecamatan> getKodeKecamatan() {
//         List<DetailKecamatan> kecamatans = kecamatanRepository.findAll();
//         return kecamatans;
//     }
//     @Override
//     public ResponseEntity<?> getById(Integer id) {
//         return null;
//     }
//     @Override
//     public DetailProvinsi insertProv(WilayahDto dto) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> updateProv(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> deleteProv(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public DetailKabupaten insertKab(WilayahDto dto) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> updateKab(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> deleteKab(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public DetailKecamatan insertKec(WilayahDto dto) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> updateKec(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> deleteKec(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public DetailKelurahan insertKel(WilayahDto dto) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> updateKel(WilayahDto dto, Integer id) {
//         return null;
//     }
//     @Override
//     public ResponseEntity<?> deleteKel(WilayahDto dto, Integer id) {
//         return null;
//     }


// }
