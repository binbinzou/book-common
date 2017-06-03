/**
 * Project Name:book-common
 * File Name:BookCaseRspBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.otd.bookcase
 * Date:2017年5月23日下午8:02:06
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.otd.bookcase;

import java.sql.Timestamp;
import lombok.Data;
/**
 * ClassName:BookCaseRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:02:06 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseRspBody {

	private String id;

	private Timestamp beginuseTime;

	private String bookcaseTypeId;

	private String city;

	private Timestamp createTime;

	private String creator;

	private String district;

	private String lat;

	private String lng;

	private String name;

	private String orgId;

	private String province;

	private short status;

	private Timestamp updateTime;
	
}

