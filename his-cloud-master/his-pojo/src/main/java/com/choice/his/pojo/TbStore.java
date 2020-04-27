package com.choice.his.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_store")
public class TbStore {

	@TableId(type = IdType.AUTO)
	private Long id;
	private String storeTitle;
	private String telephone;
	private String storeHref;
	private String storeAddress;
	private BigDecimal Longitude;
	private BigDecimal latitude;
	private String imgUrl;
	private String imgMt;
	private String imgElm;
	private String imgDetaile;
	private String footerHrefMt;
	private String footerHrefElm;
	private String typeWords;
	private Integer storeType;
	private Integer salesVolume;
	private Integer averagePrice;
	private Integer tangFood;
	private Integer isChain;
	private Integer chainNumber;
	private Integer cityNumber;
	private Integer recommendationIndex;
	private Integer status;
	private String story;
	private String businessHours;
	private String remark;
	private Long createDate;
	private Long createBy;
	private Long updateDate;
	private Long updateBy;
	
	
	


	@Override
	public String toString() {
		return "TbStore [id=" + id + ", storeTitle=" + storeTitle + ", telephone=" + telephone + ", storeHref="
				+ storeHref + ", storeAddress=" + storeAddress + ", Longitude=" + Longitude + ", latitude=" + latitude
				+ ", imgUrl=" + imgUrl + ", imgMt=" + imgMt + ", imgElm=" + imgElm + ", imgDetaile=" + imgDetaile
				+ ", footerHrefMt=" + footerHrefMt + ", footerHrefElm=" + footerHrefElm + ", typeWords=" + typeWords
				+ ", storeType=" + storeType + ", salesVolume=" + salesVolume + ", averagePrice=" + averagePrice
				+ ", tangFood=" + tangFood + ", isChain=" + isChain + ", chainNumber=" + chainNumber + ", cityNumber="
				+ cityNumber + ", recommendationIndex=" + recommendationIndex + ", status=" + status + ", story="
				+ story + ", businessHours=" + businessHours + ", remark=" + remark + ", createDate=" + createDate
				+ ", createBy=" + createBy + ", updateDate=" + updateDate + ", updateBy=" + updateBy + "]";
	}
	


}
