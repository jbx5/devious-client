import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.math.BigInteger;
import net.runelite.mapping.Export;
@ObfuscatedName("bx")
public class class65 {
	@ObfuscatedName("c")
	static final BigInteger field849 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@ObfuscatedName("q")
	static final BigInteger field850 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	@ObfuscatedName("dk")
	@ObfuscatedSignature(descriptor = "(B)Los;", garbageValue = "55")
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ClientPacket.worldMap;
	}
}