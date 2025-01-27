package in.myorg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.myorg.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
