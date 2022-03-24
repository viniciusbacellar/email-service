package com.vinicius.emailService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.emailService.domain.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
}
