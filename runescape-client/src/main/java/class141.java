import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.Reflection;
import net.runelite.mapping.Export;
@ObfuscatedName("ea")
public class class141 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1612165561)
	int field1642;

	@ObfuscatedName("q")
	byte field1643;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1820695807)
	int field1645;

	@ObfuscatedName("u")
	String field1644;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1642 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1897546377")
	void vmethod3146(Buffer var1) {
		var1.readUnsignedByte();
		this.field1642 = var1.readUnsignedShort();
		this.field1643 = var1.readByte();
		this.field1645 = var1.readUnsignedShort();
		var1.readLong();
		this.field1644 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "-406744366")
	void vmethod3145(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1642)));
		var2.rank = this.field1643;
		var2.world = this.field1645;
		var2.username = new Username(this.field1644);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIIIIB)I", garbageValue = "1")
	public static int method3060(int var0, int var1, int var2, int var3, int var4, int var5) {
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
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", garbageValue = "342406360")
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("a")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return ((int) (var0 >>> 17 & 4294967295L));
	}
}