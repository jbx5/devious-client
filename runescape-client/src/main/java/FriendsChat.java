import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rr")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field4909;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("au")
	@Export("name")
	public String name;
	@ObfuscatedName("ax")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ao")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2093837977
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1301237841
	)
	int field4908;

	@ObfuscatedSignature(
		descriptor = "(Luk;Lre;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4908 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsz;",
		garbageValue = "430184194"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lsz;",
		garbageValue = "-49"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-803240217"
	)
	final void method8554(String var1) {
		this.name = Tiles.method2323(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1974563054"
	)
	final void method8581(String var1) {
		this.owner = Tiles.method2323(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IB)V",
		garbageValue = "92"
	)
	public final void method8568(Buffer var1, int var2) {
		this.method8581(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		this.method8554(GameObject.method4489(var3));
		this.minKick = var1.readByte();
		int var5;
		short var6;
		if (var2 == 1) {
			var5 = var1.readUnsignedByte();
			var6 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var5 = var1.readShortSmartSub();
			var6 = -1;
		}

		if (var6 != var5) {
			int var7 = var5;
			this.clear();

			for (int var8 = 0; var8 < var7; ++var8) {
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var10 = var1.readUnsignedShort();
				var9.set(var10, ++this.field4908 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "607879754"
	)
	public final void method8558(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field4908 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1884928513"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lse;I)V",
		garbageValue = "-967306606"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "1575687965"
	)
	static int method8584(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class358 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6971();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7.method6712().method8107();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class352 var4;
				if (var0 == 1617) {
					var4 = var3.method6972();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3721 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6972();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3720 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6971();
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6824().method8107() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6972();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3722 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6699() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6700() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6701() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6691() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6971();
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6881().method8267() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6971();
						int var5 = var7 != null ? var7.method6695() : 0;
						int var6 = var7 != null ? var7.method6694() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6694() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6678() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6702() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6704() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6705() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6973();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method364(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method6973();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method372((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6692() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
