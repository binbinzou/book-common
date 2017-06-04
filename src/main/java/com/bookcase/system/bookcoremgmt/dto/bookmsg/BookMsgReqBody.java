/**
 * Project Name:book-common
 * File Name:BookMsgReqBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.dto.bookmsg
 * Date:2017年5月23日下午8:07:34
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.dto.bookmsg;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookMsgReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:07:34 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookMsgReqBody {

	private String bookCommonmsgId;

	private String booklendOrderid;

	private float deposit;

	private String firstBookcaseId;

	private String lendUserid;

	private float onedayPriiceOverdue;

	private float onedayPriiceUnoverdue;

	private int reNewday;

	private String realBookcaseId;

	private String rentUserid;

	private int unoverdueMaxday;

}

