package id.putri.springproject.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "kabupaten")
public class DetailKabupaten 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false, unique = true)
    private String kodeKabupaten;

    @Column(length = 50, nullable = false)
    private String namaKabupaten;

    @Column()
    private boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "provinsi")
    private DetailProvinsi detailProvinsi;

    public DetailKabupaten (String kodeKabupaten, String namaKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
        this.namaKabupaten = namaKabupaten;
    }
}
