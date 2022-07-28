import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hi")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lfw;", garbageValue = "-1623751834")
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = ((InvDefinition) (InvDefinition.InvDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			InvDefinition.InvDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-1298132277")
	public static int method4493(int var0, int var1, int var2) {
		int var3 = ScriptEvent.method2168(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}
}