package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author loongzhang
 * @Description  默认访问修饰符是public  abstract,既然是接口一定公共可以使用的
 * 所以,接口的修饰符不可以使用private,
 * @date 2023-01-28-14:50
 */
@Mapper
public interface PaymentDao {
      int create(Payment payment);
     Payment getPaymentById(@Param("id")Long id);

}
