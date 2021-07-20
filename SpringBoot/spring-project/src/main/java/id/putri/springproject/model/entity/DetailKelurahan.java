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
@Table(name = "kelurahan")
public class DetailKelurahan 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false, unique = true)
    private String kodeKelurahan;

    @Column(length = 50)
    private String namaKelurahan;
    
    @Column()
    private boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "kecamatan")
    private DetailKecamatan detailKecamatan;

    public DetailKelurahan (String kodeKelurahan, String namaKelurahan) {
        this.kodeKelurahan = kodeKelurahan;
        this.namaKelurahan = namaKelurahan;
    }
}
