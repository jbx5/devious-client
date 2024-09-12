import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class174 extends class150 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 592349069
	)
	int field1863;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 9117999941181852329L
	)
	long field1860;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class174(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1863 = var1.readInt();
		this.field1860 = var1.readLong();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3592(this.field1863, this.field1860);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1246181277"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class416.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2030203150"
	)
	static final int method3769() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lva;ZB)V",
		garbageValue = "57"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, boolean var2) {
		int var3 = var1.readUnsignedByte();
		if (var3 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var3 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;

			int var4;
			int var5;
			label74:
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var0.worldEntityIndices[var4];
				WorldEntity var18 = var0.worldEntities[var5];
				boolean var7 = var1.readUnsignedByte() == 1;
				if (!var7) {
					Client.worldViewManager.method2613(var18.worldView);
					var0.worldEntities[var5] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var5;
					var18.field5006 = var2 ? var1.readByte() : 1;
					byte var8 = var1.readByte();
					byte var19 = var1.readByte();
					var18.rotationAngle = var1.readUnsignedShort();
					byte var11 = (byte)var1.readUnsignedByte();
					MoveSpeed[] var20 = MoveSpeed.field3043;

					for (int var13 = 0; var13 < var20.length; ++var13) {
						MoveSpeed var14 = var20[var13];
						if (var11 == var14.id) {
							int var21 = var18.rotationAngle;
							int var15 = var18.currentRotationAngle;
							int var16 = var21 - var15 & 2047;
							class277 var17 = class277.field3052;
							if (var16 > 1024) {
								var16 = 2048 - var16;
								var17 = class277.field3053;
							}

							class272 var22 = new class272(var17, var16);
							int var24 = Math.min(var22.method5650(), 128);
							var18.movementSpeed = var24 / Client.field741;
							var18.remainingMovementSteps = var24 % Client.field741;
							if (var8 != 0 || var19 != 0) {
								var18.move(var8 + var18.directionsX[0], var19 + var18.directionsY[0], var14);
							}
							continue label74;
						}
					}

					throw new RuntimeException("Could not find MoveSpeed with ID " + var11);
				}
			}

			while (var1.method9879(Client.packetWriter.serverPacketLength) >= 10) {
				var4 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var4;
				var5 = var1.readUnsignedByte();
				int var6 = var1.readUnsignedByte();
				int var25 = var5 * 8;
				int var26 = var6 * 8;
				WorldView var9 = Client.worldViewManager.method2615(var4, var25, var26, class461.clientPreferences.getDrawDistance(), class232.field2471);
				WorldEntity var10 = new WorldEntity(var4, var9);
				var0.worldEntities[var4] = var10;
				int var27 = var1.readUnsignedByte();
				int var12 = var1.readUnsignedByte();
				var10.setPosition(var27, var12);
				var10.currentRotationAngle = var1.readUnsignedShort();
				var1.readUnsignedShort();
			}

		}
	}
}
