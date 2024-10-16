import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class217 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	public UrlRequest field2364;
	@ObfuscatedName("aw")
	public float[] field2365;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	class217(class227 var1) {
		this.this$0 = var1;
		this.field2365 = new float[4];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;Ljava/lang/String;I)I",
		garbageValue = "-667515978"
	)
	public static int method4484(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = PendingSpawn.method2713(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class364.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("au")
	static final void method4483(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIIIIIIIIB)V",
		garbageValue = "20"
	)
	static void method4485(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		NodeDeque var11 = var0.pendingSpawns;
		PendingSpawn var12 = null;

		for (PendingSpawn var13 = (PendingSpawn)var11.last(); var13 != null; var13 = (PendingSpawn)var11.previous()) {
			if (var13.plane == var1 && var2 == var13.x && var3 == var13.y && var4 == var13.type) {
				var12 = var13;
				break;
			}
		}

		if (var12 == null) {
			var12 = new PendingSpawn();
			var12.plane = var1;
			var12.type = var4;
			var12.x = var2;
			var12.y = var3;
			var12.field1214 = -1;
			PcmPlayer.method838(var0, var12);
			var11.addFirst(var12);
		}

		var12.field1200 = var5;
		var12.field1207 = var6;
		var12.field1206 = var7;
		var12.delay = var9;
		var12.hitpoints = var10;
		var12.method2702(var8);
	}
}
