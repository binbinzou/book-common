/**
 * Project Name:book-common
 * File Name:BookLendRspBody.java
 * Package Name:com.bookcase.system.bookordermgmt.otd.booklendorder
 * Date:2017年5月23日下午9:40:41
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.otd.booklendorder;

import java.sql.Timestamp;

import lombok.Data;


/**
 * ClassName:BookLendRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:40:41 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookLendOrderRspBody {

	private String id;

	private int bookCnt;

	private Timestamp createTime;

	private String creator;

	private short status;

	private Timestamp updateTime;


}

