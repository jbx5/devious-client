import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1398687055
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	AbstractArchive field292;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field290;

	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field290 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field292 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbq;",
		garbageValue = "680018596"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method842(var1, var2, false);
		class53 var6 = (class53)this.field290.get(var4);
		if (var6 != null) {
			return var6.method1041();
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcu;",
		garbageValue = "18"
	)
	class53 method822(int var1, int var2) {
		long var3 = this.method842(var1, var2, true);
		class53 var5 = (class53)this.field290.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field292, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field290.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbq;",
		garbageValue = "-608338223"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lcu;",
		garbageValue = "661095887"
	)
	public class53 method826(int var1) {
		if (this.field292.getGroupCount() == 1) {
			return this.method822(0, var1);
		} else if (this.field292.getGroupFileCount(var1) == 1) {
			return this.method822(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lbq;",
		garbageValue = "586608675"
	)
	public RawSound method827(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "-123"
	)
	long method842(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Ljava/lang/Object;",
		garbageValue = "252727326"
	)
	static Object method833(class535 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5295) {
			case 0:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			case 2:
				return Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1868278794"
	)
	static void method843() {
		if (class253.localPlayer.x >> 7 == Client.destinationX && class253.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
