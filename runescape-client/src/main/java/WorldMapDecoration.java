import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 621533651
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -31802257
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1589480589
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "90246290"
	)
	static void method5034() {
		if (Login.clearLoginScreen) {
			class155.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			Login.leftTitleSprite = null;
			WorldMapLabelSize.rightTitleSprite = null;
			Login.logoSprite = null;
			class169.title_muteSprite = null;
			class128.options_buttons_0Sprite = null;
			class472.options_buttons_2Sprite = null;
			Timer.worldSelectBackSprites = null;
			class162.worldSelectFlagSprites = null;
			World.worldSelectArrows = null;
			Frames.worldSelectStars = null;
			ModeWhere.field4514 = null;
			class325.loginScreenRunesAnimation.method2514();
			class169.method3521(0, 100);
			Fonts.method9109().method7212(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-848566446"
	)
	public static int method5032(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 14 & 3L);
		return var1;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "-69"
	)
	static void method5033(class93 var0) {
		if (Client.field553 != var0) {
			Client.field553 = var0;
		}
	}
}
