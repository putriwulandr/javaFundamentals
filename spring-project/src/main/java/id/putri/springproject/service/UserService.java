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

package id.putri.springproject.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import id.putri.springproject.model.dto.UserDto;
import id.putri.springproject.model.entity.UserEntity;

public interface UserService 
{
    public List<UserEntity> getUsers();
    public UserEntity insertUser(UserDto dto);
    public ResponseEntity<?> getById(Integer id);
    public ResponseEntity<?> updateUser(UserDto dto, Integer id);
    public ResponseEntity<?> deleteUser(Integer id);
}
