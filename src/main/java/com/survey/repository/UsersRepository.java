package com.survey.repository;

import com.survey.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, String> {
    public Users findByUsersId(String usersId);

    public Users findByName(String name);

    List<Users> findByNickname(String nickname);
}
