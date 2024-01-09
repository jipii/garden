package com.jipescu.garden.repository;

import com.jipescu.garden.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData, String> {
}
