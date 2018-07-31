package com.intellect.hrm.service.util;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.intellect.hrm.common.ResponseObject;

/**
 * @author pganga To build standard response
 */
public class HrmResponseUtil {

	private final static Logger log = LoggerFactory.getLogger(HrmResponseUtil.class);

	public static ResponseObject buildResponse(String status, String statusMsg, List<?> data) {
		// log.debug(RbacConstants.STARTING_METHOD+RbacCommonFunctionUtil.getCurrentMethodName());
		log.debug("Request status" + status);
		ResponseObject resObj = new ResponseObject();
		resObj.setStatus(status);
		if (null != status) {
			resObj.setStatus(status);
		}
		if (null != statusMsg) {
			resObj.setStatusMsg(statusMsg);
		} else {
			resObj.setStatusMsg(null);
		}
		if (null != data) {
			resObj.setData(data);
		}
		// log.debug(RbacConstants.ENDING_METHOD+RbacCommonFunctionUtil.getCurrentMethodName());
		return resObj;
	}

}
