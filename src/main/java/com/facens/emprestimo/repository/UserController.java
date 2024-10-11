package com.facens.emprestimo.repository;

import com.facens.emprestimo.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserController  extends JpaRepository<User, Long> {
}
