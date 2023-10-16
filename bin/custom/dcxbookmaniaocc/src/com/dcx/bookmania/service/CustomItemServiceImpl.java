/**
 * @author sdutta2
 *
 */


package com.dcx.bookmania.service;

import java.util.List;

import javax.annotation.Resource;

import com.dcx.bookmania.dao.CustomItemDao;
import com.dcx.bookmania.model.CustomItemModel;

public class CustomItemServiceImpl
{
	@Resource
	private CustomItemDao customItemDao;


	public CustomItemModel getCustomItem(final String code)
	{
		final CustomItemModel customItemModel = customItemDao.getCustomItem(code);
		return customItemModel;
	}

	public List<CustomItemModel> getCustomItems()
	{
		final List<CustomItemModel> customItemModels = customItemDao.getCustomItems();
		return customItemModels;
	}
}