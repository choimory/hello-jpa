package com.choimory.hello.hellojpa.employee.dto.response;

import com.choimory.hello.hellojpa.common.code.GenderCode;
import com.choimory.hello.hellojpa.company.dto.response.CompanyResponseDto;
import com.choimory.hello.hellojpa.locker.dto.response.LockerResponseDto;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {
    private Long id;
    private String name;
    private GenderCode gender;
    private CompanyResponseDto company;
    private LockerResponseDto locker;
}
