package com.atguigu.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-28-14:42
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private Long serial;
}
