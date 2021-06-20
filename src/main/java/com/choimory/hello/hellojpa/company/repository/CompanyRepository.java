package com.choimory.hello.hellojpa.company.repository;

import com.choimory.hello.hellojpa.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
