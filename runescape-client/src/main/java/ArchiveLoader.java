import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bn")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(longValue = -1051997318633043321L)
	static long field1020;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive")
	final Archive archive;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -902001095)
	@Export("groupCount")
	final int groupCount;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 31215071)
	@Export("loadedCount")
	int loadedCount = 0;

	@ObfuscatedSignature(descriptor = "(Llu;Ljava/lang/String;)V")
	ArchiveLoader(Archive var1, String var2) {
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1616560321")
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;
		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method5813(var1) || this.archive.method5812(var1)) {
				++this.loadedCount;
			}
		}
		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IZIZS)V", garbageValue = "8977")
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class93.World_worlds != null) {
			Language.doWorldSorting(0, class93.World_worlds.length - 1, var0, var1, var2, var3);
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(descriptor = "(I)J", garbageValue = "-1129495977")
	static long method2130() {
		return Client.field614;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;I)V", garbageValue = "3347924")
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class293.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				class17.runScriptEvent(var6);
			}
			boolean var8 = true;
			if (var5.contentType > 0) {
				var8 = method2131(var5);
			}
			if (var8) {
				if (class201.method4100(class67.getWidgetFlags(var5), var0 - 1)) {
					PacketBufferNode var7;
					if (var0 == 1) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 2) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 3) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 4) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 5) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 6) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 7) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 8) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 9) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
					if (var0 == 10) {
						var7 = class433.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(descriptor = "(Lku;I)Z", garbageValue = "885899604")
	static final boolean method2131(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}
			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method5584(var2, var3 == 1);
			}
			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}
			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}
			if (var1 == 326) {
				PacketBufferNode var4 = class433.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}