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
public class Order {
    private String Order_id;
    private Timestamp Pay_time;
    private Double Pay_money;
    private Integer User_id;
    private String Ship_way;
    private Timestamp Prod_time;
    private String Order_status;
    private Integer E_id;
    private String remark;
}
