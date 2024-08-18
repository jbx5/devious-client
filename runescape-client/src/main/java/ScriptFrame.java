import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 407874701
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("an")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("au")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Loz;",
		garbageValue = "-600768983"
	)
	public static GameBuild method1158(int var0) {
		GameBuild[] var1 = class145.method3323();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}
}
