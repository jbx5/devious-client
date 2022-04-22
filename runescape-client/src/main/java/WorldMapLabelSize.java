import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lgp;")

	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lgp;")

	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lgp;")

	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = 
	"[Lqi;")

	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("if")
	@ObfuscatedGetter(intValue = 
	-131170417)

	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1256735251)

	final int field2208;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	624849635)

	final int field2215;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1061569375)

	final int field2210;
	static 
	{
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2208 = var1;
		this.field2215 = var2;
		this.field2210 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(FB)Z", garbageValue = 
	"89")

	boolean method3902(float var1) {
		return var1 >= ((float) (this.field2210));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lgp;", garbageValue = 
	"10456859")

	static WorldMapLabelSize[] method3901() {
		return new WorldMapLabelSize[]{ WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large };
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;I)I", garbageValue = 
	"-697751860")

	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = ((var2 << 5) - var2) + class327.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;II)V", garbageValue = 
	"-2017129698")

	static final void method3903(String var0, int var1) {
		PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteNeg(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(descriptor = 
	"(IIIILjava/lang/String;B)V", garbageValue = 
	"-40")

	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ItemComposition.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				ClanSettings.runScriptEvent(var6);
			}

			boolean var11 = true;
			if (var5.contentType > 0) {
				var11 = ModeWhere.method6100(var5);
			}

			if (var11) {
				int var8 = class326.getWidgetFlags(var5);
				int var9 = var0 - 1;
				boolean var7 = ((var8 >> (var9 + 1)) & 1) != 0;
				if (var7) {
					PacketBufferNode var10;
					if (var0 == 1) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 2) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 3) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 4) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 5) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 6) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 7) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 8) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 9) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 10) {
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

				}
			}
		}
	}
}