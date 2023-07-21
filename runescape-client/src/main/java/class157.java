import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class157 extends class143 {
	@ObfuscatedName("ae")
	static String[] field1745;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 597424851
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 1645389797
	)
	static int field1743;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1280118805
	)
	int field1744;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class157(class146 var1) {
		this.this$0 = var1;
		this.field1744 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1744 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3235(this.field1744);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "1014345527"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class139.method3103(class333.SequenceDefinition_animationsArchive, class169.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
