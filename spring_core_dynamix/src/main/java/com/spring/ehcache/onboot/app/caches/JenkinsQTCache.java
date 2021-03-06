package com.spring.ehcache.onboot.app.caches;


import org.springframework.cache.annotation.Cacheable;

import com.base.mysql.tree.traversal.TreeStructure;
import com.spring.ehcache.onboot.app.AppConstants;
import com.spring.ehcache.onboot.app.UserDAO;

public class JenkinsQTCache implements IfaceCommonsCache{

private UserDAO udao;
	
	public UserDAO getUdao() {
		return udao;
	}

	public void setUdao(UserDAO udao) {
		this.udao = udao;
	}
	
	@Override
	@Cacheable(value = "jenkins")
	public TreeStructure getTreeStructureIface() {
		return udao.getTreeStructure(AppConstants.JENKINS_QT.toString());
	}

}
