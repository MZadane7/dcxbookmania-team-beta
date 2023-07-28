/**
 *
 */
package com.dcx.bookmania.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;

import com.dcx.bookmania.core.model.DcxbookmaniaProductModel;


/**
 * @author SDUTTA2
 *
 */
public class BookDetailsPopulator implements Populator<DcxbookmaniaProductModel, ProductData>
{
	public void populate(final DcxbookmaniaProductModel source, final ProductData target)
	{
		target.setAuthor(source.getAuthor());
		target.setIsbn(source.getIsbn());
		target.setNoOfPages(source.getNoOfPages());
		target.setLanguages(source.getLanguages());
		target.setPublisher(source.getPublisher());
		target.setPublicationDate(source.getPublicationDate());
	}
}
