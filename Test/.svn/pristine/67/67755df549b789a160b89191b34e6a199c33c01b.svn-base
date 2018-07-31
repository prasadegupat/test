package com.intellect.hrm.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.intellect.hrm.common.ApplicationConstants;
import com.intellect.hrm.common.ResponseObject;
import com.intellect.hrm.exception.HrmBussinessException;
import com.intellect.hrm.service.util.HrmResponseUtil;


@Aspect
@Configuration
public class UserAccessAspect {
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	//@Around("execution(* com.intellect.hrm.web.rest.*.*(..))")
	public ResponseObject before(ProceedingJoinPoint p) throws HrmBussinessException {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getResponse();
		//String reqUri = request.getRequestURI();// api/v1/features/get_all
		/// users/signin/get
		String token = request.getHeader(ApplicationConstants.HEADER_AUTH);
		String userId = request.getHeader(ApplicationConstants.HEADER_USERID);
		ResponseObject result = null;
		try {
			// HttpHeaders
			// HttpHeaders
			HttpHeaders headers=new HttpHeaders();
			headers.setAccept(Arrays.asList(new MediaType[] {MediaType.APPLICATION_JSON}));
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set(ApplicationConstants.HEADER_AUTH, token);
			headers.set(ApplicationConstants.HEADER_USERID, userId);
			HttpEntity<String> entity=new HttpEntity<String>(headers);
			ResponseEntity<ResponseObject> restTemplate=new RestTemplate().exchange(ApplicationConstants.RBAC_MS_URL, HttpMethod.POST, entity, ResponseObject.class);
			if(null!=restTemplate) {
				ResponseObject rbacResonse=restTemplate.getBody();
				if(rbacResonse.getStatus().equals(ApplicationConstants.RES_STATUS_SUCCESS)) {
					result=(ResponseObject)p.proceed();
					if(null!=restTemplate.getHeaders().get(ApplicationConstants.HEADER_AUTH))
					response.setHeader(ApplicationConstants.HEADER_AUTH, restTemplate.getHeaders().get(ApplicationConstants.HEADER_AUTH).get(0));
				}else {
					return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, ApplicationConstants.UNAUTHRIZED_USER_MSG, null);
				}
			}else {
				return HrmResponseUtil.buildResponse(ApplicationConstants.RES_STATUS_ERROR, ApplicationConstants.SERVER_ERROR, null);
			}
			
		}catch (Throwable e) {
			logger.error(ApplicationConstants.EXCEPTION_OCCURED + e.getMessage());
		}
		return result;
	}
}
