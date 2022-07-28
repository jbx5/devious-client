import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.math.BigInteger;
import net.runelite.mapping.Export;
@ObfuscatedName("br")
public class class65 {
	@ObfuscatedName("c")
	static final BigInteger field864 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@ObfuscatedName("w")
	static final BigInteger field865 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	@ObfuscatedName("gd")
	static String field874;

	@ObfuscatedName("in")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("ik")
	@ObfuscatedSignature(descriptor = "(IIIIIIIIII)V", garbageValue = "1706046747")
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;
		for (PendingSpawn var10 = ((PendingSpawn) (Client.pendingSpawns.last())); var10 != null; var10 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			UrlRequester.method2621(var9);
			Client.pendingSpawns.addFirst(var9);
		}
		var9.id = var4;
		var9.field1123 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}