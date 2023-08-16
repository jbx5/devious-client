import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class72 {
	@ObfuscatedName("ac")
	static final BigInteger field910;
	@ObfuscatedName("ai")
	static final BigInteger field912;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 401845471
	)
	static int field906;

	static {
		field910 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field912 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1604625566"
	)
	static void method2078() {
		Client.compass = null;
		class167.redHintArrowSprite = null;
		class299.mapSceneSprites = null;
		class178.headIconPkSprites = null;
		class502.headIconPrayerSprites = null;
		ArchiveLoader.headIconHintSprites = null;
		Message.mapDotSprites = null;
		class152.crossSprites = null;
		FloorOverlayDefinition.field2289 = null;
		GrandExchangeOfferOwnWorldComparator.scrollBarSprites = null;
		class451.field4755 = null;
	}
}
