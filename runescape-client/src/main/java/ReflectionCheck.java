import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 808189433
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1434409415
	)
	@Export("size")
	int size;
	@ObfuscatedName("al")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ai")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ar")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("as")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aa")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("az")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-1"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1001) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3221, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortAddLE(var3);
			Client.packetWriter.addNode(var9);
		}

		Widget var14;
		PacketBufferNode var15;
		if (var2 == 58) {
			var14 = ArchiveLoader.widgetDefinition.getWidgetChild(var1, var0);
			if (var14 != null) {
				if (var14.field3833 != null) {
					ScriptEvent var10 = new ScriptEvent();
					var10.widget = var14;
					var10.opIndex = var3;
					var10.targetName = var6;
					var10.args = var14.field3833;
					class177.runScriptEvent(var10);
				}

				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3230, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeIntME(class160.selectedSpellWidget);
				var15.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAddLE(var0);
				var15.packetBuffer.writeInt(var1);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeShort(var4);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 22) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteNeg(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShort(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShortLE(var3);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 20) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3241, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortLE(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		PacketBufferNode var11;
		NPC var16;
		if (var2 == 1003) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var16 = Client.npcs[var3];
			if (var16 != null) {
				NPCComposition var17 = var16.definition;
				if (var17.transforms != null) {
					var17 = var17.transform();
				}

				if (var17 != null) {
					var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeShort(var17.id);
					Client.packetWriter.addNode(var11);
				}
			}
		}

		if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortLE(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 16) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3258, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteNeg(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortLE(class128.field1513);
			var9.packetBuffer.writeIntLE(class324.field3537);
			var9.packetBuffer.writeShortAdd(class422.field4618);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeShortAdd(var3);
			var9.packetBuffer.writeShort(GameEngine.baseY * 64 + var1);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 21) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortLE(var3);
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShort(GameEngine.baseY * 64 + var1);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 30 && Client.meslayerContinueWidget == null) {
			class192.resumePauseWidget(var1, var0);
			Client.meslayerContinueWidget = ArchiveLoader.widgetDefinition.getWidgetChild(var1, var0);
			UserComparator5.invalidateWidget(Client.meslayerContinueWidget);
		}

		if (var2 == 4) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3216, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortAdd(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeShortAdd(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShortAddLE(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 17) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3253, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(var3);
			var9.packetBuffer.writeShortAdd(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeShortLE(Client.selectedSpellItemId);
			var9.packetBuffer.writeShort(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
			var9.packetBuffer.writeIntIME(class160.selectedSpellWidget);
			var9.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
			Client.packetWriter.addNode(var9);
		}

		Player var18;
		if (var2 == 15) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3219, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeIntIME(class160.selectedSpellWidget);
				var15.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 9) {
			var16 = Client.npcs[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3214, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 6) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3266, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAdd(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 49) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3247, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 13) {
			var16 = Client.npcs[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3231, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 1002) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 1004) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3270, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(var3);
			var9.packetBuffer.writeShortAdd(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 23) {
			if (Client.isMenuOpen) {
				Actor.scene.setViewportWalking();
			} else {
				Actor.scene.menuOpen(class473.Client_plane, var0, var1, true);
			}
		}

		if (var2 == 48) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3246, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 46) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3218, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 14) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3226, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeIntLE(class324.field3537);
				var15.packetBuffer.writeShortLE(class128.field1513);
				var15.packetBuffer.writeShortAdd(class422.field4618);
				var15.packetBuffer.writeByteNeg(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 7) {
			var16 = Client.npcs[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3239, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeIntLE(class324.field3537);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAdd(class422.field4618);
				var15.packetBuffer.writeShortLE(class128.field1513);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 5) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3264, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeShortAddLE(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortAdd(var3);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 10) {
			var16 = Client.npcs[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3237, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 47) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3265, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 57 || var2 == 1007) {
			var14 = ArchiveLoader.widgetDefinition.getWidgetChild(var1, var0);
			if (var14 != null) {
				class185.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 1) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortLE(class128.field1513);
			var9.packetBuffer.writeShortAdd(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShortAdd(class422.field4618);
			var9.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortLE(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.writeIntME(class324.field3537);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 50) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteSub(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 45) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3222, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 18) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3220, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
			var9.packetBuffer.writeShortAdd(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeByteNeg(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var9);
		}

		int var12;
		Widget var19;
		if (var2 == 28) {
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var9);
			var19 = ArchiveLoader.widgetDefinition.method6431(var1);
			if (var19 != null && var19.cs1Instructions != null && var19.cs1Instructions[0][0] == 5) {
				var12 = var19.cs1Instructions[0][1];
				Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
				FriendSystem.changeGameOptions(var12);
			}
		}

		if (var2 == 12) {
			var16 = Client.npcs[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 26) {
			class272.method5372();
		}

		if (var2 == 19) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3250, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0);
			var9.packetBuffer.writeShortLE(var3);
			var9.packetBuffer.writeShortLE(GameEngine.baseY * 64 + var1);
			var9.packetBuffer.writeShort(Projectile.baseX * 64 + var0);
			Client.packetWriter.addNode(var9);
		}

		if (var2 == 11) {
			var16 = Client.npcs[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 51) {
			var18 = Client.players[var3];
			if (var18 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteAdd(Client.field792.method4466(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			}
		}

		if (var2 == 25) {
			var14 = ArchiveLoader.widgetDefinition.getWidgetChild(var1, var0);
			if (var14 != null) {
				GameObject.method5963();
				VarbitComposition.method3820(var1, var0, TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var14)), var4);
				Client.isItemSelected = 0;
				Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var14);
				if (Client.selectedSpellActionName == null) {
					Client.selectedSpellActionName = "null";
				}

				if (var14.isIf3) {
					Client.selectedSpellName = var14.dataText + class370.colorStartTag(16777215);
				} else {
					Client.selectedSpellName = class370.colorStartTag(65280) + var14.field3785 + class370.colorStartTag(16777215);
				}
			}

		} else {
			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
				Tiles.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
			}

			if (var2 == 24) {
				var14 = ArchiveLoader.widgetDefinition.method6431(var1);
				if (var14 != null) {
					boolean var13 = true;
					if (var14.contentType > 0) {
						var13 = SoundSystem.method807(var14);
					}

					if (var13) {
						var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var11);
					}
				}
			}

			if (var2 == 29) {
				var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher);
				var9.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var9);
				var19 = ArchiveLoader.widgetDefinition.method6431(var1);
				if (var19 != null && var19.cs1Instructions != null && var19.cs1Instructions[0][0] == 5) {
					var12 = var19.cs1Instructions[0][1];
					if (Varps.Varps_main[var12] != var19.cs1ComparisonValues[0]) {
						Varps.Varps_main[var12] = var19.cs1ComparisonValues[0];
						FriendSystem.changeGameOptions(var12);
					}
				}
			}

			if (var2 == 44) {
				var18 = Client.players[var3];
				if (var18 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3211, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0);
					var15.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var15);
				}
			}

			if (var2 == 2) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var9 = ViewportMouse.getPacketBufferNode(ClientPacket.field3262, Client.packetWriter.isaacCipher);
				var9.packetBuffer.writeIntME(class160.selectedSpellWidget);
				var9.packetBuffer.writeShortAddLE(var3);
				var9.packetBuffer.writeShort(Client.selectedSpellItemId);
				var9.packetBuffer.writeShortLE(GameEngine.baseY * 64 + var1);
				var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				var9.packetBuffer.writeShortAddLE(Projectile.baseX * 64 + var0);
				var9.packetBuffer.writeByte(Client.field792.method4466(82) ? 1 : 0);
				Client.packetWriter.addNode(var9);
			}

			if (var2 == 8) {
				var16 = Client.npcs[var3];
				if (var16 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field3238, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeInt(class160.selectedSpellWidget);
					var15.packetBuffer.writeByteNeg(Client.field792.method4466(82) ? 1 : 0);
					var15.packetBuffer.writeShortAddLE(var3);
					var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
					var15.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
					Client.packetWriter.addNode(var15);
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				UserComparator5.invalidateWidget(ArchiveLoader.widgetDefinition.method6431(class324.field3537));
			}

			if (Client.isSpellSelected) {
				GameObject.method5963();
			}

		}
	}
}
