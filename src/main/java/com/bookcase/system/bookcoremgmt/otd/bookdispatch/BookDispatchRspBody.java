/**
 * Project Name:book-common
 * File Name:BookDispatchRspBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.otd.bookdispatch
 * Date:2017年5月23日下午8:06:46
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.otd.bookdispatch;

import java.sql.Timestamp;
import lombok.Data;
/**
 * ClassName:BookDispatchRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:06:46 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookDispatchRspBody {

	private String id;

	private String bookcaseFromid;

	private String bookcaseToid;

	private String bookmsgId;

	private String carrier;

	private Timestamp createTime;

	private String creator;

	private String message;

	private String proposer;

	private short status;

	private short type;

	private Timestamp updateTime;
	
}

