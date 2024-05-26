import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class74 {
	@ObfuscatedName("af")
	static final BigInteger field920;
	@ObfuscatedName("aa")
	static final BigInteger field918;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Luh;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		field920 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field918 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("af")
	public static boolean method2110(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-33239390"
	)
	static void method2113() {
		if (class392.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-1284123860"
	)
	static void method2114(WorldView var0) {
		if (Client.renderSelf) {
			class425.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}
}
