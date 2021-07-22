package id.putri.springproject.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
// import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "kecamatan")
public class DetailKecamatan 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false, unique = true)
    private String kodeKecamatan;

    @Column(length = 50)
    private String namaKecamatan;

    @Column()
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "kabupaten")
    private DetailKabupaten detailKabupaten;

    public DetailKecamatan (String kodeKecamatan, String namaKecamatan) {
        this.kodeKecamatan = kodeKecamatan;
        this.namaKecamatan = namaKecamatan;
    }
}
