package net.runelite.rs.api;

import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Renderable;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSScene extends Scene
{
	@Import("tempGameObjects")
	RSGameObject[] getObjects();

	@Import("tiles")
	@Override
	RSTile[][][] getTiles();

	@Import("tileShape2D")
	int[][] getTileShape2D();

	@Import("tileRotation2D")
	int[][] getTileRotation2D();

	@Import("drawTile")
	void draw(RSProjection projection, Tile tile, boolean var2);

	@Import("tileHeights")
	@Override
	int[][][] getTileHeights();

	@Import("drawTileMinimap")
	void drawTile(int[] pixels, int pixelOffset, int width, int z, int x, int y);

	@Import("occlude")
	void updateOccluders();

	@Import("xSize")
	int getMaxX();

	@Import("planes")
	int getMaxY();

	@Import("ySize")
	int getMaxZ();

	@Import("minPlane")
	int getMinLevel();

	@Import("minPlane")
	void setMinLevel(int lvl);

	@Import("newGroundItemPile")
	void newGroundItemPile(int plane, int x, int y, int hash, RSRenderable var5, long var6, RSRenderable var7, RSRenderable var8);

	@Import("newGameObject")
	boolean newGameObject(int plane, int startX, int startY, int var4, int var5, int centerX, int centerY, int height, RSRenderable entity, int orientation, boolean tmp, long tag, int flags);

	@Import("removeGameObject")
	void removeGameObject(GameObject gameObject);

	@Import("removeGameObject")
	void removeGameObject(int plane, int x, int y);

	void removeWallObject(WallObject wallObject);

	@Import("removeBoundaryObject")
	void removeWallObject(int plane, int x, int y);

	void removeDecorativeObject(DecorativeObject decorativeObject);

	@Import("removeWallDecoration")
	void removeDecorativeObject(int plane, int x, int y);

	void removeGroundObject(GroundObject groundObject);

	@Import("removeFloorDecoration")
	void removeGroundObject(int plane, int x, int y);

	@Override
	short[][][] getUnderlayIds();
	void setUnderlayIds(short[][][] underlayIds);

	@Override
	short[][][] getOverlayIds();
	void setOverlayIds(short[][][] overlayIds);

	@Override
	byte[][][] getTileShapes();
	void setTileShapes(byte[][][] tileShapes);

	@Import("baseX")
	@Override
	int getBaseX();

	@Import("baseX")
	@Override
	void setBaseX(int x);

	@Import("baseY")
	@Override
	int getBaseY();

	@Import("baseY")
	@Override
	void setBaseY(int y);

	@Import("viewportWalking")
	@Override
	void setViewportWalking(boolean viewportWalking);

	@Import("isInInstance")
	@Override
	boolean isInstance();

	@Import("instanceChunkTemplates")
	@Override
	int[][][] getInstanceTemplateChunks();

	@Import("menuOpen")
	void menuOpen(int selectedPlane, int screenX, int screenY, boolean viewportWalking);

	@Import("drawEntity")
	boolean drawEntity(int level, int x, int y, int z, int radius, Renderable renderable, int orientation, long var8, boolean drawFrontTilesFirst);

	@Import("worldViewId")
	@Override
	int getWorldViewId();

	@Import("Scene_drawnCount")
	int getCycle();

	@Import("Scene_drawnCount")
	void setCycle(int cycle);

	//@Import("visibilityMap")
	//boolean[][][][] getVisibilityMaps();

	@Import("visibilityMap")
	void visibilityMap(int var1, int var2);

	@Import("visibleTiles")
	boolean setRenderArea(int var1, int var2);

	@Import("Scene_cameraX")
	int getCameraX2();

	@Import("Scene_cameraX")
	void setCameraX2(int cameraX2);

	@Import("Scene_cameraY")
	int getCameraY2();

	@Import("Scene_cameraY")
	void setCameraY2(int cameraY2);

	@Import("Scene_cameraZ")
	int getCameraZ2();

	@Import("Scene_cameraZ")
	void setCameraZ2(int cameraZ2);

	@Import("Scene_cameraXTile")
	int getScreenCenterX();

	@Import("Scene_cameraXTile")
	void setScreenCenterX(int screenCenterX);

	@Import("Scene_cameraYTile")
	int getScreenCenterZ();

	@Import("Scene_cameraYTile")
	void setScreenCenterZ(int screenCenterZ); // <-- This is correct!

	@Import("Scene_plane")
	void setScenePlane(int scenePlane);

	@Import("Scene_plane")
	int getScenePlane();

	@Import("Scene_cameraXTileMin")
	void setMinTileX(int i);

	@Import("Scene_cameraYTileMin")
	void setMinTileZ(int i); // <-- This is correct!

	@Import("Scene_cameraXTileMax")
	void setMaxTileX(int i);

	@Import("Scene_cameraYTileMax")
	void setMaxTileZ(int i); // <-- This is correct!

	@Import("tileUpdateCount")
	int getTileUpdateCount();

	@Import("tileUpdateCount")
	void setTileUpdateCount(int tileUpdateCount);

	@Import("Scene_selectedScreenX")
	int getMouseX2();

	@Import("Scene_selectedScreenY")
	int getMouseY2();

	@Import("Scene_selectedScreenX")
	void setMouseCanvasHoverPositionX(int x);

	@Import("Scene_selectedScreenY")
	void setMouseCanvasHoverPositionY(int y);

	/*@Import("Scene_selectedX")
	int getSelectedSceneTileX();

	@Import("Scene_selectedX")
	void setSelectedSceneTileX(int selectedSceneTileX);

	@Import("Scene_selectedY")
	int getSelectedSceneTileY();

	@Import("Scene_selectedY")
	void setSelectedSceneTileY(int selectedSceneTileY);*/

	@Import("Scene_tilesDeque")
	RSNodeDeque getTilesDeque();

	@Import("checkClick")
	boolean isCheckClick();

	@Import("checkClick")
	void setCheckClick(boolean checkClick);

	@Import("Scene_offsetOccluder")
	int getOffsetOccluder();

	@Import("Scene_offsetOccluder")
	void setOffsetOccluder(int offset);

	@Construct
	RSIntProjection newIntProjection(int cameraX, int cameraY, int cameraZ, int cameraPitch, int cameraYaw, int entityX, int entityY);

	void setTargetTile(int targetX, int targetY);
	void hoverTile(int x, int y, int plane);

	@Import("Scene_entityX")
	int getEntityX();

	@Import("Scene_entityX")
	void setEntityX(int x);

	@Import("Scene_entityY")
	int getEntityY();

	@Import("Scene_entityY")
	void setEntityY(int y);
}
