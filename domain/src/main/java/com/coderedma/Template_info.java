package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Template_info {
    private String T_id;
    private String T_name;
    private Integer T_num;
    private String T_attr;
    private Double T_price;
    private Timestamp avail_time;
    private Integer month_sale;
}
