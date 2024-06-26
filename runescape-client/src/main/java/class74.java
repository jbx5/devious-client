import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class74 {
	@ObfuscatedName("ap")
	static final BigInteger field888;
	@ObfuscatedName("an")
	static final BigInteger field897;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1184752429
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("at")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	static {
		field888 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field897 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "-1576997866"
	)
	public static void method2158(AbstractArchive var0) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "51"
	)
	static int method2159(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "552886810"
	)
	protected static final int method2155() {
		return GameEngine.keyHandler.method354();
	}
}
