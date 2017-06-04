/**
 * Project Name:book-common
 * File Name:BookCommentRspBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.otd.bookcomment
 * Date:2017年5月23日下午8:05:42
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.otd.bookcomment;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookCommentRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:05:42 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCommentRspBody {

	private String id;

	private String bookCommonmsgId;

	private String content;

	private Timestamp createTime;

	private String creator;

	private int score;

	private short status;

	private short usefullCnt;
	
}

