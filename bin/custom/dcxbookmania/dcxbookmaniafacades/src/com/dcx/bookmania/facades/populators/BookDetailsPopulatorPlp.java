///**
// *
// */
//package com.dcx.bookmania.facades.populators;
//
//import de.hybris.platform.commercefacades.product.data.ProductData;
//import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
//import de.hybris.platform.converters.Populator;
//import de.hybris.platform.servicelayer.dto.converter.ConversionException;
//
//import org.apache.commons.lang.StringUtils;
//
//
///**
// * @author sdutta2
// *
// */
//public class BookDetailsPopulatorPlp implements Populator<SearchResultValueData, ProductData>
//{
//	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
//	{
//		final String author = (String) source.getValues().get("author");
//		final String isbn = (String) source.getValues().get("isbn");
//		final String languages = (String) source.getValues().get("languages");
//		final String publisher = (String) source.getValues().get("publisher");
//		if (StringUtils.isNotEmpty(author))
//		{
//			target.setAuthor(author);
//		}
//		if (StringUtils.isNotEmpty(isbn))
//		{
//			target.setIsbn(isbn);
//		}
//		if (StringUtils.isNotEmpty(languages))
//		{
//			target.setLanguages(languages);
//		}
//		if (StringUtils.isNotEmpty(publisher))
//		{
//			target.setPublisher(publisher);
//		}
//	}
//}
