package com.computerGo.pojo;

import lombok.Data;

/**
 * @Author Jared
 * @Data 2020/4/16 15:54
 */
@Data
public class Package {

    private int pid;                //套餐id
    private String packagemessage;  //套餐详细信息
    private int number;             //套餐数量
    private double price;           //套餐价格
}
