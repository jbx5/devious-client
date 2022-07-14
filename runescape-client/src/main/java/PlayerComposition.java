import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("th")
	@ObfuscatedGetter(intValue = 882469973)
	static int field3346;

	@ObfuscatedName("y")
	public static short[] field3343;

	@ObfuscatedName("i")
	public static short[][] field3342;

	@ObfuscatedName("t")
	public static short[][] field3334;

	@ObfuscatedName("z")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;

	@ObfuscatedName("c")
	@Export("equipment")
	int[] equipment;

	@ObfuscatedName("v")
	@Export("bodyColors")
	int[] bodyColors;

	@ObfuscatedName("q")
	@Export("isFemale")
	public boolean isFemale;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 855497951)
	@Export("npcTransformId")
	public int npcTransformId;

	@ObfuscatedName("j")
	@ObfuscatedGetter(longValue = -4116623341203596551L)
	@Export("hash")
	long hash;

	@ObfuscatedName("e")
	@ObfuscatedGetter(longValue = 5787532750931398799L)
	long field3345;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "[Lfy;")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;

	@ObfuscatedName("w")
	boolean field3341;

	static {
		equipmentIndices = new int[]{ 8, 11, 4, 6, 9, 7, 10 };
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3341 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([I[Lfy;Z[IZII)V", garbageValue = "927894268")
	public void method5566(int[] var1, PlayerCompositionColorTextureOverride[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.playerCompositionColorTextureOverrides = var2;
		this.field3341 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "([I[IZII)V", garbageValue = "-532197746")
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];
			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = SecureRandomFuture.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var5 + (var3 ? 7 : 0) == var7.bodypartID) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "-624055687")
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;
				KitDefinition var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0) {
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0;
						}
					}
					var4 = SecureRandomFuture.KitDefinition_get(var3);
				} while (var4 == null || var4.nonSelectable || (this.isFemale ? 7 : 0) + var1 != var4.bodypartID );
				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "-875424667")
	public void method5573(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3342[var1].length - 1;
				}
				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while (!var4 );
		} else {
			do {
				++var3;
				if (var3 >= field3342[var1].length) {
					var3 = 0;
				}
				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while (!var4 );
		}
		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-610212168")
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update(((int[]) (null)), this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-159809821")
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0);
		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}
		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-288616983")
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;
		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += ((long) (this.equipment[var5] - 256));
			}
		}
		if (this.equipment[0] >= 256) {
			this.hash += ((long) (this.equipment[0] - 256 >> 4));
		}
		if (this.equipment[1] >= 256) {
			this.hash += ((long) (this.equipment[1] - 256 >> 8));
		}
		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += ((long) (this.bodyColors[var5]));
		}
		this.hash <<= 1;
		this.hash += ((long) ((this.isFemale) ? 1 : 0));
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field3341) {
			PlayerAppearance_cachedModels.remove(var1);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lgc;ILgc;II)Lhy;", garbageValue = "-2130042803")
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return BuddyRankComparator.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}
				if (var1.shield >= 0) {
					var5 += ((long) (var1.shield - this.equipment[5] << 40));
					var7[5] = var1.shield;
				}
				if (var1.weapon >= 0) {
					var5 += ((long) (var1.weapon - this.equipment[3] << 48));
					var7[3] = var1.weapon;
				}
			}
			Model var18 = ((Model) (PlayerAppearance_cachedModels.get(var5)));
			if (var18 == null) {
				boolean var9 = false;
				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !SecureRandomFuture.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}
					if (var11 >= 512 && !EnumComposition.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}
				if (var9) {
					if (-1L != this.field3345) {
						var18 = ((Model) (PlayerAppearance_cachedModels.get(this.field3345)));
					}
					if (var18 == null) {
						return null;
					}
				}
				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;
					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = SecureRandomFuture.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}
						if (var13 >= 512) {
							ItemComposition var22 = EnumComposition.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3721(this.isFemale);
							if (var15 != null) {
								if (this.playerCompositionColorTextureOverrides != null) {
									PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12];
									if (var16 != null) {
										int var17;
										if (var16.playerCompositionRecolorTo != null && var22.recolorFrom != null && var22.recolorTo.length == var16.playerCompositionRecolorTo.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.playerCompositionRecolorTo[var17]);
											}
										}
										if (var16.playerCompositionRetextureTo != null && var22.retextureFrom != null && var16.playerCompositionRetextureTo.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.playerCompositionRetextureTo[var17]);
											}
										}
									}
								}
								var19[var11++] = var15;
							}
						}
					}
					ModelData var20 = new ModelData(var19, var11);
					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < field3342[var13].length) {
							var20.recolor(field3343[var13], field3342[var13][this.bodyColors[var13]]);
						}
						if (this.bodyColors[var13] < field3334[var13].length) {
							var20.recolor(WorldMapSectionType.field2793[var13], field3334[var13][this.bodyColors[var13]]);
						}
					}
					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3345 = var5;
				}
			}
			if (var1 == null && var3 == null) {
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) {
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) {
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4);
				}
				return var21;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)Lgw;", garbageValue = "67")
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return BuddyRankComparator.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;
			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !SecureRandomFuture.KitDefinition_get(var3 - 256).method3417()) {
					var1 = true;
				}
				if (var3 >= 512 && !EnumComposition.ItemDefinition_get(var3 - 512).method3746(this.isFemale)) {
					var1 = true;
				}
			}
			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;
				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = SecureRandomFuture.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
					if (var5 >= 512) {
						var6 = EnumComposition.ItemDefinition_get(var5 - 512).method3723(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}
				ModelData var8 = new ModelData(var7, var3);
				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field3342[var5].length) {
						var8.recolor(field3343[var5], field3342[var5][this.bodyColors[var5]]);
					}
					if (this.bodyColors[var5] < field3334[var5].length) {
						var8.recolor(WorldMapSectionType.field2793[var5], field3334[var5][this.bodyColors[var5]]);
					}
				}
				return var8;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "813764515")
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + BuddyRankComparator.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Llb;II)Ljt;", garbageValue = "-1658860348")
	public static PacketBufferNode method5600(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = EnumComposition.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		byte var7 = 0;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) {
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) {
				var7 = 10;
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11;
				var1 = var1.substring("glow3:".length());
			}
		}
		var6 = var1.toLowerCase();
		byte var8 = 0;
		if (var6.startsWith("wave:")) {
			var8 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var8 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var8 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var8 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var8 = 5;
			var1 = var1.substring("slide:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("wave:")) {
				var8 = 1;
				var1 = var1.substring("wave:".length());
			} else if (var6.startsWith("wave2:")) {
				var8 = 2;
				var1 = var1.substring("wave2:".length());
			} else if (var6.startsWith("shake:")) {
				var8 = 3;
				var1 = var1.substring("shake:".length());
			} else if (var6.startsWith("scroll:")) {
				var8 = 4;
				var1 = var1.substring("scroll:".length());
			} else if (var6.startsWith("slide:")) {
				var8 = 5;
				var1 = var1.substring("slide:".length());
			}
		}
		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var8);
		PcmPlayer.method720(var4.packetBuffer, var1);
		if (var0 == class295.field3528.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}
		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}