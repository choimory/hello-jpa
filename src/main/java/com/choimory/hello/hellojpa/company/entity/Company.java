package com.choimory.hello.hellojpa.company.entity;

import com.choimory.hello.hellojpa.common.entity.CommonDateTimeEntity;
import com.choimory.hello.hellojpa.company.code.CompanyStatusCode;
import com.choimory.hello.hellojpa.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company extends CommonDateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String address;
    @Lob
    private String description;
    @Enumerated(EnumType.STRING)
    private CompanyStatusCode companyStatus;
    @Temporal(TemporalType.DATE)
    private Date foundingDate;
    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<Employee> employees = new ArrayList<>();
}
