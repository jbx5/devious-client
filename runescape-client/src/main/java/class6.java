import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public enum class6 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	field12(0, 0);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1286983601
	)
	final int field13;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 244219453
	)
	final int field11;

	class6(int var3, int var4) {
		this.field13 = var3;
		this.field11 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field11;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "49"
	)
	static final void method40(String var0) {
		SecureRandomCallable.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1441606661"
	)
	static void method42(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.method2680(var4);
					break;
				}
			}
		}

	}
}
