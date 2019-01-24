package com.devonfw.application.prcr.usermanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.prcr.usermanagement.logic.api.Usermanagement;
import com.devonfw.application.prcr.usermanagement.logic.api.to.UserEto;
import com.devonfw.application.prcr.usermanagement.logic.api.to.UserSearchCriteriaTo;
import com.devonfw.application.prcr.usermanagement.logic.api.usecase.UcFindUser;
import com.devonfw.application.prcr.usermanagement.logic.api.usecase.UcManageUser;

/**
 * Implementation of component interface of usermanagement
 */
@Named
public class UsermanagementImpl extends AbstractComponentFacade implements Usermanagement {

	@Inject
	private UcFindUser ucFindUser;

	@Inject
	private UcManageUser ucManageUser;

	@Override
	public UserEto findUser(long id) {

		return this.ucFindUser.findUser(id);
	}

	@Override
	public Page<UserEto> findUsers(UserSearchCriteriaTo criteria) {
		return this.ucFindUser.findUsers(criteria);
	}

	@Override
	public UserEto saveUser(UserEto user) {

		return this.ucManageUser.saveUser(user);
	}

	@Override
	public boolean deleteUser(long id) {

		return this.ucManageUser.deleteUser(id);
	}
}
