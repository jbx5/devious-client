import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public abstract class class487 extends class306 implements class554 {
	@ObfuscatedSignature(
		descriptor = "(Lof;Lpe;I)V"
	)
	protected class487(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lsm;",
		garbageValue = "-114111951"
	)
	protected abstract class489 vmethod9367(int var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1524861563"
	)
	public int method8799() {
		return super.field3247;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-2090068814"
	)
	public Object vmethod9874(int var1) {
		class489 var2 = this.vmethod9367(var1);
		return var2 != null && var2.method8820() ? var2.method8821() : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)Lvt;",
		garbageValue = "-683314488"
	)
	public class555 method8802(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class489 var3 = this.vmethod9367(var2);
		class555 var4 = new class555(var2);
		Class var5 = var3.field5037.field5291;
		if (var5 == Integer.class) {
			var4.field5429 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5429 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5429 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class550.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class550 var6 = (class550)var5.newInstance();
				var6.method9850(var1);
				var4.field5429 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-22"
	)
	static int method8812() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field574;
		} else {
			return 10000;
		}
	}
}
