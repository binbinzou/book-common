/**
 * Project Name:book-common
 * File Name:BookDispatchReqBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.dto.bookdispatch
 * Date:2017年5月23日下午8:05:58
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.dto.bookdispatch;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookDispatchReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:05:58 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookDispatchReqBody {

	private String bookcaseFromid;

	private String bookcaseToid;

	private String bookmsgId;

	private String carrier;

	private String message;

	private String proposer;

	private short type;

}

