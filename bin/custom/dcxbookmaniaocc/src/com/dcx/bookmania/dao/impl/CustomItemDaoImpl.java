/**
 * @author sdutta2
 *
 */
package com.dcx.bookmania.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dcx.bookmania.dao.CustomItemDao;
import com.dcx.bookmania.model.CustomItemModel;


public class CustomItemDaoImpl extends AbstractItemDao implements CustomItemDao
{
	private static final Logger LOGGER = Logger.getLogger(CustomItemDaoImpl.class);
	private static final String CustomItems_QUERY = "SELECT{" + CustomItemModel.PK + "}FROM{" + CustomItemModel._TYPECODE + "}";
	private static final String CustomItem_QUERY = "SELECT{" + CustomItemModel.PK + "}FROM{" + CustomItemModel._TYPECODE
			+ "}WHERE{" + CustomItemModel.UNIQUEATTRIBUTE + "}=?code";

	@Override
	public List<CustomItemModel> getCustomItems()
	{
		LOGGER.info(getFlexibleSearchService().search(CustomItems_QUERY).getClass());
		final SearchResult<CustomItemModel> student = getFlexibleSearchService().search(CustomItem_QUERY);
		return student.getResult() == null ? Collections.emptyList() : student.getResult();
	}
	@Override
	public CustomItemModel getCustomItem(final String code)
	{
		final Map<String, Object> params = new HashMap<>();
		params.put("code", code);
		LOGGER.info(getFlexibleSearchService().search(CustomItem_QUERY, params).getClass());
		final SearchResult<CustomItemModel> customItem = getFlexibleSearchService().search(CustomItem_QUERY, params);
		return customItem.getResult() == null ? null : customItem.getResult().get(0);
	}
}