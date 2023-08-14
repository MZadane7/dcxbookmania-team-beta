/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.commons.lang.StringUtils;


/**
 * @author sdutta2
 *
 */
public class NoOfPagesPopulatorPlp implements Populator<SearchResultValueData, ProductData>
{
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		final String noOfPages = (String) source.getValues().get("noOfPages");

		if (StringUtils.isNotEmpty(noOfPages))
		{
			target.setNoOfPages(noOfPages);
		}

	}

}
