import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("aq")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ad")
	boolean field1083;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -776132997
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1323625187
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1437104327
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1018815261
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1997341365
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ai")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 487300869
	)
	int field1090;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1628898499
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "18"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "398551351"
	)
	public void method2378(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "-1681573882"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				ItemComposition.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = class7.archive8;
			int var2 = var0.properties;
			if ((var2 & class542.field5320.rsOrdinal()) != 0) {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & class542.field5347.rsOrdinal()) != 0) {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else if ((var2 & class542.field5325.rsOrdinal()) != 0) {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", "");
			} else {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		HttpResponse.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class401.field4618 = var0.field819;
		NPCComposition.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class33.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class169.currentPort = NPCComposition.worldPort;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "414622425"
	)
	static final void method2384(int var0, int var1, boolean var2) {
		if (!var2 || var0 != Skeleton.field2915 || PlayerUpdateManager.field1418 != var1) {
			Skeleton.field2915 = var0;
			PlayerUpdateManager.field1418 = var1;
			ClanChannelMember.updateGameState(25);
			Client.field509 = true;
			class59.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class511.topLevelWorldView.baseX;
			int var4 = class511.topLevelWorldView.baseY;
			class511.topLevelWorldView.baseX = (var0 - 6) * 8;
			class511.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class511.topLevelWorldView.baseX - var3;
			int var6 = class511.topLevelWorldView.baseY - var4;
			var3 = class511.topLevelWorldView.baseX;
			var4 = class511.topLevelWorldView.baseY;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) {
				NPC var19 = class511.topLevelWorldView.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = class511.topLevelWorldView.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				WorldEntity var23 = class511.topLevelWorldView.worldEntities[var7];
				if (var23 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var23.field4974;
						var10000[var9] -= var5;
						var10000 = var23.field4965;
						var10000[var9] -= var6;
					}

					var23.field4967 -= var5 * 128;
					var23.field4969 -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (0 <= var15 && var15 < 104 && 0 <= var16 && var16 < 104) {
							class511.topLevelWorldView.groundItems[var17][var13][var14] = class511.topLevelWorldView.groundItems[var17][var15][var16];
						} else {
							class511.topLevelWorldView.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)class511.topLevelWorldView.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)class511.topLevelWorldView.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || 104 <= var18.x || var18.y < 0 || 104 <= var18.y) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			class47.cameraX -= var5 << 7;
			class60.cameraZ -= var6 << 7;
			class371.oculusOrbFocalPointX -= var5 << 7;
			PacketBufferNode.oculusOrbFocalPointY -= var6 << 7;
			Client.field632 = -1;
			class511.topLevelWorldView.graphicsObjects.clear();
			class511.topLevelWorldView.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				class511.topLevelWorldView.collisionMaps[var14].clear();
			}

		}
	}
}
