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

package id.putri.springproject.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.putri.springproject.model.entity.UserEntity;

//agar bisa akses method2 bawaan JPA repository
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> 
{
   UserEntity findByUserName(String userName);
   // JPARepository -> Generic class punya field tipe data yang harus di isi
   // T (Objek) sebagai UserEntity, TypeData dari ID nya Integer
   // Jembatan antara springboot dengan database.
   // Proses query syntax berjalan di JPA repository ini.
   
   // @Query(value = "select first_name from user_entity where id = ?", nativeQuery = true)
   // public List<String> getFirstName(Integer id); // Query manual

   // // ini pake pattern dari syntax jpa repository (dokumentasi jpa repository)
   // public List<String> findByFirstNameAndLastName(String firstName, String lastName);

   // public List<String> findByLastNameIgnoreCase(String lastName);

}
