package com.choimory.hello.hellojpa.item.entity;

import com.choimory.hello.hellojpa.common.entity.CommonDateTimeEntity;
import com.choimory.hello.hellojpa.locker.entity.Locker;
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
public class Item extends CommonDateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<Locker> lockers = new ArrayList<>();
}
