import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class154 extends class147 {
	@ObfuscatedName("ai")
	@Export("osName")
	static String osName;
	@ObfuscatedName("ak")
	boolean field1739;
	@ObfuscatedName("al")
	byte field1736;
	@ObfuscatedName("aj")
	byte field1737;
	@ObfuscatedName("az")
	byte field1738;
	@ObfuscatedName("af")
	byte field1742;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class154(class150 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1739 = var1.readUnsignedByte() == 1;
		this.field1736 = var1.readByte();
		this.field1737 = var1.readByte();
		this.field1738 = var1.readByte();
		this.field1742 = var1.readByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.allowGuests = this.field1739;
		var1.field1767 = this.field1736;
		var1.field1768 = this.field1737;
		var1.field1773 = this.field1738;
		var1.field1770 = this.field1742;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1623442927"
	)
	public static int method3288(int var0) {
		return (var0 & class539.field5291) - 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	static void method3294() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			InvDefinition.leftTitleSprite = null;
			Login.rightTitleSprite = null;
			class91.logoSprite = null;
			class433.title_muteSprite = null;
			class397.options_buttons_0Sprite = null;
			class206.options_buttons_2Sprite = null;
			class47.worldSelectBackSprites = null;
			class428.worldSelectFlagSprites = null;
			ClanChannelMember.worldSelectArrows = null;
			Skills.worldSelectStars = null;
			FloorUnderlayDefinition.field2215 = null;
			class239.loginScreenRunesAnimation.method2473();
			Skills.method7123(0, 100);
			JagNetThread var0 = HttpMethod.field32;
			var0.method7335(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1316147536"
	)
	static String method3293(String var0) {
		PlayerType[] var1 = class108.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class322.method6186(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
