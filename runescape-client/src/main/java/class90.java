import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public enum class90 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1126(0, -1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1118(1, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1119(2, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1121(3, 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1125(4, 5),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1122(5, 6);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static Bounds field1117;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1055124911
	)
	final int field1123;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 178610013
	)
	final int field1124;

	class90(int var3, int var4) {
		this.field1123 = var3;
		this.field1124 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1124;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhw;",
		garbageValue = "0"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
