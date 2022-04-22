import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lnu;")

	static final DefaultsGroup field4311;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1482438781)

	@Export("group")
	final int group;
	static 
	{
		field4311 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"1715985756")

	static void method6936(Buffer var0, int var1) {
		UserComparator6.method2646(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}