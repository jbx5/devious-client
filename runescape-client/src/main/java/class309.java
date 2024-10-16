import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public abstract class class309 implements class311 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1445047783
	)
	protected int field3286;

	@ObfuscatedSignature(
		descriptor = "(Loy;Lpn;I)V"
	)
	protected class309(StudioGame var1, Language var2, int var3) {
		this.field3286 = var3;
	}

	@ObfuscatedName("ae")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "242602398"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + PcmPlayer.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}
}
