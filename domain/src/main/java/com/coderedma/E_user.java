package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.PrimitiveIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class E_user {
    private Integer E_id;
    private String E_name;
    private Character E_sex;
    private String E_phone;
    private String E_regoin;
    private String E_achievement;

}
