import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-285078811)

	@Export("cycle")
	int cycle;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1160559969)

	@Export("health")
	int health;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-93193481)

	@Export("health2")
	int health2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	2006973369)

	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1575098257")

	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;I)V", garbageValue = 
	"-241424449")

	public static void method2217(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"2004197987")

	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else {
			return (var1 >= 0) && (var1 < var2.quantities.length) ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lpy;ILcw;II)V", garbageValue = 
	"-1310765413")

	static final void method2213(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class193.field2192.field2194;
		if ((var3 & 8192) != 0) {
			var2.field1133 = Client.cycle + var0.readUnsignedShortAdd();
			var2.field1185 = Client.cycle + var0.readUnsignedShortLE();
			var2.field1146 = var0.readByteNeg();
			var2.field1187 = var0.readByteNeg();
			var2.field1188 = var0.readByteSub();
			var2.field1189 = ((byte) (var0.readUnsignedByteNeg()));
		}

		if ((var3 & 256) != 0) {
			var4 = var0.readByteSub();
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 1) != 0) {
			var5 = var0.readUnsignedShortLE();
			PlayerType var6 = ((PlayerType) (ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var0.readUnsignedByte())));
			boolean var7 = var0.readUnsignedByteSub() == 1;
			var8 = var0.readUnsignedByteSub();
			var9 = var0.offset;
			if ((var2.username != null) && (var2.appearance != null)) {
				boolean var10 = false;
				if (var6.isUser && class155.friendSystem.isIgnored(var2.username)) {
					var10 = true;
				}

				if (((!var10) && (Client.field603 == 0)) && (!var2.isHidden)) {
					Players.field1299.offset = 0;
					var0.readBytesReversed(Players.field1299.array, 0, var8);
					Players.field1299.offset = 0;
					String var11 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(Players.field1299)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var7;
					var2.field1152 = (((var2 != class19.localPlayer) && var6.isUser) && ("" != Client.field712)) && (var11.toLowerCase().indexOf(Client.field712) == (-1));
					if (var6.isPrivileged) {
						var12 = (var7) ? 91 : 1;
					} else {
						var12 = (var7) ? 90 : 2;
					}

					if (var6.modIcon != (-1)) {
						Login.addGameMessage(var12, class351.method6579(var6.modIcon) + var2.username.getName(), var11);
					} else {
						Login.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var8 + var9;
		}

		if ((var3 & 2048) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 4096) != 0) {
			var2.spotAnimation = var0.readUnsignedShortLE();
			var5 = var0.readUnsignedIntLE();
			var2.spotAnimationHeight = var5 >> 16;
			var2.field1173 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1173 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedByteSub();
			byte[] var17 = new byte[var5];
			Buffer var13 = new Buffer(var17);
			var0.readBytesReversed(var17, 0, var5);
			Players.field1289[var1] = var13;
			var2.read(var13);
		}

		if ((var3 & 512) != 0) {
			var2.field1175 = var0.readByteAdd();
			var2.field1177 = var0.readByte();
			var2.field1176 = var0.readByteSub();
			var2.field1178 = var0.readByteNeg();
			var2.field1179 = var0.readUnsignedShortAdd() + Client.cycle;
			var2.field1180 = var0.readUnsignedShortAddLE() + Client.cycle;
			var2.field1181 = var0.readUnsignedShortLE();
			if (var2.field1109) {
				var2.field1175 += var2.tileX;
				var2.field1177 += var2.tileY;
				var2.field1176 += var2.tileX;
				var2.field1178 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1175 += var2.pathX[0];
				var2.field1177 += var2.pathY[0];
				var2.field1176 += var2.pathX[0];
				var2.field1178 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1134 = 0;
		}

		if ((var3 & 16) != 0) {
			var2.field1160 = var0.readUnsignedShort();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1160;
				var2.field1160 = -1;
			}
		}

		if ((var3 & 2) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				Login.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == class19.localPlayer) {
				Login.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		int var14;
		if ((var3 & 8) != 0) {
			var5 = var0.readUnsignedShortAddLE();
			if (var5 == 65535) {
				var5 = -1;
			}

			var14 = var0.readUnsignedByteSub();
			KeyHandler.performPlayerAnimation(var2, var5, var14);
		}

		if ((var3 & 16384) != 0) {
			Players.field1285[var1] = ((class193) (ChatChannel.findEnumerated(class124.method2801(), var0.readByteNeg())));
		}

		if ((var3 & 32) != 0) {
			var2.targetIndex = var0.readUnsignedShortLE();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByteNeg();
			int var16;
			int var18;
			int var19;
			if (var5 > 0) {
				for (var14 = 0; var14 < var5; ++var14) {
					var8 = -1;
					var9 = -1;
					var19 = -1;
					var18 = var0.readUShortSmart();
					if (var18 == 32767) {
						var18 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var19 = var0.readUShortSmart();
					} else if (var18 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var18 = -1;
					}

					var16 = var0.readUShortSmart();
					var2.addHitSplat(var18, var9, var8, var19, Client.cycle, var16);
				}
			}

			var14 = var0.readUnsignedByte();
			if (var14 > 0) {
				for (var18 = 0; var18 < var14; ++var18) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var19 = var0.readUShortSmart();
						var16 = var0.readUnsignedByte();
						var12 = (var9 > 0) ? var0.readUnsignedByteNeg() : var16;
						var2.addHealthBar(var8, Client.cycle, var9, var19, var16, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if (var2.field1109) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class193 var15;
				if (var4 != class193.field2192.field2194) {
					var15 = ((class193) (ChatChannel.findEnumerated(class124.method2801(), var4)));
				} else {
					var15 = Players.field1285[var1];
				}

				var2.method2144(var2.tileX, var2.tileY, var15);
			}
		}

	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"921137815")

	static void method2210(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var3 = var0 >> 8;
			int var4 = (var0 >> 4) & 7;
			int var5 = var0 & 15;
			Client.soundEffectIds[Client.soundEffectCount] = var3;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			int var6 = (var1 - 64) / 128;
			int var7 = (var2 - 64) / 128;
			Client.soundLocations[Client.soundEffectCount] = (var5 + (var7 << 8)) + (var6 << 16);
			++Client.soundEffectCount;
		}
	}
}