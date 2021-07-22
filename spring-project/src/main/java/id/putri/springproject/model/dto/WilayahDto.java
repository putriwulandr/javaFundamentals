package id.putri.springproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WilayahDto 
{
    private String kodeProvinsi;
    private String namaProvinsi;
    private String kodeKabupaten;
    private String namaKabupaten;
    private String kodeKecamatan;
    private String namaKecamatan;
    private String kodeKelurahan;
    private String namaKelurahan;    
}
