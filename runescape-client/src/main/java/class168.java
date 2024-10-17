import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class168 extends class150 {
	@ObfuscatedName("as")
	static boolean[] field1826;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1614944343
	)
	int field1824;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1144801195
	)
	int field1823;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class168(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1824 = var1.readInt();
		this.field1823 = var1.readInt();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3668(this.field1824, this.field1823);
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	static void method3777() {
		HttpMethod.compass = null;
		class424.redHintArrowSprite = null;
		class420.mapSceneSprites = null;
		class320.headIconPkSprites = null;
		class539.headIconPrayerSprites = null;
		LoginState.headIconHintSprites = null;
		class136.mapDotSprites = null;
		class278.crossSprites = null;
		GraphicsObject.field892 = null;
		class147.scrollBarSprites = null;
		class491.field5088 = null;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "541043697"
	)
	static final void method3772(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = (float)var0 / 200.0F + 0.5F;
		FriendSystem.method2071((double)var1);
	}
}
