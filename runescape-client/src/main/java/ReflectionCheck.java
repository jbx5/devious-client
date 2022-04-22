import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("pl")
	@ObfuscatedSignature(descriptor = 
	"Lpj;")

	@Export("HitSplatDefinition_cachedSprites")
	static class426 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1002546903)

	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1236852851)

	@Export("size")
	int size;
	@ObfuscatedName("i")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("b")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("n")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("s")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("l")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"950633701")

	public static boolean method1079(int var0) {
		return ((var0 >> 29) & 1) != 0;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1315350901")

	static void method1080() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1324 = null;
		Client.packetWriter.field1325 = null;
		Client.packetWriter.field1313 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1322 = 0;
		Client.rebootTimer = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		GrandExchangeEvents.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		UserComparator10.method2622();
		Decimator.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field715[var0] = true;
		}

		PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(Client.getWindowedMode());
		var2.packetBuffer.writeShort(InvDefinition.canvasWidth);
		var2.packetBuffer.writeShort(class321.canvasHeight);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(descriptor = 
	"(IIIILqi;Lki;I)V", garbageValue = 
	"1940791589")

	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = (var3 * var3) + (var2 * var2);
		if ((var6 > 4225) && (var6 < 90000)) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = ((var9 * var2) + (var3 * var8)) >> 16;
			int var11 = ((var3 * var9) - (var8 * var2)) >> 16;
			double var12 = Math.atan2(((double) (var10)), ((double) (var11)));
			int var14 = (var5.width / 2) - 25;
			int var15 = ((int) (Math.sin(var12) * ((double) (var14))));
			int var16 = ((int) (Math.cos(var12) * ((double) (var14))));
			byte var17 = 20;
			Canvas.redHintArrowSprite.method8105(var15 + ((var0 + (var5.width / 2)) - (var17 / 2)), ((((var5.height / 2) + var1) - (var17 / 2)) - var16) - 10, var17, var17, 15, 15, var12, 256);
		} else {
			drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(descriptor = 
	"(IIIILqi;Lki;I)V", garbageValue = 
	"812723929")

	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = (var3 * var3) + (var2 * var2);
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = ((var3 * var8) + (var9 * var2)) >> 16;
				int var11 = ((var3 * var9) - (var8 * var2)) >> 16;
				if (var7 > 2500) {
					var4.method8103((var10 + (var5.width / 2)) - (var4.width / 2), ((var5.height / 2) - var11) - (var4.height / 2), var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(((var0 + var10) + (var5.width / 2)) - (var4.width / 2), (((var5.height / 2) + var1) - var11) - (var4.height / 2));
				}

			}
		}
	}
}