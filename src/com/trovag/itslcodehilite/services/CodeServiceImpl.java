package com.trovag.itslcodehilite.services;


import javax.jdo.PersistenceManager;

import com.trovag.itslcodehilite.data.PMF;
import com.trovag.itslcodehilite.data.CodeEntity;
import com.trovag.itslcodehilite.data.UserInfo;

public class CodeServiceImpl implements CodeService
{
	private PersistenceManager pm;
	public CodeServiceImpl()
	{
		pm = PMF.get().getPersistenceManager();
	}
	@Override
	public CodeEntity GetCodeByKey(String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeEntity StoreCode(String code)
	{
		CodeEntity codeEntity = new CodeEntity();
		codeEntity.setCode(code);
		
		// replace this with real data
		UserInfo user = new UserInfo();
		user.setCountry("NO");
		user.setCustomerId(1);
		user.setPersonId(2);
		
		codeEntity.setUserInfo(user);

		pm.makePersistent(codeEntity);

		return codeEntity;
		
		// TODO Auto-generated method stub
		
	}

}
