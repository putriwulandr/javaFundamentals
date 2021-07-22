package id.putri.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.putri.springproject.model.entity.DetailUser;
import id.putri.springproject.model.entity.UserEntity;

public interface DetailUserRepository extends JpaRepository<DetailUser, Integer> 
{
    public DetailUser findByUserEntity(UserEntity userEntity);
}
