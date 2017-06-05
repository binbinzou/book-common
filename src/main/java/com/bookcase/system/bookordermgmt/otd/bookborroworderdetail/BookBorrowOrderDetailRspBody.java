/**
 * Project Name:book-common
 * File Name:BookBorrowOrderDetailRspBody.java
 * Package Name:com.bookcase.system.bookordermgmt.otd.bookborroworderdetail
 * Date:2017年5月23日下午9:40:15
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.otd.bookborroworderdetail;

import java.sql.Timestamp;
import lombok.Data;

/**
 * ClassName:BookBorrowOrderDetailRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:40:15 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookBorrowOrderDetailRspBody {

	private String id;

	private String bookborrowOrderid;

	private String bookcaseFromid;

	private String bookcaseToid;

	private String bookmsgId;

	private Timestamp createTime;

	private String creator;

	private short status;

	private Timestamp updateTime;
	
}

