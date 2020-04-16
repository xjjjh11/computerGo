package com.computerGo.pojo;

import lombok.Data;

/**
 * @Author Jared
 * @Data 2020/4/16 13:01
 */
@Data
public class Repertory {
    private int rid;        //库存id
    private String title;   //库存标题
    private double price;   //库存价格
    private int evaluation; //评价等级
    private String photo;   //相关照片
}
