package com.choimory.hello.hellojpa.locker.entity;

import com.choimory.hello.hellojpa.common.entity.CommonDateTimeEntity;
import com.choimory.hello.hellojpa.item.entity.Item;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Locker extends CommonDateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Item> items = new ArrayList<>();
}
