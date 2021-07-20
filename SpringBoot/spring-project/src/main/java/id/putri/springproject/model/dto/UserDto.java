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

package id.putri.springproject.model.dto;

import lombok.Data;

@Data

public class UserDto {
    private String firstName;
    private String lastName;
    private String nik;
    private String userName;
    private String phoneNumber;
    public UserDto() { }

    public UserDto(String userName) {
        this.userName = userName;
    }

    // public String getFirstName() { return firstName; }
    // public String getLastName() { return lastName; }
    // public String getNik() { return nik; }

    // public void setFirstName(String firstName) { this.firstName = firstName; }
    // public void setLastName(String lastName) {this.lastName = lastName; }
    // public void setNik(String nik) { this.nik = nik; }

    
}
