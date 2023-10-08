import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class159 extends class145 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 66299273
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("bi")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1325270049
	)
	int field1743;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class159(class148 var1) {
		this.this$0 = var1;
		this.field1743 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1743 = var1.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3246(this.field1743);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-914201451"
	)
	static boolean method3332() {
		Date var0;
		try {
			var0 = class20.method295();
		} catch (ParseException var7) {
			class19.method285("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			java.util.Calendar var2 = java.util.Calendar.getInstance();
			var2.set(1, var2.get(1) - 13);
			var2.set(5, var2.get(5) + 1);
			var2.set(11, 0);
			var2.set(12, 0);
			var2.set(13, 0);
			var2.set(14, 0);
			Date var3 = var2.getTime();
			boolean var4 = var0.before(var3);
			boolean var6 = class231.method4387(var0);
			if (!var6) {
				class19.method285("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var4) {
					class153.field1693 = 8388607;
				} else {
					class153.field1693 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}
}
