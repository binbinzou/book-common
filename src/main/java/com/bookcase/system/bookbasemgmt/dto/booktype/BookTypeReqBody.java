/**
 * Project Name:book-common
 * File Name:BookTypeReqBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.dto.booktype
 * Date:2017年5月24日下午9:49:22
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.dto.booktype;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookTypeReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午9:49:22 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookTypeReqBody {

	private String id;

	private String name;

	private String pid;

}

