package com.choimory.hello.hellojpa.item.mapper;

import com.choimory.hello.hellojpa.item.dto.response.ItemResponseDto;
import com.choimory.hello.hellojpa.item.entity.Item;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface ItemMapper {
    ItemResponseDto toDto(Item entity);
    List<ItemResponseDto> toDtos(List<Item> entities);
}
