package net.runelite.rs.api;

import net.runelite.api.CollisionData;
import net.runelite.api.WorldView;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSWorldView extends WorldView
{
	@Import("id")
	@Override
	int getId();

	@Import("scene")
	@Override
	RSScene getScene();

	@Import("players")
	RSPlayer[] getPlayers();

	@Import("playerUpdateManager")
	RSPlayerUpdateManager getPlayerUpdateManager();

	@Import("npcs")
	RSNPC[] getNpcs();

	@Import("npcCount")
	int getNpcCount();

	@Import("npcIndices")
	int[] getNpcIndices();

	@Import("worldEntities")
	RSWorldEntity[] getWorldEntities();

	@Import("worldEntityCount")
	int getWorldEntityCount();

	@Import("worldEntityIndices")
	int[] getWorldEntityIndices();

	@Import("groundItems")
	RSNodeDeque[][][] getGroundItems();

	@Construct
	RSProjectile newProjectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11);

	@Import("projectiles")
	@Override
	RSNodeDeque getProjectiles();

	@Import("graphicsObjects")
	@Override
	RSNodeDeque getGraphicsObjects();

	@Import("collisionMaps")
	@Override
	CollisionData[] getCollisionMaps();

	@Import("plane")
	@Override
	int getPlane();

	@Import("tileLastDrawnActor")
	int[][] getOccupiedTilesTick();

	@Import("tileHeights")
	@Override
	int[][][] getTileHeights();

	@Import("tileSettings")
	@Override
	byte[][][] getTileSettings();

	@Import("sizeX")
	//@Override
	int getSizeX();

	@Import("sizeY")
	//@Override
	int getSizeY();

	@Import("baseX")
	@Override
	int getBaseX();

	@Import("baseY")
	@Override
	int getBaseY();

	@Import("isInInstance")
	//@Override
	boolean isInstance();

	@Import("instanceChunkTemplates")
	//@Override
	int[][][] getInstanceTemplateChunks();
}
