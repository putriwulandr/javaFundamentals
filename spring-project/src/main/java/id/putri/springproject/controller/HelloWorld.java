
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

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

@RestController // REST API controller
// @controller buat view html springnya.
// @RequestMapping()
public class HelloWorld 
{
    @GetMapping()
    public String hello()
    { return "Hello World"; }

    @GetMapping("/hello")
    public String hello2()
    { return "Hello, I Learn Springboot Java"; }

    @GetMapping("/putri") // alamat getmapping gaboleh sama antar yang lain
    public String helloMySelf() // nama methodnya juga gaboleh sama
    { return "Hello, My Name is Putri Wulandari"; }

    
}
