package net.runelite.rs.api;

import net.runelite.api.ItemComposition;
import net.runelite.api.IterableHashTable;
import net.runelite.mapping.Import;

public interface RSItemComposition extends ItemComposition
{
	@Import("name")
	@Override
	String getName();

	@Import("name")
	@Override
	void setName(String name);

	@Import("id")
	@Override
	int getId();

	@Import("noteTemplate")
	@Override
	int getNote();

	@Import("note")
	@Override
	int getLinkedNoteId();

	@Import("placeholder")
	@Override
	int getPlaceholderId();

	@Import("placeholderTemplate")
	@Override
	int getPlaceholderTemplateId();

	@Import("price")
	@Override
	int getPrice();

	@Import("isMembersOnly")
	@Override
	boolean isMembers();

	@Import("isTradable")
	@Override
	boolean isTradeable();

	@Import("isTradable")
	@Override
	void setTradeable(boolean yes);

	/**
	 * You probably want {@link #isStackable}
	 * <p>
	 * This is the <b>{@code int}</b> that client code uses internally to represent this true/false value. It appears to only ever be set to 1 or 0
	 * @return 0 when this type of item isn't stackable, 1 otherwise
	 */
	@Import("isStackable")
	int getIsStackable();

	@Import("maleModel")
	int getMaleModel();

	@Import("inventoryActions")
	@Override
	String[] getInventoryActions();

	@Import("groundActions")
	@Override
	String[] getGroundActions();

	@Import("getShiftClickIndex")
	@Override
	int getShiftClickActionIndex();

	@Import("getModel")
	RSModel getModel(int quantity);

	@Import("model")
	int getInventoryModel();

	@Import("model")
	void setInventoryModel(int model);

	@Import("recolorTo")
	short[] getColorToReplaceWith();

	@Import("recolorTo")
	void setColorToReplaceWith(short[] color);

	@Import("recolorFrom")
	short[] getColorToReplace();

	@Import("recolorFrom")
	void setColorToReplace(short[] color);

	@Import("retextureTo")
	short[] getTextureToReplaceWith();

	@Import("retextureTo")
	void setTextureToReplaceWith(short[] texture);

	@Import("retextureFrom")
	short[] getTextureToReplace();

	@Import("retextureFrom")
	void setTextureToReplace(short[] texture);

	@Import("zoom2d")
	int getModelZoom();

	@Import("zoom2d")
	void setModelZoom(int zoom);

	@Import("offsetX2d")
	int getOffsetX();

	@Import("offsetX2d")
	void setOffsetX(int offsetX);

	@Import("offsetY2d")
	int getOffsetY();

	@Import("offsetY2d")
	void setOffsetY(int offsetY);

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(IterableHashTable params);

	@Import("params")
	void setParams(RSIterableNodeHashTable params);

	@Import("xan2d")
	@Override
	int getXan2d();

	@Import("yan2d")
	@Override
	int getYan2d();

	@Import("zan2d")
	@Override
	int getZan2d();

	@Import("xan2d")
	@Override
	void setXan2d(int angle);

	@Import("yan2d")
	@Override
	void setYan2d(int angle);

	@Import("zan2d")
	@Override
	void setZan2d(int angle);

	@Import("ambient")
	@Override
	int getAmbient();

	@Import("ambient")
	@Override
	void setAmbient(int ambient);

	@Import("contrast")
	@Override
	int getContrast();

	@Import("contrast")
	@Override
	void setContrast(int contrast);
}