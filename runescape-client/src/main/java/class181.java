import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public abstract class class181 {
	@ObfuscatedName("at")
	String field1910;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;Ljava/lang/String;)V"
	)
	class181(class170 var1, String var2) {
		this.this$0 = var1;
		this.field1910 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	public abstract int vmethod3528();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1557827941"
	)
	public String vmethod3518() {
		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1630105394"
	)
	public int vmethod3527() {
		return -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1802215739"
	)
	public String method3516() {
		return this.field1910;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method3532(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
