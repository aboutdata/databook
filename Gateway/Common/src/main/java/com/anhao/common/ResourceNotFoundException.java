/*
 * 
 * 
 * 
 */
package com.anhao.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 资源不存在异常
 * 
 * 
 * 
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -9208522773597070069L;

}