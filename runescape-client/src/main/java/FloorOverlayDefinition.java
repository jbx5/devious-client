import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	static GameBuild field2400;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1508869635
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 348384781
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("af")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 448604885
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2000576281
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -258030593
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -216947469
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 776889423
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -983409521
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 311593259
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1093456499"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;IB)V",
		garbageValue = "8"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;IIB)V",
		garbageValue = "34"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1705879736"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1795154110"
	)
	static final void method4311(String var0, int var1) {
		PacketBufferNode var2 = WorldMapElement.getPacketBufferNode(ClientPacket.field3335, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteNeg(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}
}
