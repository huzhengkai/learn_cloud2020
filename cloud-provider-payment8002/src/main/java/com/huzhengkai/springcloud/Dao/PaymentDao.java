package com.huzhengkai.springcloud.Dao;

import com.huzhengkai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 胡正凯
 * @date 2021-05-19 14:32
 */
@Mapper
public interface  PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
