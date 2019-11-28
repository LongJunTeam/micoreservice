package com.wei.springcloud.entitys;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/11/25 0025.
 */

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@Data
@ToString
public class Dept implements Serializable {
    private Long id;

    private String name;

    private String data_source;

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setData_source("1").setId(1L);
    }
}
