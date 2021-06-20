package com.choimory.hello.hellojpa.employee.mapper;

import com.choimory.hello.hellojpa.employee.dto.response.EmployeeResponseDto;
import com.choimory.hello.hellojpa.employee.entity.Employee;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface EmployeeMapper {
    EmployeeResponseDto toDto(Employee entity);
    List<EmployeeResponseDto> toDtos(List<Employee> entities);
}
