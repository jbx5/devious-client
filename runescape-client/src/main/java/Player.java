import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1181672555
	)
	int field1136;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1473193873
	)
	int field1137;
	@ObfuscatedName("aa")
	String[] field1139;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1989491569
	)
	int field1147;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1346184075
	)
	int field1141;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -364235779
	)
	int field1148;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1240607451
	)
	int field1143;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -276492539
	)
	int field1144;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -945585951
	)
	int field1145;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -59454839
	)
	int field1146;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1258235987
	)
	int field1154;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	Model field1158;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1883337735
	)
	int field1149;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1995509191
	)
	int field1155;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1258225711
	)
	int field1151;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1900830555
	)
	int field1140;
	@ObfuscatedName("aw")
	boolean field1153;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1205493335
	)
	int field1164;
	@ObfuscatedName("ai")
	boolean field1142;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1273931853
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1451120567
	)
	int field1157;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	TriBool field1135;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	TriBool field1159;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	TriBool field1160;
	@ObfuscatedName("bo")
	boolean field1161;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -393423257
	)
	int field1162;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1697985689
	)
	int field1163;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	class101 field1134;

	Player() {
		this.field1136 = -1;
		this.field1137 = -1;
		this.field1139 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field1139[var1] = "";
		}

		this.field1147 = 0;
		this.field1141 = 0;
		this.field1143 = 0;
		this.field1144 = 0;
		this.field1153 = false;
		this.field1164 = 0;
		this.field1142 = false;
		this.field1135 = TriBool.TriBool_unknown;
		this.field1159 = TriBool.TriBool_unknown;
		this.field1160 = TriBool.TriBool_unknown;
		this.field1161 = false;
		this.field1134 = class358.scene;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.field1223 != -1 && super.field1252 == 0 ? FaceNormal.SequenceDefinition_get(super.field1223) : null;
			SequenceDefinition var2 = super.field1245 == -1 || this.field1153 || super.field1245 == super.idleSequence && var1 != null ? null : FaceNormal.SequenceDefinition_get(super.field1245);
			Model var3 = this.appearance.getModel(var1, super.field1250, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.field1279 = var3.height;
				int var4 = var3.indicesCount;
				if (!this.field1153) {
					var3 = this.method2451(var3);
				}

				if (!this.field1153 && this.field1158 != null) {
					if (Client.cycle >= this.field1144) {
						this.field1158 = null;
					}

					if (Client.cycle >= this.field1143 && Client.cycle < this.field1144) {
						Model var5 = this.field1158;
						var5.offsetBy(this.field1145 * 4096 - super.x, this.field1146 - this.field1148, this.field1154 * 4096 - super.y);
						if (super.field1282 == 512) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.field1282 == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.field1282 == 1536) {
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
						if (super.field1282 == 512) {
							var5.rotateY90Ccw();
						} else if (super.field1282 == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.field1282 == 1536) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						}

						var5.offsetBy(super.x - this.field1145 * 4096, this.field1148 - this.field1146, super.y - this.field1154 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1270 != 0 && Client.cycle >= super.field1265 && Client.cycle < super.field1266) {
					var3.overrideHue = super.field1267;
					var3.overrideSaturation = super.field1268;
					var3.overrideLuminance = super.field1269;
					var3.overrideAmount = super.field1270;
					var3.field2891 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-235564747"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		byte var2 = var1.readByte();
		boolean var3 = true;
		this.field1136 = var1.readByte();
		this.field1137 = var1.readByte();
		int var4 = -1;
		this.field1164 = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte();
				var5[var6] = var8 + (var7 << 8);
				if (var6 == 0 && var5[0] == 65535) {
					var4 = var1.readUnsignedShort();
					break;
				}

				if (var5[var6] >= 512) {
					var9 = KeyHandler.ItemDefinition_get(var5[var6] - 512).team;
					if (var9 != 0) {
						this.field1164 = var9;
					}
				}
			}
		}

		int[] var26 = new int[12];

		for (var7 = 0; var7 < 12; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var26[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var26[var7] = var9 + (var8 << 8);
			}
		}

		int[] var27 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= AddRequestTask.field4780[var8].length) {
				var9 = 0;
			}

			var27[var8] = var9;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.field1241 = var1.readUnsignedShort();
		if (super.field1241 == 65535) {
			super.field1241 = -1;
		}

		super.field1212 = super.field1241;
		super.field1213 = var1.readUnsignedShort();
		if (super.field1213 == 65535) {
			super.field1213 = -1;
		}

		super.field1222 = var1.readUnsignedShort();
		if (super.field1222 == 65535) {
			super.field1222 = -1;
		}

		super.field1205 = var1.readUnsignedShort();
		if (super.field1205 == 65535) {
			super.field1205 = -1;
		}

		super.field1216 = var1.readUnsignedShort();
		if (super.field1216 == 65535) {
			super.field1216 = -1;
		}

		super.field1217 = var1.readUnsignedShort();
		if (super.field1217 == 65535) {
			super.field1217 = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class236.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2366();
		if (this == class17.localPlayer) {
			GZipDecompressor.field5486 = this.username.getName();
		}

		this.field1147 = var1.readUnsignedByte();
		this.field1141 = var1.readUnsignedShort();
		this.field1142 = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.field1142 = false;
		}

		PlayerCompositionColorTextureOverride[] var28 = null;
		boolean var30 = false;
		int var10 = var1.readUnsignedShort();
		var30 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var28 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var5[var11] - 512;
					int var17 = var1.readUnsignedByte();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = (var17 & 2) != 0;
					PlayerCompositionColorTextureOverride var20 = new PlayerCompositionColorTextureOverride(var16);
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) {
						var21 = var1.readUnsignedByte();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = var20.playerCompositionRecolorTo != null && var22.length == var20.playerCompositionRecolorTo.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.readUnsignedShort();
								if (var23) {
									var20.playerCompositionRecolorTo[var22[var24]] = var25;
								}
							}
						}
					}

					if (var19) {
						var21 = var1.readUnsignedByte();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = var20.playerCompositionRetextureTo != null && var22.length == var20.playerCompositionRetextureTo.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.readUnsignedShort();
								if (var23) {
									var20.playerCompositionRetextureTo[var22[var24]] = var25;
								}
							}
						}
					}

					var28[var11] = var20;
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.field1139[var11] = var1.readStringCp1252NullTerminated();
		}

		byte var29 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6597(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2142454980"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.field1135 == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.field1135 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-984974924"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.field1135 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.field1135 = class33.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-47"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.field1159 == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.field1159 == TriBool.TriBool_true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.field1159 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.field1159 = class108.friendsChat != null && class108.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2082111608"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3340(this.username.getName()) != -1 && var1 != 2) {
				this.field1160 = TriBool.TriBool_true;
				return;
			}
		}

		this.field1160 = TriBool.TriBool_false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-708463975"
	)
	void method2366() {
		this.field1160 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-323933033"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.field1160 == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.field1160 == TriBool.TriBool_true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class134.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IILjv;B)V",
		garbageValue = "-60"
	)
	final void method2370(class101 var1, int var2, int var3, class237 var4) {
		if (super.field1223 != -1 && FaceNormal.SequenceDefinition_get(super.field1223).field2422 == 1) {
			super.field1223 = -1;
		}

		this.method2447();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.field1229[0] >= 0 && super.field1229[0] < 104 && super.field1276[0] >= 0 && super.field1276[0] < 104) {
				if (var4 == class237.field2529) {
					class141.method3184(var1, this, var2, var3, class237.field2529);
				}

				this.method2372(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1894965155"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.field1274 = 0;
		super.field1226 = 0;
		super.field1278 = 0;
		super.field1229[0] = var1;
		super.field1276[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.field1229[0] * 128;
		super.y = super.field1276[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILjv;I)V",
		garbageValue = "-1589929454"
	)
	final void method2372(int var1, int var2, class237 var3) {
		if (super.field1274 < 9) {
			++super.field1274;
		}

		for (int var4 = super.field1274; var4 > 0; --var4) {
			super.field1229[var4] = super.field1229[var4 - 1];
			super.field1276[var4] = super.field1276[var4 - 1];
			super.field1277[var4] = super.field1277[var4 - 1];
		}

		super.field1229[0] = var1;
		super.field1276[0] = var2;
		super.field1277[0] = var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1899153369"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "1"
	)
	static char method2406(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IB)V",
		garbageValue = "1"
	)
	public static void method2383(Widget var0, int var1) {
		ItemComposition var2 = KeyHandler.ItemDefinition_get(var1);
		var0.field3902.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3902.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3902.equipment[var2.maleModel2] = 0;
		}

		var0.field3902.method6576();
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "1"
	)
	public static int method2407(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5344[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
