import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public final class class4 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgd;",
		garbageValue = "5"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 48
		if (var1 != null) { // L: 49
			return var1; // L: 50
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 52
			var1 = new SequenceDefinition(); // L: 53
			if (var2 != null) { // L: 54
				var1.decode(new Buffer(var2)); // L: 55
			}

			var1.postDecode(); // L: 57
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 58
			return var1; // L: 59
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfq;",
		garbageValue = "0"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
