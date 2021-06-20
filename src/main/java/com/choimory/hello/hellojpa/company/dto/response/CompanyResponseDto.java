package com.choimory.hello.hellojpa.company.dto.response;

import com.choimory.hello.hellojpa.company.code.CompanyStatusCode;
import com.choimory.hello.hellojpa.employee.dto.response.EmployeeResponseDto;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyResponseDto {
    private Long id;
    private String name;
    private String address;
    private String description;
    private CompanyStatusCode companyStatus;
    private Date foundingDate;
    private List<EmployeeResponseDto> employees;
}
