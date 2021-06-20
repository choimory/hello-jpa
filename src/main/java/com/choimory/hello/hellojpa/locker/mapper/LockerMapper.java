package com.choimory.hello.hellojpa.locker.mapper;

import com.choimory.hello.hellojpa.locker.dto.response.LockerResponseDto;
import com.choimory.hello.hellojpa.locker.entity.Locker;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface LockerMapper {
    LockerResponseDto toDto(Locker entity);
    List<LockerResponseDto> toDtos(List<Locker> entities);
}
