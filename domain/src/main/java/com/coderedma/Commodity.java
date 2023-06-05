package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    private String Shop_id;
    private Double price;
    private String Custom_info_id;
    private Integer Inventory_num;
}
