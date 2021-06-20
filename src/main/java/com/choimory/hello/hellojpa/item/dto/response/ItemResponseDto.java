package com.choimory.hello.hellojpa.item.dto.response;

import com.choimory.hello.hellojpa.locker.dto.response.LockerResponseDto;
import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponseDto {
    private Long id;
    private String name;
    private List<LockerResponseDto> lockers;
}
