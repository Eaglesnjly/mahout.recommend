package com.springmvc.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yehao on 2016/10/13.
 */

@Data
public class BaseEntity implements Serializable {
	private Integer id;
	private Integer isDel;

	private Integer pageNo;
	private Integer pageSize;
	private Integer pageIndex;
	private String orderBy;

	private Date createTime;
	private Date updateTime;


	public void init(){
		if (this.pageNo ==null){
			this.pageNo = 1;
		}
		if(this.pageSize == null){
			this.pageSize = 20;
		}
		this.pageIndex = (this.pageNo-1)*this.pageSize;
	}
}
