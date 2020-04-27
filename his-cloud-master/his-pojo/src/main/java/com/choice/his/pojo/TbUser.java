package com.choice.his.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user")//mybatisplus注解（指定表名,默认的结果集）
public class TbUser  {

	@TableId(type = IdType.AUTO)//自增主键
	private Long id;
	
	private String userNo;
	
    private String password;
    
    private String openId;

    private String userName;

    private Integer userAge;

    private String address;

    private String telphone;
    
    private Integer status;//用户状态，1表示在用，0表示不可用

    private String remark;

    private long createDate;

    private long updateDate;
    @TableField(exist = false)//指定非表字段
    private List<TbStore> storeList;
    

	@Override
	public String toString() {
		return "TbUser [id=" + id + ", userNo=" + userNo + ", password=" + password + ", openId=" + openId
				+ ", userName=" + userName + ", userAge=" + userAge + ", address=" + address + ", telphone=" + telphone
				+ ", status=" + status + ", remark=" + remark + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", storeList=" + storeList + "]";
	}

}