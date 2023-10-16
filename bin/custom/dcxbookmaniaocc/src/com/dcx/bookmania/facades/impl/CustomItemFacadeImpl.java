/**
 *
 */
package com.dcx.bookmania.facades.impl;

import de.hybris.platform.commercefacades.customitem.data.CustomItemData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.dcx.bookmania.facades.CustomItemFacade;
import com.dcx.bookmania.model.CustomItemModel;
import com.dcx.bookmania.service.CustomItemServiceImpl;


/**
 * @author sdutta2
 *
 */
public class CustomItemFacadeImpl implements CustomItemFacade
{

	private CustomItemServiceImpl customItemServiceImpl;
	private Converter<CustomItemModel, CustomItemData> customItemConverter;

	public List<CustomItemData> getCustomItems()
	{
		final List<CustomItemModel> customItemModels = customItemServiceImpl.getCustomItems();
		return Converters.convertAll(customItemModels, getCustomItemConverter());
	}

	@Override
	public CustomItemData getCustomItem(final String code)
	{
		final CustomItemModel customItemModel = customItemServiceImpl.getCustomItem(code);
		return getCustomItemConverter().convert(customItemModel);
	}



	public Converter<CustomItemModel, CustomItemData> getCustomItemConverter()
	{
		return customItemConverter;
	}


	public void setCustomItemConverter(final Converter<CustomItemModel, CustomItemData> customItemConverter)
	{
		this.customItemConverter = customItemConverter;
	}

	/**
	 * @return the customItemServiceImpl
	 */
	public CustomItemServiceImpl getCustomItemServiceImpl()
	{
		return customItemServiceImpl;
	}

	/**
	 * @param customItemServiceImpl
	 *           the customItemServiceImpl to set
	 */
	public void setCustomItemServiceImpl(final CustomItemServiceImpl customItemServiceImpl)
	{
		this.customItemServiceImpl = customItemServiceImpl;
	}
}
