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

package id.putri.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.putri.springproject.model.dto.UserDto;
import id.putri.springproject.model.entity.DetailUser;
import id.putri.springproject.model.entity.UserEntity;
import id.putri.springproject.repository.DetailUserRepository;
import id.putri.springproject.repository.UserRepository;
// import id.putri.springproject.repository.UserRepository;
import id.putri.springproject.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController 
{
    // @Autowired // supaya user repository bisa kebaca dari user objek nya
    // private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DetailUserRepository detailUserRepository;

    @GetMapping("/all")
    public ResponseEntity<?> getUsers() 
    {
        try { // nambahin proteksi
            List<UserEntity> user = userRepository.findAll();
            return ResponseEntity.ok().body(user);
        } 
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    // Create
    @PostMapping("/insert")
    public ResponseEntity<?> insertUser(@RequestBody UserDto dto) {
        // UserEntity userEntity = new UserEntity(dto.getFirstName(), dto.getLastName(), dto.getNik());
        // if (dto.getNik() == userEntity.getNik()) { }
        // userRepository.save(userEntity);
        UserEntity userEntity = new UserEntity(dto.getUserName());
        userEntity.setDeleted(false);
        userRepository.save(userEntity); // biar id table user kebentuk dulu baru diset karna yg dicari pertama id nya

        DetailUser detailUser = new DetailUser(dto.getFirstName(), dto.getLastName(), dto.getNik());
        detailUser.setPhoneNumber(dto.getPhoneNumber());
        detailUser.setUserEntity(userEntity);
        detailUserRepository.save(detailUser);
        
        return ResponseEntity.ok().body(userEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        // if (userRepository.findById(id).isPresent()) {
        //     UserEntity userEntity = userRepository.findById(id).get();
        //     return ResponseEntity.ok().body(userEntity);
        // }
        // return ResponseEntity.badRequest().body("ID tidak ditemukan");
        return userService.getById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@RequestBody UserDto dto, @PathVariable Integer id) {
        // UserEntity userEntity = userRepository.findById(id).get();
        // userEntity.setFirstName(dto.getFirstName());
        // userEntity.setLastName(dto.getLastName());
        // userRepository.save(userEntity);
        // return ResponseEntity.ok().body(userEntity);
        UserEntity userEntity = userRepository.findById(id).get();
        DetailUser detailUser = detailUserRepository.findByUserEntity(userEntity);

        detailUser.setFirstName(dto.getFirstName());
        detailUser.setLastName(dto.getLastName());
        detailUser.setPhoneNumber(dto.getPhoneNumber());
        detailUserRepository.save(detailUser);
        return ResponseEntity.ok().body(detailUser);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        // UserEntity userEntity = userRepository.findById(id).get();
        // userRepository.delete(userEntity);
        // return ResponseEntity.ok().body("User Telah Berhasil Dihapus");
        return userService.deleteUser(id);
    }

    
}
