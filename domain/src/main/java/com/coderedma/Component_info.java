package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Component_info {
    private String C_id;
    private String C_type;
    private String C_attr;
    private String C_vedio;
    private String C_audio;
    private String C_img;
    private String C_front;
}
