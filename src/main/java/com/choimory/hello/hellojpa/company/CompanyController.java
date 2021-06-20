package com.choimory.hello.hellojpa.company;

import com.choimory.hello.hellojpa.company.dto.response.CompanyResponseDto;
import com.choimory.hello.hellojpa.company.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping
    public List<CompanyResponseDto> getCompanies(Pageable pageable){
        return companyService.getCompanies(pageable);
    }
}
