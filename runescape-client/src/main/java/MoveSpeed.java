import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3052((byte)-1, 0.0F),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3046((byte)0, 0.5F),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3048((byte)1, 1.0F),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3057((byte)2, 2.0F),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3050((byte)3, 1.5F),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3051((byte)4, 2.5F),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3049((byte)5, 3.0F),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3053((byte)6, 3.5F),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	field3047((byte)7, 4.0F);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	static MoveSpeed[] field3056;
	@ObfuscatedName("jj")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("at")
	@Export("id")
	final byte id;

	static {
		MoveSpeed[] var0 = new MoveSpeed[]{field3057, field3046, field3051, field3049, field3052, field3053, field3047, field3048, field3050};
		field3056 = var0;
		StringBuilder var4 = new StringBuilder();
		MoveSpeed[] var1 = field3056;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			var4.append(var3.id);
			var4.append(", ");
		}

		String var5 = var4.toString();
		var5.substring(0, var5.length() - 2);
	}

	@ObfuscatedSignature(
		descriptor = "(BF)V",
		garbageValue = "0.0"
	)
	MoveSpeed(byte var3, float var4) {
		this.id = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-39824382"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
		garbageValue = "1706507986"
	)
	static final void method5809(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (Decimator.method1168(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}
}
