import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class149 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 399709583
	)
	int field1670;
	@ObfuscatedName("al")
	byte field1671;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class149(class148 var1) {
		this.this$0 = var1;
		this.field1670 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1670 = var1.readUnsignedShort();
		this.field1671 = var1.readByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3270(this.field1670, this.field1671);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-1818830164"
	)
	public static char method3180(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class399.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}
}
