package com.wwk.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;

@Data
@TableName("commodity_attr_attrgroup_relation")
public class AttrGroupEntity {
    @TableId(type = IdType.AUTO)
    @TableField(value = "id",exist = false)
    private Long ids;
    private Integer attrId;
    private Integer attrGroupId;
    private Integer attrSort;
}
