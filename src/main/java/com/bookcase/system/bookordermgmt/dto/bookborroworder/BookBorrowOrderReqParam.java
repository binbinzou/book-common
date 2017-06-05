/**
 * Project Name:book-common
 * File Name:BookBorrowOrderReqParam.java
 * Package Name:com.bookcase.system.bookordermgmt.dto.bookborroworder
 * Date:2017年5月23日下午9:07:44
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.dto.bookborroworder;

import java.util.List;

import lombok.Data;

/**
 * ClassName:BookBorrowOrderReqParam <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:07:44 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookBorrowOrderReqParam {

	private List<String> ids;
	
}

