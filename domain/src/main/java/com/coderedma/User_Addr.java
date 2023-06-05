package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User_Addr {
    private Integer id;
    private Integer User_id;
    private String Addr_id;

}
