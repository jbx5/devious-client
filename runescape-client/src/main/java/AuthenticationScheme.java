import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(2, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(3, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("TOKEN")
	TOKEN(4, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1531(0, 4);

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2021800197
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2048248869
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("aj")
	public static int method3355(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "4"
	)
	public static int method3356(int var0) {
		class145 var2 = (class145)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class145 var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			var2 = WorldMapSection1.method6334(class219.SequenceDefinition_animationsArchive, class219.SequenceDefinition_skeletonsArchive, var0, false);
			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			var1 = var2;
		}

		if (var1 == null) {
			return 2;
		} else {
			return var1.method3508() ? 0 : 1;
		}
	}
}
