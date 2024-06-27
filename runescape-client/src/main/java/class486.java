import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public class class486 implements class491 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	public final class521 field5032;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	class486(class522 var1) {
		this.field5032 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lss;)V"
	)
	public class486(class487 var1) {
		this(new class522(var1));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1502861188"
	)
	public int method8796(int var1) {
		return this.field5032.vmethod9300(var1);
	}
}
