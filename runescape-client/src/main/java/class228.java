import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class228 {
	@ObfuscatedName("aj")
	public String field2449;
	@ObfuscatedName("ai")
	public float[] field2451;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1403707769
	)
	public int field2450;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1920122833
	)
	public int field2447;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1399060227
	)
	public int field2453;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	class228(class227 var1) {
		this.this$0 = var1;
		this.field2451 = new float[4];
		this.field2450 = 1;
		this.field2447 = 1;
		this.field2453 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Lda;",
		garbageValue = "2047714853"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class1.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class1.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = InterfaceParent.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}
}
