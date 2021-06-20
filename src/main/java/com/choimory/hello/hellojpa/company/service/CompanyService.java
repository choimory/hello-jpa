package com.choimory.hello.hellojpa.company.service;

import com.choimory.hello.hellojpa.company.dto.response.CompanyResponseDto;
import com.choimory.hello.hellojpa.company.mapper.CompanyMapper;
import com.choimory.hello.hellojpa.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public List<CompanyResponseDto> getCompanies(Pageable pageable){
        return companyMapper.toDtos(companyRepository.findAll(pageable));
    }
}
