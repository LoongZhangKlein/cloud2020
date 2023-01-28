package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-28-15:07
 */
@RequestMapping("/payment")
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    /**
     * 此处不添加RequestBody不能收到值
     * @param payment
     * @return
     */
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if (i>0){
            return new CommonResult(200,"添加成功");
        }
        return new CommonResult<>(404,"添加失败");
    }
    @GetMapping(value = "/get/{id}")
    public CommonResult select(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById!=null){
            return new CommonResult(200,"查询成功",paymentById);
        }
        return new CommonResult<>(400,"添加失败");
    }
}
