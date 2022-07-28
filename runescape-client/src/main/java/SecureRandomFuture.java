import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
@ObfuscatedName("bh")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("o")
	@Export("executor")
	ExecutorService executor = Executors.newSingleThreadExecutor();

	@ObfuscatedName("q")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2030157363")
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1383304538")
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Ljava/security/SecureRandom;", garbageValue = "-26")
	@Export("get")
	SecureRandom get() {
		try {
			return ((SecureRandom) (this.future.get()));
		} catch (Exception var2) {
			return LoginScreenAnimation.method2306();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)[Lqb;", garbageValue = "-1140507063")
	static PrivateChatMode[] method2010() {
		return new PrivateChatMode[]{ PrivateChatMode.field4828, PrivateChatMode.field4825, PrivateChatMode.field4827 };
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "([BIII)Z", garbageValue = "-1887656692")
	static final boolean method2022(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;
		label66 : while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label66;
					}
					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = WorldMapDecoration.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field609;
								var3 = false;
							}
							var8 = true;
						}
					}
				} 
				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}
				var4.readUnsignedByte();
			} 
		} 
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "-119")
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}
			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var9 * var7 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}
}