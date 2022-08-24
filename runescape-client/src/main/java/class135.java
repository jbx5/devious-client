import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
@ObfuscatedName("eb")
public class class135 extends class128 {
	@ObfuscatedName("o")
	static int[][] field1587;

	@ObfuscatedName("s")
	boolean field1581;

	@ObfuscatedName("h")
	byte field1585;

	@ObfuscatedName("w")
	byte field1582;

	@ObfuscatedName("v")
	byte field1583;

	@ObfuscatedName("c")
	byte field1584;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class135(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		this.field1581 = var1.readUnsignedByte() == 1;
		this.field1585 = var1.readByte();
		this.field1582 = var1.readByte();
		this.field1583 = var1.readByte();
		this.field1584 = var1.readByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.allowGuests = this.field1581;
		var1.field1606 = this.field1585;
		var1.field1599 = this.field1582;
		var1.field1615 = this.field1583;
		var1.field1610 = this.field1584;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "37")
	public static void method2871() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1851340095")
	static int method2870(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (FontName.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
				Messages.field1326 = FontName.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
					Messages.field1326 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Messages.field1326.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (Messages.field1326.allowGuests) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.field1606;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.field1599;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.field1615;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.field1610;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Messages.field1326.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Messages.field1326.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					User.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.method2915(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.field1608;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.method2901(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = Messages.field1326.getSortedMembers()[Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					User.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
					UserComparator8.method2554(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Messages.field1326.field1616[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						User.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
						class127.method2792(var5, var3, var4);
					}
					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (Messages.field1326.field1619[var3]) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (NetCache.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
							Interpreter.field826 = NetCache.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
							Interpreter.field826 = Client.currentClanChannels[var3];
							class160.field1744 = var3;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Interpreter.field826.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Interpreter.field826.field1669;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Interpreter.field826.field1666;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Interpreter.field826.method3046();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ((ClanChannelMember) (Interpreter.field826.members.get(var3))).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ((ClanChannelMember) (Interpreter.field826.members.get(var3))).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ((ClanChannelMember) (Interpreter.field826.members.get(var3))).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						DynamicObject.method1954(class160.field1744, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Interpreter.field826.method3056(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = Interpreter.field826.getSortedMembers()[Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (Coord.field3318 != null) ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}