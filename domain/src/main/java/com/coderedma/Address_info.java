package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address_info {
    private String addr_id;
    private Integer User_id;
    private String detail_addr;
    private String A_phone;
}
