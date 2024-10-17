import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static ClanChannel field294;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field293;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	NodeHashTable field290;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field290 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field293 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbt;",
		garbageValue = "-1000053259"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method870(var1, var2, false);
		class53 var6 = (class53)this.field290.get(var4);
		if (var6 != null) {
			return var6.method1123();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field290.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Lcb;",
		garbageValue = "-2052314623"
	)
	class53 method864(int var1, int var2) {
		long var3 = this.method870(var1, var2, true);
		class53 var5 = (class53)this.field290.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field293, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field290.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbt;",
		garbageValue = "1"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcb;",
		garbageValue = "-1"
	)
	public class53 method865(int var1) {
		if (this.field293.getGroupCount() == 1) {
			return this.method864(0, var1);
		} else if (this.field293.getGroupFileCount(var1) == 1) {
			return this.method864(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbt;",
		garbageValue = "108"
	)
	public RawSound method869(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "-353311999"
	)
	long method870(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "([Lng;Lng;ZB)V",
		garbageValue = "29"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		class163.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class163.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			class271.method5725(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
