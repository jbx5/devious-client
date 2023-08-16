import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class53 extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	class47 field386;

	public class53() {
		this.field386 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcm;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field386 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbu;)V"
	)
	public class53(RawSound var1) {
		this.field386 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	public boolean method1085() {
		return this.field386 == null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "2082518533"
	)
	public RawSound method1096() {
		if (this.field386 != null && this.field386.field349.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1082();
			} finally {
				this.field386.field349.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "2121230840"
	)
	public RawSound method1087() {
		if (this.field386 != null) {
			this.field386.field349.lock();

			RawSound var1;
			try {
				var1 = this.method1082();
			} finally {
				this.field386.field349.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "-565305963"
	)
	RawSound method1082() {
		if (this.field386.field348 == null) {
			this.field386.field348 = this.field386.field354.toRawSound((int[])null);
			this.field386.field354 = null;
		}

		return this.field386.field348;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1757242477"
	)
	public static void method1097(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class305.field3411.clear();
			class305.field3406.clear();
			class200.method3784(var5);
			class270.method5492(var0, var5);
			if (!class305.field3411.isEmpty()) {
				class270.method5491(var1, var2, var3, var4);
				class305.field3406.add(new AddRequestTask((SongTask)null));
				class305.field3406.add(new class408((SongTask)null, class305.field3399, class305.field3400, class305.field3403));
				ArrayList var6 = new ArrayList();
				var6.add(new class403(new FadeInTask((SongTask)null, 0, true, class305.field3401)));
				if (!class305.musicSongs.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class305.field3410));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class305.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var7.add(new DelayFadeTask(new FadeOutTask(new class401((SongTask)null, var9), 0, false, class305.field3409), class305.musicPlayerStatus));
					class305.field3406.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class305.field3406.add(new DelayFadeTask((SongTask)null, class305.field3410));
					class305.field3406.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lto;ILdf;II)V",
		garbageValue = "-2132656914"
	)
	static final void method1086(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class217.field2405.field2408;
		int var5;
		if ((var3 & 8) != 0) {
			var5 = var0.readUnsignedByte();
			byte[] var6 = new byte[var5];
			Buffer var7 = new Buffer(var6);
			var0.method9218(var6, 0, var5);
			Players.field1388[var1] = var7;
			var2.read(var7);
		}

		int var9;
		int var16;
		int var17;
		int var18;
		if ((var3 & 65536) != 0) {
			var5 = var0.readUnsignedByte();

			for (var16 = 0; var16 < var5; ++var16) {
				var17 = var0.readUnsignedByteAdd();
				var18 = var0.readUnsignedShortAddLE();
				var9 = var0.readInt();
				var2.updateSpotAnimation(var17, var18, var9 >> 16, var9 & 65535);
			}
		}

		if ((var3 & 64) != 0) {
			var2.field1234 = var0.readUnsignedShortAddLE();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1234;
				var2.method2393();
			}
		}

		if ((var3 & 16) != 0) {
			var2.targetIndex = var0.readUnsignedShortAddLE();
			var2.targetIndex += var0.readUnsignedByteAdd() << 16;
			var5 = 16777215;
			if (var2.targetIndex == var5) {
				var2.targetIndex = -1;
			}
		}

		int var10;
		int var11;
		if ((var3 & 4096) != 0) {
			var5 = var0.readUnsignedShortAddLE();
			var16 = var5 >> 8;
			var17 = var16 >= 13 && var16 <= 20 ? var16 - 12 : 0;
			PlayerType var8 = (PlayerType)KeyHandler.findEnumerated(MidiPcmStream.PlayerType_values(), var0.readUnsignedByteAdd());
			boolean var24 = var0.readUnsignedByte() == 1;
			var10 = var0.readUnsignedByteNeg();
			var11 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var12 = false;
				if (var8.isUser && class299.friendSystem.isIgnored(var2.username)) {
					var12 = true;
				}

				if (!var12 && Client.field651 == 0 && !var2.isHidden) {
					Players.field1376.offset = 0;
					var0.method9218(Players.field1376.array, 0, var10);
					Players.field1376.offset = 0;
					String var13 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(Players.field1376)));
					var2.overheadText = var13.trim();
					var2.field1222 = var5 >> 8;
					var2.field1223 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					byte[] var14 = null;
					int var15;
					if (var17 > 0 && var17 <= 8) {
						var14 = new byte[var17];

						for (var15 = 0; var15 < var17; ++var15) {
							var14[var15] = var0.readByteSub();
						}
					}

					var2.field1264 = class164.method3322(var14);
					var2.field1219 = var24;
					var2.field1220 = var2 != VarbitComposition.localPlayer && var8.isUser && !Client.field554.isEmpty() && var13.toLowerCase().indexOf(Client.field554) == -1;
					if (var8.isPrivileged) {
						var15 = var24 ? 91 : 1;
					} else {
						var15 = var24 ? 90 : 2;
					}

					if (var8.modIcon != -1) {
						MouseHandler.addGameMessage(var15, Tile.method4373(var8.modIcon) + var2.username.getName(), var13);
					} else {
						MouseHandler.addGameMessage(var15, var2.username.getName(), var13);
					}
				}
			}

			var0.offset = var17 + var10 + var11;
		}

		int var26;
		if ((var3 & 32) != 0) {
			var5 = var0.readUnsignedShortAdd();
			PlayerType var21 = (PlayerType)KeyHandler.findEnumerated(MidiPcmStream.PlayerType_values(), var0.readUnsignedByteNeg());
			boolean var27 = var0.readUnsignedByteNeg() == 1;
			var18 = var0.readUnsignedByte();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var25 = false;
				if (var21.isUser && class299.friendSystem.isIgnored(var2.username)) {
					var25 = true;
				}

				if (!var25 && Client.field651 == 0 && !var2.isHidden) {
					Players.field1376.offset = 0;
					var0.method9218(Players.field1376.array, 0, var18);
					Players.field1376.offset = 0;
					String var19 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(Players.field1376)));
					var2.overheadText = var19.trim();
					var2.field1222 = var5 >> 8;
					var2.field1223 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.field1264 = null;
					var2.field1219 = var27;
					var2.field1220 = var2 != VarbitComposition.localPlayer && var21.isUser && !Client.field554.isEmpty() && var19.toLowerCase().indexOf(Client.field554) == -1;
					if (var21.isPrivileged) {
						var26 = var27 ? 91 : 1;
					} else {
						var26 = var27 ? 90 : 2;
					}

					if (var21.modIcon != -1) {
						MouseHandler.addGameMessage(var26, Tile.method4373(var21.modIcon) + var2.username.getName(), var19);
					} else {
						MouseHandler.addGameMessage(var26, var2.username.getName(), var19);
					}
				}
			}

			var0.offset = var18 + var9;
		}

		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByte();
			if (var5 > 0) {
				for (var16 = 0; var16 < var5; ++var16) {
					var18 = -1;
					var9 = -1;
					var10 = -1;
					var17 = var0.readUShortSmart();
					if (var17 == 32767) {
						var17 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var18 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var17 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var17 = -1;
					}

					var11 = var0.readUShortSmart();
					var2.addHitSplat(var17, var9, var18, var10, Client.cycle, var11);
				}
			}

			var16 = var0.readUnsignedByte();
			if (var16 > 0) {
				for (var17 = 0; var17 < var16; ++var17) {
					var18 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var11 = var0.readUnsignedByteAdd();
						var26 = var9 > 0 ? var0.readUnsignedByte() : var11;
						var2.addHealthBar(var18, Client.cycle, var9, var10, var11, var26);
					} else {
						var2.removeHealthBar(var18);
					}
				}
			}
		}

		if ((var3 & 512) != 0) {
			var2.field1249 = var0.readByteSub();
			var2.field1251 = var0.readByteAdd();
			var2.field1247 = var0.readByte();
			var2.field1217 = var0.readByte();
			var2.spotAnimation = var0.readUnsignedShortAdd() + Client.cycle;
			var2.field1254 = var0.readUnsignedShortAdd() + Client.cycle;
			var2.field1255 = var0.readUnsignedShortAddLE();
			if (var2.field1154) {
				var2.field1249 += var2.tileX;
				var2.field1251 += var2.tileY;
				var2.field1247 += var2.tileX;
				var2.field1217 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1249 += var2.pathX[0];
				var2.field1251 += var2.pathY[0];
				var2.field1247 += var2.pathX[0];
				var2.field1217 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1261 = 0;
		}

		if ((var3 & 2048) != 0) {
			class217[] var20 = Players.field1377;
			class217[] var23 = new class217[]{class217.field2405, class217.field2406, class217.field2407, class217.field2410};
			var20[var1] = (class217)KeyHandler.findEnumerated(var23, var0.readByte());
		}

		if ((var3 & 128) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				MouseHandler.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == VarbitComposition.localPlayer) {
				MouseHandler.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.field1219 = false;
			var2.field1222 = 0;
			var2.field1223 = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if ((var3 & 16384) != 0) {
			var2.field1258 = Client.cycle + var0.readUnsignedShortLE();
			var2.field1200 = Client.cycle + var0.readUnsignedShortLE();
			var2.field1260 = var0.readByteSub();
			var2.field1218 = var0.readByteNeg();
			var2.field1212 = var0.readByteAdd();
			var2.field1250 = (byte)var0.readUnsignedByteNeg();
		}

		if ((var3 & 8192) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 1024) != 0) {
			var4 = var0.readByte();
		}

		if ((var3 & 2) != 0) {
			var5 = var0.readUnsignedShort();
			if (var5 == 65535) {
				var5 = -1;
			}

			var16 = var0.readUnsignedByteAdd();
			LoginType.performPlayerAnimation(var2, var5, var16);
		}

		if (var2.field1154) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class217 var28;
				if (var4 != class217.field2405.field2408) {
					class217[] var22 = new class217[]{class217.field2405, class217.field2406, class217.field2407, class217.field2410};
					var28 = (class217)KeyHandler.findEnumerated(var22, var4);
				} else {
					var28 = Players.field1377[var1];
				}

				var2.method2345(var2.tileX, var2.tileY, var28);
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	static void method1095() {
		if (class125.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1225390547"
	)
	static int method1098(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "959381861"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4296 != 0 && var3 > AbstractArchive.field4296) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4296 == 0 || var4 <= AbstractArchive.field4296)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "709896940"
	)
	static final boolean method1093(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
