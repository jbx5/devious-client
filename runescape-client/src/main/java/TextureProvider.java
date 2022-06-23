import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hk")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lgd;")
	@Export("textures")
	Texture[] textures;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("deque")
	NodeDeque deque;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1240613953)
	@Export("capacity")
	int capacity;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 131497903)
	@Export("remaining")
	int remaining;

	@ObfuscatedName("j")
	@Export("brightness")
	double brightness;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 2025819025)
	@Export("textureSize")
	int textureSize;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(descriptor = "(Llh;Llh;IDI)V")
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)];
		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-29")
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0;
		int var2 = 0;
		Texture[] var3 = this.textures;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			Texture var5 = var3[var4];
			if (var5 != null && var5.fileIds != null) {
				var1 += var5.fileIds.length;
				int[] var6 = var5.fileIds;
				for (int var7 = 0; var7 < var6.length; ++var7) {
					int var8 = var6[var7];
					if (this.archive.method5849(var8)) {
						++var2;
					}
				}
			}
		}
		if (var1 == 0) {
			return 0;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("v")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)[I", garbageValue = "24")
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = ((Texture) (this.deque.removeFirst()));
					var4.reset();
				} else {
					--this.remaining;
				}
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}
		return null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IS)I", garbageValue = "-3917")
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-52")
	public boolean vmethod4538(int var1) {
		return this.textures[var1].field2293;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-1596996574")
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "586737024")
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}
		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-924908553")
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;I)V", garbageValue = "-18765802")
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ScriptFrame.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				BoundaryObject.runScriptEvent(var6);
			}
			boolean var11 = true;
			if (var5.contentType > 0) {
				var11 = Message.method1065(var5);
			}
			if (var11) {
				int var8 = class124.getWidgetFlags(var5);
				int var9 = var0 - 1;
				boolean var7 = (var8 >> var9 + 1 & 1) != 0;
				if (var7) {
					PacketBufferNode var10;
					if (var0 == 1) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 2) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 3) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 4) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 5) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 6) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 7) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 8) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 9) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}
					if (var0 == 10) {
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
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