/*
 * Folder folder
 * controler : menyimpan method mapping yang kita miliki
 * model : menaruh entitas yang dimiliki
 * dto : data transfer objek / entitas yang dikirim ke frontend
 *       berfungsi sbg perantara ke frontend
 * entity : menghubungkan ke database. ada anotasi bawaan
 *          springboot untuk menjalankan database (update di mysql)
 * repository : akses ke database / repo kita agar terhubung ke mysql
 * service : method abstraction class yang pake interface dan implementasinya
 *           class implementasi dari service nanti dibawa ke dalam controller
 */

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
@Table(name = "user")
public class UserEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false, unique = true)
    private String userName;
    
    @Column()
    private boolean isDeleted;

    // public UserEntity() {
    // }

    public UserEntity(String userName) {
        this.userName = userName;
    }

    // public Integer getId() { return id; }
    // public String getFirstName() { return firstName; }
    // public String getLastName() { return lastName; }
    // public String getNik() { return nik; }

    // public void setFirstName(String firstName) { this.firstName = firstName; }
    // public void setLastName(String lastName) { this.lastName = lastName; }
    // public void setNik(String nik) { this.nik = nik; }
}
