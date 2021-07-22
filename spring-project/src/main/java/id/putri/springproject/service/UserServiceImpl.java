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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.putri.springproject.model.dto.UserDto;
import id.putri.springproject.model.entity.UserEntity;
import id.putri.springproject.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getUsers() {
        List<UserEntity> users= userRepository.findAll();
        return users;
    }

    @Override
    public UserEntity insertUser(UserDto dto) {
        // UserEntity userEntity = new UserEntity(dto.getFirstName(), dto.getLastName(), dto.getNik());
        // if (dto.getNik() == userEntity.getNik()) { }
        // userRepository.save(userEntity);
        return null;
    }

    @Override
    public ResponseEntity<?> getById(Integer id) {
        if (userRepository.findById(id).isPresent()) {
            UserEntity userEntity = userRepository.findById(id).get();
            return ResponseEntity.ok().body(userEntity);
        }
        return ResponseEntity.badRequest().body("ID Tidak Ditemukan");
    }

    @Override
    public ResponseEntity<?> updateUser(UserDto dto, Integer id) {
        // UserEntity userEntity = userRepository.findById(id).get();
        // userEntity.setFirstName(dto.getFirstName());
        // userEntity.setLastName(dto.getLastName());
        // userRepository.save(userEntity);
        return ResponseEntity.ok().body("");
    }

    @Override
    public ResponseEntity<?> deleteUser(Integer id) {
        UserEntity userEntity = userRepository.findById(id).get();
        userRepository.delete(userEntity);
        return ResponseEntity.ok().body("User Telah Berhasil Dihapus");
    }

    
}
