package com.hhh.wechat_order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 就餐用户信息
 * @author HHH
 * @version 1.0 2019/10/16
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@EntityListeners(AuditingEntityListener.class)
public class User {

    //用户id
    @Id
    @GeneratedValue
    private Integer userId;

    //用户名称
    private String userName;

    //用户手机号
    private String userPhone;

    //用户openid
    private String openid;

    //用户就餐的桌号
    private String userTable;

    //用户就餐人数
    private String userNumber;

    //创建时间
    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    //修改时间
    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
}
