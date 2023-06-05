package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customize_info {
    private String Custom_id;
    private Integer User_id;
    private Timestamp Create_time;
    private Timestamp Save_time;
    private String T_id;
    private Double Total_price;
}
