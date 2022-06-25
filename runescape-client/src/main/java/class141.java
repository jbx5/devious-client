import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ec")
public class class141 extends class144 {
	@ObfuscatedName("jm")
	@ObfuscatedGetter(intValue = -1799721325)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1400461077)
	int field1659;

	@ObfuscatedName("v")
	byte field1660;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1585058459)
	int field1658;

	@ObfuscatedName("f")
	String field1656;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;)V")
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1659 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "355261812")
	void vmethod3137(Buffer var1) {
		var1.readUnsignedByte();
		this.field1659 = var1.readUnsignedShort();
		this.field1660 = var1.readByte();
		this.field1658 = var1.readUnsignedShort();
		var1.readLong();
		this.field1656 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lex;I)V", garbageValue = "1368590037")
	void vmethod3138(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1659)));
		var2.rank = this.field1660;
		var2.world = this.field1658;
		var2.username = new Username(this.field1656);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-113948023")
	public static int method3048(int var0) {
		return (var0 & class438.field4680) - 1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIIIII)I", garbageValue = "-612042966")
	public static int method3044(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1644827355")
	public static void method3047() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}
}