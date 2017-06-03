/**
 * Project Name:book-common
 * File Name:BookCaseTypeReqBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.dto.bookcasetype
 * Date:2017年5月6日下午12:55:35
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.dto.bookcasetype;

import lombok.Data;

/**
 * ClassName:BookCaseTypeReqBody <br/>
 * Function: 请求的时候实体类的. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月6日 下午12:55:35 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseTypeReqBody {

	private String name;
	private int boxCount;
	private float length;
	private float wide;
	private float height;
	
}

