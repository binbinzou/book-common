/**
 * Project Name:book-common
 * File Name:BookAuthorRspBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.otd.bookauthor
 * Date:2017年5月24日下午10:00:28
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.otd.bookauthor;

import java.sql.Timestamp;
import java.util.Date;
import lombok.Data;
import com.bookcase.system.bookbasemgmt.otd.bookcasetype.BookCaseTypeRspBody;

/**
 * ClassName:BookAuthorRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午10:00:28 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookAuthorRspBody {

	private String id;

	private String anotherName;

	private String birthday;

	private Timestamp createTime;

	private String creator;

	private String description;

	private String name;

	private String nationality;

	private String penName;

	private short status;

	private Timestamp updateTime;

	
}

