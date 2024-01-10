import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1219042639
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("af")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("aj")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "232"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-51"
	)
	static void method1204(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.method2750(var4);
					break;
				}
			}
		}

	}
}
