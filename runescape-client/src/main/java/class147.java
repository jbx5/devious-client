import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class147 extends class148 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 540726593
	)
	int field1672;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class147(class151 var1) {
		this.this$0 = var1;
		this.field1672 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1672 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3443(this.field1672);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1424929560"
	)
	public static void method3342() {
		class332.field3565.clear();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILnq;IIIII[FB)Lnq;",
		garbageValue = "0"
	)
	static Widget method3343(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)var1.width);
		var8.rawY = (int)(var7[1] * (float)var1.height);
		var8.rawWidth = (int)((float)var1.width * var7[2]);
		var8.rawHeight = (int)(var7[3] * (float)var1.height);
		return var8;
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1079471212"
	)
	static final int method3334() {
		return Client.menu.menuOptionsCount - 1;
	}
}
