import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class254 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method5318() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIS)V",
		garbageValue = "-29759"
	)
	public static void method5316(ArrayList var0, int var1, int var2, int var3, int var4) {
		class333.field3628.clear();
		class333.field3628.addAll(var0);
		class333.musicPlayerStatus = var1;
		class333.field3631 = var2;
		class333.field3632 = var3;
		class333.field3633 = var4;
	}
}
