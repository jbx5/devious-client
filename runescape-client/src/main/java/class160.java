import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class160 extends class163 {
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -735242945
	)
	int field1791;
	@ObfuscatedName("al")
	byte field1792;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1460325249
	)
	int field1795;
	@ObfuscatedName("az")
	String field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgx;)V"
	)
	class160(class164 var1) {
		this.this$0 = var1;
		this.field1791 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-406894472"
	)
	void vmethod3479(Buffer var1) {
		var1.readUnsignedByte();
		this.field1791 = var1.readUnsignedShort();
		this.field1792 = var1.readByte();
		this.field1795 = var1.readUnsignedShort();
		var1.readLong();
		this.field1793 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "-472458599"
	)
	void vmethod3480(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1791);
		var2.rank = this.field1792;
		var2.world = this.field1795;
		var2.username = new Username(this.field1793);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpl;II)Lmd;",
		garbageValue = "1937051095"
	)
	public static PacketBufferNode method3402(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = WorldMapElement.getPacketBufferNode(ClientPacket.field3355, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			boolean var10 = true;
			boolean var11 = true;
			int var12 = "pattern".length();
			int var13 = 0;
			byte[] var14 = new byte[8];

			byte[] var9;
			while (true) {
				int var15 = var12 + var13;
				if (var15 >= var6.length()) {
					var9 = null;
					break;
				}

				char var16 = var6.charAt(var15);
				if (var16 == ':') {
					if (var13 == 0) {
						var9 = null;
					} else {
						byte[] var17 = new byte[var13];
						System.arraycopy(var14, 0, var17, 0, var13);
						var9 = var17;
					}
					break;
				}

				if (var14.length == var13) {
					var9 = null;
					break;
				}

				if (var16 >= '0' && var16 <= '9') {
					var16 = (char)(var16 - '0');
				} else {
					if (var16 < 'a' || var16 > 'z') {
						var9 = null;
						break;
					}

					var16 = (char)(var16 - 'W');
				}

				var14[var13++] = (byte)var16;
			}

			var8 = var9;
			if (var9 != null) {
				var7 = var9.length + 12;
				var1 = var1.substring("pattern".length() + var9.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var18 = 0;
		if (var6.startsWith("wave:")) {
			var18 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var18 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var18 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var18 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var18 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var18);
		if (var8 != null) {
			for (int var19 = 0; var19 < var8.length; ++var19) {
				var4.packetBuffer.writeByte(var8[var19]);
			}
		}

		class152.method3277(var4.packetBuffer, var1);
		if (var0 == class365.field3988.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	public static int method3394(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2030374715"
	)
	public static void method3400() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < ModelData0.field2994; ++var0) {
				class74.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "655514975"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
