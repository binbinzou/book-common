/**
 * Project Name:book-common
 * File Name:BookBorrowOrderReqBody.java
 * Package Name:com.bookcase.system.bookordermgmt.dto.bookborroworder
 * Date:2017年5月23日下午9:05:52
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.dto.bookborroworder;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookBorrowOrderReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:05:52 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookBorrowOrderReqBody {

	private int bookCnt;

	private short type;

}

