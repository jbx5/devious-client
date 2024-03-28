import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public abstract class class499 extends class500 {
	class499(int var1, int var2) {
		super(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public abstract int vmethod8668();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public abstract int vmethod8669();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-723802647"
	)
	public abstract int vmethod8674();

	@ObfuscatedName("az")
	public static final void method8677(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZS)V",
		garbageValue = "18179"
	)
	static void method8670(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.method2680(var5);
		if (Client.groundItems[var0][var1][var2] == null) {
			Client.groundItems[var0][var1][var2] = new NodeDeque();
		}

		Client.groundItems[var0][var1][var2].addFirst(var10);
		class477.updateItemPile(var0, var1, var2);
	}
}
