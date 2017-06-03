/**
 * Project Name:book-common
 * File Name:BookAuthorReqBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.dto.bookauthor
 * Date:2017年5月24日下午9:40:06
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.dto.bookauthor;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookAuthorReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午9:40:06 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookAuthorReqBody {

	private String anotherName;

	private String birthday;

	private String description;

	private String name;

	private String nationality;

	private String penName;
	
}

