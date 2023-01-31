package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-28-15:04
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id")Long id);
}
