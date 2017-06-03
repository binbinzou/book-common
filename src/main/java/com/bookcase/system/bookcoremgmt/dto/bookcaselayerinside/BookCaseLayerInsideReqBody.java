/**
 * Project Name:book-common
 * File Name:BookTypeLayerInsideReqBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.dto.booktypelayerinside
 * Date:2017年5月23日下午8:09:40
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.dto.bookcaselayerinside;

import java.sql.Timestamp;
import lombok.Data;

/**
 * ClassName:BookTypeLayerInsideReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:09:40 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCaseLayerInsideReqBody {

	private String bookcaseId;

	private String bookcaseLayerinsidesizeId;

	private float boxX;

	private float boxY;

	private float boxZ;

}

