import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public abstract class class486 extends class305 implements class553 {
	@ObfuscatedSignature(
		descriptor = "(Loz;Lpl;I)V"
	)
	protected class486(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsp;",
		garbageValue = "89"
	)
	protected abstract class488 vmethod9465(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-411117179"
	)
	public int method8899() {
		return super.field3251;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "2"
	)
	public Object vmethod9962(int var1) {
		class488 var2 = this.vmethod9465(var1);
		return var2 != null && var2.method8916() ? var2.method8922() : null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)Lvf;",
		garbageValue = "-1249756219"
	)
	public class554 method8901(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class488 var3 = this.vmethod9465(var2);
		class554 var4 = new class554(var2);
		Class var5 = var3.field5010.field5268;
		if (var5 == Integer.class) {
			var4.field5410 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5410 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5410 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class549.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class549 var6 = (class549)var5.newInstance();
				var6.method9937(var1);
				var4.field5410 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1721653102"
	)
	@Export("invalidateWidgetsUnder")
	static final void invalidateWidgetsUnder(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}
}
