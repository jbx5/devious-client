import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class215 extends class230 {
	@ObfuscatedName("ju")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2122351177
	)
	int field2349;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lik;Ljava/lang/String;I)V"
	)
	class215(class227 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2349 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "780036752"
	)
	public int vmethod4660() {
		return 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1828104343"
	)
	public int vmethod4648() {
		return this.field2349;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "620281549"
	)
	static boolean method4423(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}
}
