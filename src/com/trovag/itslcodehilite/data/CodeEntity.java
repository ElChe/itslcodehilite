package com.trovag.itslcodehilite.data;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

/**
 * CodeEntity keeps data for the code given
 * @author Amund
 *
 */
@PersistenceCapable
public class CodeEntity
{
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
	private String code;
	
	@Persistent
	private UserInfo userInfo;
	
	/**
	 * Returns editReference for use on the post
	 * @return
	 */
	public String GetEditReference(){
		return getKey().getName();
	}

	public void setKey(Key key)
	{
		this.key = key;
	}

	public Key getKey()
	{
		return key;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getCode()
	{
		return code;
	}

	public void setUserInfo(UserInfo userInfo)
	{
		this.userInfo = userInfo;
	}

	public UserInfo getUserInfo()
	{
		return userInfo;
	}
}
