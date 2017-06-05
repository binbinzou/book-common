/**
 * Project Name:book-common
 * File Name:BookBorroowOrderDetailReqBody.java
 * Package Name:com.bookcase.system.bookordermgmt.dto.bookborroworderdetail
 * Date:2017年5月23日下午9:10:13
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.dto.bookborroworderdetail;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookBorroowOrderDetailReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:10:13 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookBorrowOrderDetailReqBody {

	private String bookborrowOrderid;

	private String bookcaseFromid;

	private String bookcaseToid;

	private String bookmsgId;

}

