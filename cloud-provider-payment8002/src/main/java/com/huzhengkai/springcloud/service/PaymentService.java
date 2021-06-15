package com.huzhengkai.springcloud.service;

import com.huzhengkai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 胡正凯
 * @date 2021-05-19 14:37
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
