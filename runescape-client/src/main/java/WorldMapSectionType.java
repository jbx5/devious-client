import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lhe;")

	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, ((byte) (0))),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lhe;")

	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, ((byte) (1))),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lhe;")

	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, ((byte) (2))),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lhe;")

	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, ((byte) (3)));

	@ObfuscatedName("a")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 
	-2117760903)

	static int field2321;
	@ObfuscatedName("hy")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1196340151)

	@Export("type")
	final int type;
	@ObfuscatedName("n")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(JLjava/lang/String;I)I", garbageValue = 
	"-23723856")

	static final int method4312(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{ var3.nextInt(), var3.nextInt(), ((int) (var0 >> 32)), ((int) (var0)) };
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class65.field863, class65.field864);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var8 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var8);

				int var9;
				for (var9 = 0; (var9 < 24) && (var8[var9] == 0); ++var9) {
				}

				if (var9 >= 24) {
					throw new IOException();
				}
			} catch (Exception var24) {
				for (int var10 = 0; var10 < 24; ++var10) {
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field863, class65.field864);
		var7 = class425.stringCp1252NullTerminatedByteSize(var2);
		if ((var7 % 8) != 0) {
			var7 += 8 - (var7 % 8);
		}

		Buffer var25 = new Buffer(var7);
		var25.writeStringCp1252NullTerminated(var2);
		var25.offset = var7;
		var25.xteaEncryptAll(var6);
		Buffer var18 = new Buffer(((var4.offset + var5.offset) + var25.offset) + 5);
		var18.writeByte(2);
		var18.writeByte(var4.offset);
		var18.writeBytes(var4.array, 0, var4.offset);
		var18.writeByte(var5.offset);
		var18.writeBytes(var5.array, 0, var5.offset);
		var18.writeShort(var25.offset);
		var18.writeBytes(var25.array, 0, var25.offset);
		String var20 = ApproximateRouteStrategy.method1125(var18.array);

		try {
			URL var11 = new URL(ArchiveLoader.method2063("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write((("data2=" + class270.method5206(var20)) + "&dest=") + class270.method5206("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var18 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var18.array, var18.offset, 1000 - var18.offset);
				if (var15 == (-1)) {
					var13.close();
					var14.close();
					String var21 = new String(var18.array);
					if (var21.startsWith("OFFLINE")) {
						return 4;
					} else if (var21.startsWith("WRONG")) {
						return 7;
					} else if (var21.startsWith("RELOAD")) {
						return 3;
					} else if (var21.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var18.xteaDecryptAll(var6);

						while ((var18.offset > 0) && (var18.array[var18.offset - 1] == 0)) {
							--var18.offset;
						} 

						var21 = new String(var18.array, 0, var18.offset);
						boolean var16;
						if (var21 == null) {
							var16 = false;
						} else {
							label106 : {
								try {
									new URL(var21);
								} catch (MalformedURLException var22) {
									var16 = false;
									break label106;
								}

								var16 = true;
							}
						}

						if (var16) {
							class391.openURL(var21, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var18.offset += var15;
			} while (var18.offset < 1000 );

			return 5;
		} catch (Throwable var23) {
			var23.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lhe;", garbageValue = 
	"-868172814")

	static WorldMapSectionType[] method4305() {
		return new WorldMapSectionType[]{ WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0 };
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"1441766816")

	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.previousDual)).count;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-2088968249")

	static int method4310(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class154.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
				Calendar.field3269 = class154.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
					Calendar.field3269 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = Calendar.field3269.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Calendar.field3269.allowGuests) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.field1591;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.field1592;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.field1593;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.field1606;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = Calendar.field3269.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = Calendar.field3269.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.method2956(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.field1604;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.method2955(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					class18.method264(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Calendar.field3269.field1600[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						ClanChannel.method3137(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Calendar.field3269.field1601[var3]) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class21.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
							FriendSystem.field808 = class21.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
							FriendSystem.field808 = Client.currentClanChannels[var3];
							AttackOption.field1255 = var3;
						} else {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = FriendSystem.field808.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = FriendSystem.field808.field1659;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = FriendSystem.field808.field1654;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = FriendSystem.field808.method3119();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = ((ClanChannelMember) (FriendSystem.field808.members.get(var3))).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((ClanChannelMember) (FriendSystem.field808.members.get(var3))).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((ClanChannelMember) (FriendSystem.field808.members.get(var3))).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						HealthBar.method2328(AttackOption.field1255, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = FriendSystem.field808.method3116(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = FriendSystem.field808.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (HorizontalAlignment.field1885 != null) ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"815671875")

	static final void method4308(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}

		if (var0 > 383) {
			var0 = 383;
		}

		if (class147.cameraPitch < var0) {
			class147.cameraPitch = ((((var0 - class147.cameraPitch) * class386.field4337) / 1000) + class147.cameraPitch) + NetFileRequest.field3960;
			if (class147.cameraPitch > var0) {
				class147.cameraPitch = var0;
			}
		}

		if (class147.cameraPitch > var0) {
			class147.cameraPitch -= (((class147.cameraPitch - var0) * class386.field4337) / 1000) + NetFileRequest.field3960;
			if (class147.cameraPitch < var0) {
				class147.cameraPitch = var0;
			}
		}

		int var2 = var1 - class21.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}

		if (var2 < (-1024)) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class21.cameraYaw = (class21.cameraYaw + NetFileRequest.field3960) + ((var2 * class386.field4337) / 1000);
			class21.cameraYaw &= 2047;
		}

		if (var2 < 0) {
			class21.cameraYaw -= NetFileRequest.field3960 + (((-var2) * class386.field4337) / 1000);
			class21.cameraYaw &= 2047;
		}

		int var3 = var1 - class21.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < (-1024)) {
			var3 += 2048;
		}

		if (((var3 < 0) && (var2 > 0)) || ((var3 > 0) && (var2 < 0))) {
			class21.cameraYaw = var1;
		}

	}}