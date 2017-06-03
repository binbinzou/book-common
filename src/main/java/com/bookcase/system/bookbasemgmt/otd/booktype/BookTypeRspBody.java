/**
 * Project Name:book-common
 * File Name:BookTypeRspBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.otd.booktype
 * Date:2017年5月24日下午10:02:03
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.otd.booktype;

import java.sql.Timestamp;
import lombok.Data;
/**
 * ClassName:BookTypeRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午10:02:03 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookTypeRspBody {

	private String id;

	private Timestamp createTime;

	private String creator;

	private String name;

	private String pid;

	private short status;

	private Timestamp updateTime;

	
}

