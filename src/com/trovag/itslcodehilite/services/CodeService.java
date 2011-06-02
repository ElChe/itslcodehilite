/**
 * 
 */
package com.trovag.itslcodehilite.services;

import com.trovag.itslcodehilite.data.CodeEntity;

/**
 * @author Amund
 *
 */
public interface CodeService
{
	public CodeEntity GetCodeByKey(String key);
	public CodeEntity StoreCode(String code);
}
