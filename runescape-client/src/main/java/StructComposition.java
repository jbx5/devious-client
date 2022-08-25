import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gm")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("loginType")
	static LoginType loginType;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("params")
	IterableNodeHashTable params;

	StructComposition() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1826362534")
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-141643144")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "-1580441618")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = World.readStringIntParameters(var1, this.params);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1093251626")
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ScriptFrame.method1035(this.params, var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;S)Ljava/lang/String;", garbageValue = "24965")
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2837(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(Lhp;IIII)Z", garbageValue = "1712536122")
	static final boolean method3544(Model var0, int var1, int var2, int var3) {
		boolean var4 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var4) {
			return false;
		} else {
			Tile.method3936();
			int var5 = var0.xMid + var1;
			int var6 = var2 + var0.yMid;
			int var7 = var3 + var0.zMid;
			int var8 = var0.xMidOffset;
			int var9 = var0.yMidOffset;
			int var10 = var0.zMidOffset;
			int var11 = class141.field1634 - var5;
			int var12 = ViewportMouse.field2593 - var6;
			int var13 = class143.field1639 - var7;
			if (Math.abs(var11) > var8 + UrlRequest.field1355) {
				return false;
			} else if (Math.abs(var12) > var9 + class123.field1517) {
				return false;
			} else if (Math.abs(var13) > var10 + class150.field1677) {
				return false;
			} else if (Math.abs(var13 * WorldMapCacheName.field2870 - var12 * ViewportMouse.field2599) > var10 * class123.field1517 + var9 * class150.field1677) {
				return false;
			} else if (Math.abs(var11 * ViewportMouse.field2599 - var13 * SoundCache.field322) > var10 * UrlRequest.field1355 + var8 * class150.field1677) {
				return false;
			} else {
				return Math.abs(var12 * SoundCache.field322 - var11 * WorldMapCacheName.field2870) <= var8 * class123.field1517 + var9 * UrlRequest.field1355;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IB)Ldk;", garbageValue = "1")
	public static class122 method3543(int var0) {
		class122 var1 = ((class122) (SequenceDefinition.SequenceDefinition_cachedModel.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			var1 = class271.method5169(SequenceDefinition.SequenceDefinition_animationsArchive, GZipDecompressor.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, ((long) (var0)));
			}
			return var1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "116")
	static final int method3531(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 'ﾀ') + var1;
		}
	}
}