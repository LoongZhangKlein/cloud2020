package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-28-14:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T>{
    public Integer code;
    public String message;
    public T data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
