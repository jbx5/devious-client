import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public abstract class class166 {
	@ObfuscatedName("er")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	String field1784;

	@ObfuscatedSignature(descriptor = 
	"Lev;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lev;Ljava/lang/String;)V")

	class166(class155 var1, String var2) {
		this.this$0 = var1;
		this.field1784 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1689964957")

	public abstract int vmethod3341();

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-1535635597")

	public String vmethod3333() {
		return null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"31414")

	public int vmethod3334() {
		return -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-1565195200")

	public String method3336() {
		return this.field1784;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lqa;", garbageValue = 
	"29")

	public static PrivateChatMode method3343(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{ PrivateChatMode.field4739, PrivateChatMode.field4741, PrivateChatMode.field4738 };
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field4740) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-1")

	static int method3342() {
		if ((Client.archiveLoaders != null) && (Client.archiveLoadersDone < Client.archiveLoaders.size())) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader) (Client.archiveLoaders.get(var1))).loadedCount;
			}

			return (var0 * 10000) / Client.field782;
		} else {
			return 10000;
		}
	}
}