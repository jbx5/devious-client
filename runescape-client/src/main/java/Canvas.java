import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -1334765077
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = -188497920
	)
	static int field124;
	@ObfuscatedName("aw")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lud;",
		garbageValue = "-2020031634"
	)
	static SpritePixels method320(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1227105827"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "590249840"
	)
	static final void method321(String var0) {
		PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1064085790"
	)
	static final int method322(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
