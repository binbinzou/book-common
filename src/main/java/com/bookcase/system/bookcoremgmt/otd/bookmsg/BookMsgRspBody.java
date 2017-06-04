/**
 * Project Name:book-common
 * File Name:BookMsgRspBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.otd.bookmsg
 * Date:2017年5月23日下午8:08:18
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.otd.bookmsg;

import java.sql.Timestamp;
import lombok.Data;
/**
 * ClassName:BookMsgRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:08:18 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookMsgRspBody {

	private String id;

	private String bookCommonmsgId;

	private String booklendOrderid;

	private Timestamp createTime;

	private String creator;

	private float deposit;

	private String firstBookcaseId;

	private String lendUserid;

	private float onedayPriiceOverdue;

	private float onedayPriiceUnoverdue;

	private int reNewday;

	private String realBookcaseId;

	private String rentUserid;

	private short status;

	private int unoverdueMaxday;

	private Timestamp updateTime;
	
}

