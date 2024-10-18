import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public abstract class class230 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 1194114743
	)
	static int field2465;
	@ObfuscatedName("aj")
	String field2463;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lik;Ljava/lang/String;)V"
	)
	class230(class227 var1, String var2) {
		this.this$0 = var1;
		this.field2463 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "780036752"
	)
	public abstract int vmethod4660();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1828104343"
	)
	public int vmethod4648() {
		return -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "10"
	)
	public String vmethod4649() {
		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1140988183"
	)
	public String method4662() {
		return this.field2463;
	}
}
