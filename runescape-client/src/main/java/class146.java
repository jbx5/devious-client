import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public enum class146 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1675(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1682(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1674(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1673(3, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1678(4, 4),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1677(5, 5),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1672(6, 6),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1679(7, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1680(8, 8);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1461554183
	)
	final int field1681;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 259756147
	)
	final int field1676;

	class146(int var3, int var4) {
		this.field1681 = var3;
		this.field1676 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1676;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lpe;Ljava/util/ArrayList;I)Z",
		garbageValue = "1084939555"
	)
	public static boolean method3546(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class333.field3624 = var0;
		class319.field3303 = var1;
		class333.field3622 = var2;
		class333.field3626 = var3;
		return true;
	}
}
