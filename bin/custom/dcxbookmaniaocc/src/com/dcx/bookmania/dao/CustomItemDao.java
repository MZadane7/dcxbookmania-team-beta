/**
 *
 */
package com.dcx.bookmania.dao;

import java.util.List;

import com.dcx.bookmania.model.CustomItemModel;


/**
 *
 * @author sdutta2
 *
 */
public interface CustomItemDao
{
	public List<CustomItemModel> getCustomItems();


	public CustomItemModel getCustomItem(String code);
}