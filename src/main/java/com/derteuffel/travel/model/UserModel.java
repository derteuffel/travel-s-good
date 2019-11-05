package com.derteuffel.travel.model;

import com.derteuffel.travel.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserModel extends JpaRepository<User,Long> {
}
