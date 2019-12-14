package com.xm.comment_serialize.module.user.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "su_bill")
public class SuBillEntity implements Serializable{
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 所属用户
	 */
	private Integer userId;

	/**
	 * 账单来源用户，因为哪个用户而产生的订单(订单类型为2/3时)
	 */
	private Integer fromUserId;

	/**
	 * 账单金额(分)
	 */
	private Integer money;

	/**
	 * 账单类型(1:普通自购,2:代理收益,3:分享自购,4:分享收益)
	 */
	private Integer type;

	/**
	 * 订单id(账单类型为[1,2,3,4])
	 */
	private Integer orderId;

	/**
	 * 佣金比例(千分比 账单类型为[1,2,3,4])
	 */
	private Integer promotionRate;

	/**
	 * 账单状态(1:待发放,2:准备发放,3:已发放,4:已失效)
	 */
	private Integer state;

	/**
	 * 账单失效原因
	 */
	private String failReason;

	/**
	 * 最后更新时间
	 */
	private java.util.Date updateTime;

	private java.util.Date createTime;
}