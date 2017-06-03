/**
 * Project Name:book-common
 * File Name:BookCaseTypeLayerInsideReqBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.dto.bookcasetypelayerinside
 * Date:2017年5月6日下午2:44:45
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.otd.bookcasetypelayerinside;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookCaseTypeLayerInsideReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月6日 下午2:44:45 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseTypeLayerInsideRspBody {

	private String id;
	//分层距离左前下角的长度方向距离
	private double boxX;
	//分层距离左前下角的宽度方向距离
	private double boxY;
	//分层距离左前下角的高度方向距离
	private double boxZ;
	private String bookCaseTypeId;
	private String bookCaseLayerInsideSizeId;
	private Timestamp createTime;
	private String creator;
	private String orgId;
	private short status;
	private Timestamp updateTime;
	
}

