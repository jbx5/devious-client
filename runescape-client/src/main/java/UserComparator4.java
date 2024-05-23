import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("af")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("jr")
	static int[] field1495;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 983493133
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;B)I",
		garbageValue = "-12"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;I)V",
		garbageValue = "1898937873"
	)
	public static void method2955(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}
}
