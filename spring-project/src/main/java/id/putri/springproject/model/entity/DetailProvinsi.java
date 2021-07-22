package id.putri.springproject.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "provinsi")
public class DetailProvinsi 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false, unique = true)
    private String kodeProvinsi;

    @Column(length = 50)
    private String namaProvinsi;
    
    @Column()
    private boolean isDeleted;

    public DetailProvinsi(String kodeProvinsi, String namaProvinsi) {
        this.kodeProvinsi = kodeProvinsi;
        this.namaProvinsi = namaProvinsi;
    }
}
