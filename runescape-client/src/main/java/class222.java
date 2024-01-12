import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public abstract class class222 {
	@ObfuscatedName("aj")
	String field2376;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	final class219 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lih;Ljava/lang/String;)V"
	)
	class222(class219 var1, String var2) {
		this.this$0 = var1;
		this.field2376 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "945435280"
	)
	public abstract int vmethod4368();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1115253500"
	)
	public int vmethod4370() {
		return -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1875884586"
	)
	public String vmethod4369() {
		return null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1357718894"
	)
	public String method4376() {
		return this.field2376;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIIB)V",
		garbageValue = "13"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3779 == null) {
			throw new RuntimeException();
		} else {
			var0.field3779[var1] = var2;
			var0.field3787[var1] = var3;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "3"
	)
	static int method4381(int var0, Script var1, boolean var2) {
		return 2;
	}
}
