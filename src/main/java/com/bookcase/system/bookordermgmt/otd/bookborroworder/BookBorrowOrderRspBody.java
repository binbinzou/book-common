/**
 * Project Name:book-common
 * File Name:BookBorrowOrderRspBody.java
 * Package Name:com.bookcase.system.bookordermgmt.otd.bookborroworder
 * Date:2017年5月23日下午9:09:48
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.otd.bookborroworder;

import java.sql.Timestamp;
import lombok.Data;

/**
 * ClassName:BookBorrowOrderRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:09:48 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookBorrowOrderRspBody {

	private String id;

	private int bookCnt;

	private Timestamp createTime;

	private String creator;

	private short status;

	private short type;

	private Timestamp updateTime;
	
}

