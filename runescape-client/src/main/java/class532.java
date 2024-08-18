import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
final class class532 implements class531 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 11704315
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvg;I)V",
		garbageValue = "-663284636"
	)
	public void vmethod9472(Object var1, Buffer var2) {
		this.method9425((Integer)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)Ljava/lang/Object;",
		garbageValue = "1930105909"
	)
	public Object vmethod9476(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvg;I)V",
		garbageValue = "-1927305335"
	)
	void method9425(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I[B[BI)V",
		garbageValue = "2139853348"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3879 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3879 = new byte[11][];
			var0.field3880 = new byte[11][];
			var0.field3881 = new int[11];
			var0.field3832 = new int[11];
		}

		var0.field3879[var1] = var2;
		if (var2 != null) {
			var0.field3878 = true;
		} else {
			var0.field3878 = false;

			for (int var4 = 0; var4 < var0.field3879.length; ++var4) {
				if (var0.field3879[var4] != null) {
					var0.field3878 = true;
					break;
				}
			}
		}

		var0.field3880[var1] = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-112"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}
