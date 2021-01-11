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
 * 轮播图
 * @author HHH
 * @version 1.0 2019/10/16
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class Picture {

    //图片id
    @Id
    @GeneratedValue
    private Integer picId;

    //图片地址
    private String picUrl;

    //图片信息
    private String picMessage;

    //创建时间
    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
}
