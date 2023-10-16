/**
 *
 */
package com.dcx.bookmania.controllers;

import de.hybris.platform.commercewebservicescommons.dto.customitem.CustomItemWSDTO;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcx.bookmania.facades.CustomItemFacade;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;


/**
 * @author sdutta2
 *
 */

@Controller
@RequestMapping(value = "/{baseSiteId}/customitem")
@Tag(name = "CustomItem")
public class CustomItemController extends DcxbookmaniaoccController
{
	protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
	@Resource(name = "customItemFacade")
	private CustomItemFacade customItemFacade;

	@Resource(name = "dataMapper")
	private DataMapper dataMapper;

	@RequestMapping(value = "/{customItemId}")
	@ResponseBody
	@Operation(operationId = "getCustomItem", summary = "Get a specific CustomItem Details", description = "Return a specific CustomItem Details")
	@ApiBaseSiteIdParam
	public CustomItemWSDTO getCustomItem(@Parameter(description = "customItemId", required = true)
	@PathVariable
	final String customItemId, @ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		return dataMapper.map(customItemFacade.getCustomItem(customItemId), CustomItemWSDTO.class, fields);
	}
}
