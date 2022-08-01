import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.awt.Image;
import net.runelite.mapping.Export;
@ObfuscatedName("cg")
public enum class82 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lcg;")
	field1072(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lcg;")
	field1062(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lcg;")
	field1069(2, 7),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lcg;")
	field1065(3, 8),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lcg;")
	field1064(4, 9);
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lak;")
	@Export("pcmPlayerProvider")
	public static class47 pcmPlayerProvider;

	@ObfuscatedName("ah")
	static Image field1066;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1199149819)
	final int field1067;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1326578977)
	final int field1068;

	class82(int var3, int var4) {
		this.field1067 = var3;
		this.field1068 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1068;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-780421281")
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "2076696514")
	public static int method2179(int var0) {
		return class141.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1628556325")
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class329.client.method442();
			}
			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				GameBuild.method5758(0);
				Client.field516 = 0;
				Client.field766 = 0;
				Client.timer.method6554(var0);
				if (var0 != 20) {
					FriendSystem.method1762(false);
				}
			}
			if (var0 != 20 && var0 != 40 && class240.field2847 != null) {
				class240.field2847.close();
				class240.field2847 = null;
			}
			if (Client.gameState == 25) {
				Client.field552 = 0;
				Client.field613 = 0;
				Client.field774 = 1;
				Client.field609 = 0;
				Client.field551 = 1;
			}
			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = (Client.gameState == 11) ? 4 : 0;
					class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, false, var1);
				} else if (var0 == 11) {
					class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, false, 4);
				} else if (var0 == 50) {
					HealthBarUpdate.setLoginResponseString("", "Updating date of birth...", "");
					class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, false, 7);
				} else if (Login.clearLoginScreen) {
					class7.titleboxSprite = null;
					class229.titlebuttonSprite = null;
					Login.runesSprite = null;
					SpriteMask.leftTitleSprite = null;
					class356.rightTitleSprite = null;
					Canvas.logoSprite = null;
					Login.title_muteSprite = null;
					class11.options_buttons_0Sprite = null;
					Login.options_buttons_2Sprite = null;
					class12.worldSelectBackSprites = null;
					VerticalAlignment.worldSelectFlagSprites = null;
					Login.worldSelectArrows = null;
					class12.worldSelectStars = null;
					Login.field931 = null;
					RouteStrategy.loginScreenRunesAnimation.method2275();
					class273.musicPlayerStatus = 1;
					class149.musicTrackArchive = null;
					class273.musicTrackGroupId = -1;
					UserComparator6.musicTrackFileId = -1;
					class273.musicTrackVolume = 0;
					class347.musicTrackBoolean = false;
					FaceNormal.pcmSampleLength = 2;
					StructComposition.method3597(true);
					Login.clearLoginScreen = false;
				}
			} else {
				var1 = (AbstractWorldMapIcon.method5047()) ? 0 : 12;
				class240.method4988(Actor.archive10, AbstractWorldMapData.archive8, true, var1);
			}
			Client.gameState = var0;
		}
	}
}