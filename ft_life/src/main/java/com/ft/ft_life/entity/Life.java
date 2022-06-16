package com.ft.ft_life.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 说说实体类
 * {@code @author:} 一枚方糖
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Life {

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @TableId(value = "content")
    private String content;

    @TableId(value = "time")
    @TableField(fill = FieldFill.INSERT)
    private Date time;
}
