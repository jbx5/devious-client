import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class177 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V",
		garbageValue = "-1334872459"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		SongTask.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lvi;",
		garbageValue = "-1248794564"
	)
	public static PrivateChatMode method3562(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5341, PrivateChatMode.field5343, PrivateChatMode.field5340};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5342) {
				return var4;
			}
		}

		return null;
	}
}
