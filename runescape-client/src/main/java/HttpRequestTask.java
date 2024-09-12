import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final HttpRequest field77;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lab;Lal;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field77 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field77.connect()) {
				FileSystem.method4499(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field77.getResponse();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-104"
	)
	public static void method287() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILsl;Lof;I)V",
		garbageValue = "-1327203562"
	)
	static void method288(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-44"
	)
	public static boolean method283(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "750403665"
	)
	static final int method286(int var0, int var1) {
		int var2 = class195.method4015(var0 - 1, var1 - 1) + class195.method4015(var0 + 1, var1 - 1) + class195.method4015(var0 - 1, var1 + 1) + class195.method4015(var0 + 1, 1 + var1);
		int var3 = class195.method4015(var0 - 1, var1) + class195.method4015(var0 + 1, var1) + class195.method4015(var0, var1 - 1) + class195.method4015(var0, var1 + 1);
		int var4 = class195.method4015(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "45"
	)
	public static int method282(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
