package com.ad.apiserver.repository;

import com.ad.apiserver.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
