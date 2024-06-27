import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("Sound")
public class Sound {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 443044167
	)
	public int field2150;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -363435057
	)
	public int field2147;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1233321151
	)
	public int field2148;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1599145757
	)
	public int field2149;

	Sound(int var1, int var2, int var3, int var4) {
		this.field2150 = 0;
		this.field2147 = 0;
		this.field2148 = 0;
		this.field2149 = 0;
		this.field2150 = var1;
		this.field2147 = var2;
		this.field2148 = var3;
		this.field2149 = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-118"
	)
	static int method3909(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "1047946300"
	)
	static final String method3908(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return NpcOverrides.colorStartTag(16711680);
		} else if (var2 < -6) {
			return NpcOverrides.colorStartTag(16723968);
		} else if (var2 < -3) {
			return NpcOverrides.colorStartTag(16740352);
		} else if (var2 < 0) {
			return NpcOverrides.colorStartTag(16756736);
		} else if (var2 > 9) {
			return NpcOverrides.colorStartTag(65280);
		} else if (var2 > 6) {
			return NpcOverrides.colorStartTag(4259584);
		} else if (var2 > 3) {
			return NpcOverrides.colorStartTag(8453888);
		} else {
			return var2 > 0 ? NpcOverrides.colorStartTag(12648192) : NpcOverrides.colorStartTag(16776960);
		}
	}
}
