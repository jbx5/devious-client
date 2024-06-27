import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class212 extends class227 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 729760543
	)
	int field2324;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;Ljava/lang/String;I)V"
	)
	class212(class224 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2324 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int vmethod4325() {
		return 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311136091"
	)
	public int vmethod4324() {
		return this.field2324;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-342383675"
	)
	public static boolean method4116(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class413.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Loz;",
		garbageValue = "-1251813792"
	)
	static Archive method4118(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class163.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, MouseHandler.masterDisk, class233.field2486, var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-656524545"
	)
	static final void method4108(int var0) {
		if (ModeWhere.widgetDefinition.loadInterface(var0)) {
			class455.drawModelComponents(ModeWhere.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
