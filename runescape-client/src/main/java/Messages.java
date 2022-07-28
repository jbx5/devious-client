import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Map;
import net.runelite.mapping.Export;
@ObfuscatedName("cv")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("o")
	@Export("Messages_channels")
	static final Map Messages_channels = new HashMap();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lme;")
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1010766709)
	@Export("Messages_count")
	static int Messages_count = 0;

	@ObfuscatedName("j")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([BI)Lic;", garbageValue = "-202834895")
	static WorldMapSprite method2574(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class147.method3105(var0).pixels);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lpl;ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "-1561852450")
	static String method2575(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = ((ObjectNode) (var0.get(((long) (var1)))));
			return var3 == null ? var2 : ((String) (var3.obj));
		}
	}
}