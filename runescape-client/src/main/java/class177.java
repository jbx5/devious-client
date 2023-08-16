import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class177 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2047761837
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("at")
	public String field1892;
	@ObfuscatedName("ac")
	public float[] field1885;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1803921971
	)
	public int field1886;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 369211737
	)
	public int field1887;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 795093341
	)
	public int field1884;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class177(class170 var1) {
		this.this$0 = var1;
		this.field1885 = new float[4];
		this.field1886 = 1;
		this.field1887 = 1;
		this.field1884 = 0;
	}

	@ObfuscatedName("at")
	public static int method3494(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Ltm;S)V",
		garbageValue = "-22136"
	)
	static void method3495(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
