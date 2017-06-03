/**
 * Project Name:book-common
 * File Name:BookCaseLayerInsideSizeRspBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.otd.bookcaselayerinsidesize
 * Date:2017年5月7日下午4:38:28
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.otd.bookcaselayerinsidesize;

import java.sql.Timestamp;
import java.util.Date;
import lombok.Data;


/**
 * ClassName:BookCaseLayerInsideSizeRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月7日 下午4:38:28 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseLayerInsideSizeRspBody {

	private String id;

	private float bookHeightlimit;

	private float bookLenghtlimit;

	private float bookWidelimit;

	private Date createTime;

	private String creator;

	private float height;

	private float length;

	private String name;

	private String orgId;

	private short status;

	private Date updateTime;

	private float wide;

	
}

