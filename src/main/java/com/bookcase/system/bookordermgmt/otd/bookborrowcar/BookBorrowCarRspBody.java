/**
 * Project Name:book-common
 * File Name:BookBorrowCarRspBody.java
 * Package Name:com.bookcase.system.bookordermgmt.otd.bookborrowcar
 * Date:2017年5月23日下午9:05:06
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.otd.bookborrowcar;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookBorrowCarRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:05:06 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookBorrowCarRspBody {

	private String id;

	private String bookmsgId;

	private Timestamp createTime;

	private String creator;

	private short status;

	private Timestamp updateTime;
	
}

