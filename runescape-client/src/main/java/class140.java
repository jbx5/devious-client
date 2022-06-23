import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ei")
public class class140 extends class144 {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive2")
	static Archive archive2;

	@ObfuscatedName("c")
	String field1655;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 718016379)
	int field1651;

	@ObfuscatedName("q")
	byte field1652;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;)V")
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1655 = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "355261812")
	void vmethod3137(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}
		this.field1655 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1651 = var1.readUnsignedShort();
		this.field1652 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lex;I)V", garbageValue = "1368590037")
	void vmethod3138(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1655);
		var2.world = this.field1651;
		var2.rank = this.field1652;
		var1.addMember(var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Lkb;", garbageValue = "1295683453")
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (SoundCache.Widget_interfaceComponents[var1] == null || SoundCache.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = WorldMapSection2.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}
		return SoundCache.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(IIZI)Ljava/lang/String;", garbageValue = "1221665034")
	static String method3038(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;
				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}
				char[] var5 = new char[var3];
				var5[0] = '+';
				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = ((char) (var8 + 87));
					} else {
						var5[var6] = ((char) (var8 + 48));
					}
				}
				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}