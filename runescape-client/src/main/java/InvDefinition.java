import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 80243253
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "25"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1333994219"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2122360200"
	)
	static final int method3541() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-116"
	)
	static void method3540(int var0) {
		SequenceDefinition var1 = MilliClock.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class140 var5 = (class140)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var3);
			class140 var4;
			if (var5 != null) {
				var4 = var5;
			} else {
				var5 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var3, false);
				if (var5 != null) {
					SequenceDefinition.SequenceDefinition_cachedModel.put(var5, (long)var3);
				}

				var4 = var5;
			}

			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3160() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field826.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
