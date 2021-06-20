package com.choimory.hello.hellojpa.company.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CompanyStatusCode {
    OPEN("정상")
    , CLOSED("폐업");

    private final String value;
}
