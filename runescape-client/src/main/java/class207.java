import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class207 extends class219 {
	@ObfuscatedName("at")
	String field2248;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class208 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class207(class208 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2248 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "561834394"
	)
	public int vmethod4266() {
		return 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "18"
	)
	public String vmethod4250() {
		return this.field2248;
	}

	@ObfuscatedName("ah")
	public static boolean method4113(long var0) {
		boolean var2 = var0 != 0L;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}
}
