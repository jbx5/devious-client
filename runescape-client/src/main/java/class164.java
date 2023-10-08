import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class164 extends class145 {
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -1769199711
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -93754185
	)
	int field1768;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class164(class148 var1) {
		this.this$0 = var1;
		this.field1768 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1768 = var1.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3248(this.field1768);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1326457643"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lii;",
		garbageValue = "-1509216849"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2069590441"
	)
	public static int method3375(int var0, int var1, int var2) {
		int var3 = class76.method2124(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lom;III)Z",
		garbageValue = "999558105"
	)
	public static boolean method3376(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2036046752"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class544.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class326.SpriteBuffer_xOffsets = new int[class544.SpriteBuffer_spriteCount];
		ModelData0.SpriteBuffer_yOffsets = new int[class544.SpriteBuffer_spriteCount];
		class59.SpriteBuffer_spriteWidths = new int[class544.SpriteBuffer_spriteCount];
		class544.SpriteBuffer_spriteHeights = new int[class544.SpriteBuffer_spriteCount];
		AddRequestTask.SpriteBuffer_pixels = new byte[class544.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class544.SpriteBuffer_spriteCount * 8;
		class159.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class500.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class544.SpriteBuffer_spriteCount; ++var3) {
			class326.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class544.SpriteBuffer_spriteCount; ++var3) {
			ModelData0.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class544.SpriteBuffer_spriteCount; ++var3) {
			class59.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class544.SpriteBuffer_spriteCount; ++var3) {
			class544.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class544.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class372.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class372.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class372.SpriteBuffer_spritePalette[var3] == 0) {
				class372.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class544.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class59.SpriteBuffer_spriteWidths[var3];
			int var5 = class544.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			AddRequestTask.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
