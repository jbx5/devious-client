import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fc")
public class class148 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 156285675
	)
	static int field1662;
	@ObfuscatedName("cx")
	@Export("otp")
	static String otp;
	@ObfuscatedName("hf")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -66437073
	)
	int field1661;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -319512785
	)
	int field1660;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 896547871
	)
	int field1659;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1054144465
	)
	int field1664;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class148(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1661 = var1.readInt();
		this.field1664 = var1.readInt();
		this.field1660 = var1.readUnsignedByte();
		this.field1659 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3353(this.field1661, this.field1664, this.field1660, this.field1659);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	static void method3273() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		class141.Tiles_shapes = null;
		class208.field2278 = null;
		Tiles.field1012 = null;
		AbstractRasterProvider.Tiles_underlays2 = null;
		FadeOutTask.field4590 = null;
		GrandExchangeOfferWorldComparator.Tiles_hue = null;
		class341.Tiles_saturation = null;
		class515.Tiles_lightness = null;
		class309.Tiles_hueMultiplier = null;
		class228.field2427 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "755843871"
	)
	static void method3280(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class317.field3441, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-85"
	)
	static int method3276(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (SecureUrlRequester.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
				GrandExchangeOfferUnitPriceComparator.field4432 = SecureUrlRequester.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					GrandExchangeOfferUnitPriceComparator.field4432 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1699;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1707;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1696;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1702;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					UserComparator6.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.method3400(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1711;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.method3389(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.getSortedMembers()[Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					class518.method9255(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1701[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						UserComparator6.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
						HttpMethod.method69(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.field4432.field1700[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (UserComparator4.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
							class13.field54 = UserComparator4.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
							class13.field54 = Client.currentClanChannels[var3];
							class108.field1381 = var3;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class13.field54.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.field1767;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.field1758;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.method3492();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class13.field54.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((ClanChannelMember)class13.field54.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ((ClanChannelMember)class13.field54.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						MilliClock.method4268(class108.field1381, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class13.field54.method3495(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = class13.field54.getSortedMembers()[Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class407.field4517 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
