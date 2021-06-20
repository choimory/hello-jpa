package com.choimory.hello.hellojpa.company.mapper;

import com.choimory.hello.hellojpa.company.dto.response.CompanyResponseDto;
import com.choimory.hello.hellojpa.company.entity.Company;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CompanyMapper {
    CompanyResponseDto toDto(Company entity);
    List<CompanyResponseDto> toDtos(List<Company> entities);
    List<CompanyResponseDto> toDtos(Page<Company> entiites);
}
