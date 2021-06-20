package com.choimory.hello.hellojpa.employee.entity;

import com.choimory.hello.hellojpa.common.code.GenderCode;
import com.choimory.hello.hellojpa.common.entity.CommonDateTimeEntity;
import com.choimory.hello.hellojpa.company.entity.Company;
import com.choimory.hello.hellojpa.locker.entity.Locker;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends CommonDateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private GenderCode gender;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;
}
