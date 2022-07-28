import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("eg")
public class class154 extends class165 {
	@ObfuscatedName("o")
	String field1704;

	@ObfuscatedSignature(descriptor = "Lef;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Lef;Ljava/lang/String;Ljava/lang/String;)V")
	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1704 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "28")
	public int vmethod3296() {
		return 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "545550273")
	public String vmethod3297() {
		return this.field1704;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Ljava/lang/String;Ljava/lang/String;IZI)V", garbageValue = "347072849")
	public static void method3167(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1);
		int var6 = var0.getFileId(var5, var2);
		FriendsChat.method6678(var0, var5, var6, var3, var4);
	}
}