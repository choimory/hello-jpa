package com.choimory.hello.hellojpa.locker.dto.response;

import com.choimory.hello.hellojpa.item.dto.response.ItemResponseDto;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LockerResponseDto {
    private Long id;
    private List<ItemResponseDto> items;
}
