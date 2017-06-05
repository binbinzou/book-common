/**
 * Project Name:book-common
 * File Name:BookLendOrderReqParam.java
 * Package Name:com.bookcase.system.bookordermgmt.dto.booklendorder
 * Date:2017年5月23日下午9:38:45
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookordermgmt.dto.booklendorder;

import java.util.List;

import lombok.Data;

/**
 * ClassName:BookLendOrderReqParam <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午9:38:45 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookLendOrderReqParam {

	private List<String> ids;
	
}

