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
		target.setCode(source.getCode());
		target.setAuthor(source.getAuthor());
		target.setIsbn(source.getIsbn());
		target.setNoOfPages(source.getNoOfPages());
		target.setLanguages(source.getLanguages());
		target.setPublisher(source.getPublisher());
		target.setPublicationDate(source.getPublicationDate());
		target.setNoOfChapters(source.getNoOfChapters());
		target.setCopyRegDate(source.getCopyRegDate());
		target.setBookWeight(source.getBookWeight());
		target.setFont(source.getFont());
		target.setCopyright(source.getCopyright());
		target.setAwards(source.getAwards());
		target.setAgeCategory(source.getAgeCategory());
		target.setDimension(source.getDimension());
		target.setPubLoc(source.getPubloc());
		target.setAuthorBio(source.getAuthorBio());
		target.setDiscount(source.getDiscount());
		target.setReturnBook(source.getReturnBook());
		target.setReplace(source.getReplace());
		target.setStatus(source.getStatus());
	}
}
