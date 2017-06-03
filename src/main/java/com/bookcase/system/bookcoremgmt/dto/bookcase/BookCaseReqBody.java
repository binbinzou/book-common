/**
 * Project Name:book-common
 * File Name:BookCaseReqBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.dto.bookcase
 * Date:2017年5月23日下午8:01:11
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.dto.bookcase;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookCaseReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:01:11 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseReqBody {
	
	private Timestamp beginuseTime;

	private String bookcaseTypeId;

	private String city;

	private String district;

	private String lat;

	private String lng;

	private String name;

	private String province;
	
}

