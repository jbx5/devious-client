import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class195 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field2022")
	public static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2052;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Ldg;",
		garbageValue = "-1503991204"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = WorldEntity.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class154.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}
}
