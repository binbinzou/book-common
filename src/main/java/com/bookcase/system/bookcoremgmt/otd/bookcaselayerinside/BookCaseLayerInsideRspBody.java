/**
 * Project Name:book-common
 * File Name:BookTypeLayerInsideRspBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.otd.booktypelayerinside
 * Date:2017年5月23日下午8:10:32
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.otd.bookcaselayerinside;

import java.sql.Timestamp;
import lombok.Data;

/**
 * ClassName:BookTypeLayerInsideRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:10:32 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseLayerInsideRspBody {

	private String id;

	private String bookcaseId;

	private String bookcaseLayerinsidesizeId;

	private float boxX;

	private float boxY;

	private float boxZ;

	private Timestamp createTime;

	private String creator;

	private String orgId;

	private short status;

	private Timestamp updateTime;
	
}

