import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("vu")
	@ObfuscatedGetter(intValue = 793464983)
	@Export("foundItemIdCount")
	static int foundItemIdCount;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 834997317)
	static int field1212;

	@ObfuscatedName("fv")
	@ObfuscatedGetter(intValue = 1144016037)
	static int field1206;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1062197261)
	@Export("cycle")
	int cycle;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1440518285)
	@Export("health")
	int health;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 878626357)
	@Export("health2")
	int health2;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1008759007)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-384341292")
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;Llh;B)I", garbageValue = "-1")
	static int method2203(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field924;
		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}
		var3 = Login.field916;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}
		return var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "329398587")
	public static int method2199(int var0) {
		return var0 >>> 4 & class438.field4683;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1918682655")
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class353.client.method410();
			}
			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				HitSplatDefinition.method3624(0);
				Client.field512 = 0;
				Client.field609 = 0;
				Client.timer.method6528(var0);
				if (var0 != 20) {
					TriBool.method6791(false);
				}
			}
			if (var0 != 20 && var0 != 40 && Message.field461 != null) {
				Message.field461.close();
				Message.field461 = null;
			}
			if (Client.gameState == 25) {
				Client.field549 = 0;
				Client.field694 = 0;
				Client.field546 = 1;
				Client.field547 = 0;
				Client.field548 = 1;
			}
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = (Client.gameState == 11) ? 4 : 0;
					ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, false, var3);
				} else if (var0 == 11) {
					ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, false, 4);
				} else if (var0 == 50) {
					class101.setLoginResponseString("", "Updating date of birth...", "");
					ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, false, 7);
				} else if (Login.clearLoginScreen) {
					class4.titleboxSprite = null;
					class6.titlebuttonSprite = null;
					AbstractByteArrayCopier.runesSprite = null;
					class16.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					Login.logoSprite = null;
					class145.title_muteSprite = null;
					class345.options_buttons_0Sprite = null;
					class228.options_buttons_2Sprite = null;
					ScriptFrame.worldSelectBackSprites = null;
					class126.worldSelectFlagSprites = null;
					FriendSystem.worldSelectArrows = null;
					class220.worldSelectStars = null;
					UserComparator5.field1385 = null;
					Login.loginScreenRunesAnimation.method2209();
					class272.musicPlayerStatus = 1;
					class272.musicTrackArchive = null;
					class272.musicTrackGroupId = -1;
					class151.musicTrackFileId = -1;
					class272.musicTrackVolume = 0;
					class11.musicTrackBoolean = false;
					class272.pcmSampleLength = 2;
					class115.method2693(true);
					Login.clearLoginScreen = false;
				}
			} else {
				boolean var1 = class19.clientPreferences.method2266() >= Client.field482;
				int var2 = (var1) ? 0 : 12;
				ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, true, var2);
			}
			Client.gameState = var0;
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(descriptor = "(Llc;Ljava/lang/String;I)V", garbageValue = "1432577615")
	static void method2202(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field626 += var2.groupCount;
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1636421425")
	static void method2204() {
		if (Client.renderSelf) {
			ByteArrayPool.addPlayerToScene(class101.localPlayer, false);
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-12087")
	static void method2205() {
		Client.packetWriter.addNode(EnumComposition.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}