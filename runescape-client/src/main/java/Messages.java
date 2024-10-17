import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ap")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -314072883
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "86"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? FontName.method9733(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static final void method3171(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		class430.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-2144662822"
	)
	static String method3176(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class145.field1668 != null) {
			var3 = "/p=" + class145.field1668;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + WorldMapCacheName.clientLanguage + "/a=" + BZip2State.field5507 + var3 + "/";
	}
}
