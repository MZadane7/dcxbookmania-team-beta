/**
 *
 */
package com.dcx.bookmania.populator;

import de.hybris.platform.commercefacades.customitem.data.CustomItemData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.dcx.bookmania.model.CustomItemModel;


/**
 * @author sdutta2
 *
 */
public class CustomItemPopulator implements Populator<CustomItemModel, CustomItemData>
{

	@Override
	public void populate(final CustomItemModel source, final CustomItemData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setUniqueAttribute(source.getUniqueAttribute());
		target.setAttribute1(source.getAttribute1());
		target.setAttribute2(source.getAttribute2());
		target.setAttribute3(source.getAttribute3());
		target.setOptionalAttribute1(source.getOptionalAttribute1());
		target.setOptionalAttribute2(source.getOptionalAttribute2());
	}

}
