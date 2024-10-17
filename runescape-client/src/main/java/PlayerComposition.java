import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	public static class465 field3828;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1813441507
	)
	public static int field3829;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field3818;
	@ObfuscatedName("ap")
	int[] field3827;
	@ObfuscatedName("aw")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ak")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1465710415
	)
	public int field3819;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1480159417
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1076989835
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -3832213682775569647L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 100949466399456947L
	)
	long field3822;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("at")
	boolean field3825;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1122184953
	)
	final int field3821;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3828 = new class465(16, class463.field4960);
		field3829 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lne;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3819 = -1;
		this.gender = 0;
		this.field3825 = false;
		this.field3821 = class555.field5457 < 224 ? 512 : 2048;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3827, var1.field3827.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method6927(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3819);
		}
	}

	public PlayerComposition() {
		this.field3819 = -1;
		this.gender = 0;
		this.field3825 = false;
		this.field3821 = class555.field5457 < 224 ? 512 : 2048;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgz;Z[IIIII)V",
		garbageValue = "1713089852"
	)
	public void method6927(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3825 = var4;
		this.field3819 = var8;
		this.method6928(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "918728909"
	)
	public void method6928(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6929(var4);
		}

		if (var2 == null) {
			var2 = this.method6929(var4);
		}

		this.field3827 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "95"
	)
	int[] method6929(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = MusicPatchPcmStream.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var5.method3915(var3, var1)) {
					var2[class198.method4060(var3)] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-751502758"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[class198.method4060(var1)];
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

				var4 = MusicPatchPcmStream.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || !var4.method3915(var1, this.gender));

			this.equipment[class198.method4060(var1)] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "729654427"
	)
	public void method6989(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class190.field1981[var1].length - 1;
				}
			} while(!class77.method2339(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= class190.field1981[var1].length) {
					var3 = 0;
				}
			} while(!class77.method2339(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1480036266"
	)
	public void method6932(int var1) {
		if (this.gender != var1) {
			this.method6928((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "1501095833"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[class198.method4060(var2)];
			if (class555.field5457 >= 224) {
				if (var3 == 0) {
					var1.writeShort(-1);
				} else {
					var1.writeShort(var3 - 256);
				}
			} else if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1759001823"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5464;
		this.hash = -1L;

		int var4;
		for (var4 = 0; var4 < 12; ++var4) {
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 24)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 16)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 8)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.equipment[var4]) & 255L)];
		}

		if (this.playerCompositionColorTextureOverrides != null) {
			for (var4 = 0; var4 < this.playerCompositionColorTextureOverrides.length; ++var4) {
				if (this.playerCompositionColorTextureOverrides[var4] != null) {
					int var5;
					if (this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo != null) {
						for (var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo.length; ++var5) {
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo[var5] >> 8)) & 255L)];
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo[var5]) & 255L)];
						}
					}

					if (this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo != null) {
						for (var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo.length; ++var5) {
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo[var5] >> 8)) & 255L)];
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo[var5]) & 255L)];
						}
					}
				}
			}
		}

		for (var4 = 0; var4 < 5; ++var4) {
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.bodyColors[var4]) & 255L)];
		}

		this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.gender) & 255L)];
		if (0L != var1 && this.hash != var1 || this.field3825) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Liu;ILiu;II)Ljy;",
		garbageValue = "-530692211"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return ActorSpotAnim.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class213.field2333.field2332]) << 40;
					var7[class213.field2333.field2332] = this.method6987(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class213.field2338.field2332]) << 48;
					var7[class213.field2338.field2332] = this.method6987(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method6943(var11)) {
						KitDefinition var18 = this.method6963(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method6945(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method6931(var11).method4302(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field3822 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3822);
					}

					if (var8 == null) {
						return null;
					}
				}

				if (var8 == null) {
					ModelData[] var17 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (this.method6943(var13)) {
							KitDefinition var14 = this.method6963(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method6945(var13)) {
							ItemComposition var20 = this.method6931(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4280(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class190.field1981[var13].length) {
							var23.recolor(ArchiveDiskActionHandler.field4539[var13], class190.field1981[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class340.field3707[var13].length) {
							var23.recolor(class75.field902[var13], class340.field3707[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3822 = var5;
				}
			}

			Model var19;
			if (var1 == null && var3 == null) {
				var19 = var8.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var19 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var19 = var1.transformActorModel(var8, var2);
			} else {
				var19 = var3.transformActorModel(var8, var4);
			}

			return var19;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "139804832"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return ActorSpotAnim.getNpcDefinition(this.npcTransformId).method4026((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method6943(var3)) {
					KitDefinition var9 = this.method6963(var3);
					if (var9 != null && !var9.method3917()) {
						var1 = true;
					}
				}

				if (this.method6945(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method6931(var3).method4281(this.gender, var11)) {
						var1 = true;
					}
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var8 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var7;
					if (this.method6943(var5)) {
						KitDefinition var6 = this.method6963(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method6945(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method6931(var5).method4310(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class190.field1981[var5].length) {
						var12.recolor(ArchiveDiskActionHandler.field4539[var5], class190.field1981[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class340.field3707[var5].length) {
						var12.recolor(class75.field902[var5], class340.field3707[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-928292543"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3828.method8892(var1);
		if (var3 == null) {
			var3 = ++field3829 - 1;
			field3828.method8895(var1, var3);
			field3829 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	void method6934() {
		this.method6928(this.field3827, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-33302455"
	)
	public void method6939(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class198.method4060(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < this.field3821) {
						this.equipment[var5] = this.field3827[var5];
					}
				}
			} else {
				if (this.equipment[0] < this.field3821 || this.method6940()) {
					this.equipment[class213.field2330.field2332] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class198.method4060(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < this.field3821) {
						VarbitComposition.method4131(var2, this.equipment, var4);
					}
				}
			}
		}

		this.method6934();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1599741666"
	)
	boolean method6940() {
		if (!this.method6945(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method6931(this.equipment[0]);
			return var1.maleModel1 != class213.field2330.field2332 && var1.maleModel2 != class213.field2330.field2332;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "113"
	)
	public void method6926(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method6934();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-430265525"
	)
	public void method6942(int var1) {
		ItemComposition var2 = Bounds.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = this.field3821 + var1;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method6934();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-9"
	)
	boolean method6943(int var1) {
		return var1 >= 256 && var1 < this.field3821;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "-1257697154"
	)
	KitDefinition method6963(int var1) {
		int var3 = var1 - 256;
		KitDefinition var4 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var3);
		KitDefinition var2;
		if (var4 != null) {
			var2 = var4;
		} else if (GrandExchangeOfferNameComparator.KitDefinition_archive == null) {
			var2 = null;
		} else {
			byte[] var5 = GrandExchangeOfferNameComparator.KitDefinition_archive.takeFile(3, var3);
			var4 = new KitDefinition();
			if (var5 != null) {
				var4.decode(new Buffer(var5));
			}

			KitDefinition.KitDefinition_cached.put(var4, (long)var3);
			var2 = var4;
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2133129618"
	)
	boolean method6945(int var1) {
		return var1 >= this.field3821;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lip;",
		garbageValue = "30"
	)
	ItemComposition method6931(int var1) {
		return Bounds.ItemDefinition_get(var1 - this.field3821);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "199"
	)
	int method6987(int var1) {
		return var1 - 512 + this.field3821;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "1968718707"
	)
	public static void method6944(AbstractArchive var0) {
		DbTableType.field5394 = var0;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method7004() {
		if (class198.topLevelWorldView != null) {
			class198.topLevelWorldView.scene.method5016(TaskHandler.clientPreferences.getDrawDistance());
		}

	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Lvm;I)V",
		garbageValue = "-1860926341"
	)
	static final void method7006(WorldView var0, PacketBuffer var1) {
		for (int var2 = 0; var2 < Client.npcCount; ++var2) {
			int var3 = Client.npcIndices[var2];
			NPC var4 = var0.npcs[var3];
			int var5 = var1.readUnsignedByte();
			int var6;
			if ((var5 & 128) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 8;
			}

			if ((var5 & 8192) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 16;
			}

			if ((var5 & 256) != 0) {
				var4.field1292 = var1.readUnsignedIntIME();
			}

			if ((var5 & 1024) != 0) {
				var4.method2964(var1.readUnsignedByteAdd());
			}

			int[] var7;
			int var8;
			int var9;
			int var10;
			int var11;
			short[] var14;
			short[] var15;
			long var16;
			boolean var19;
			if ((var5 & 16384) != 0) {
				var6 = var1.readUnsignedByteSub();
				if ((var6 & 1) == 1) {
					var4.method2980();
				} else {
					var7 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByteAdd();
						var7 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShortAddLE();
							var10 = var10 == 65535 ? -1 : var10;
							var7[var9] = var10;
						}
					}

					var14 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var14 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var14[var10] = (short)var1.readUnsignedShort();
						}
					}

					var15 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.definition.retextureTo != null) {
							var10 = var4.definition.retextureTo.length;
						}

						var15 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var15[var11] = (short)var1.readUnsignedShort();
						}
					}

					var19 = false;
					if ((var6 & 16) != 0) {
						var19 = var1.readUnsignedByteNeg() == 1;
					}

					var16 = (long)(++NPC.field1369 - 1);
					var4.method2978(new NpcOverrides(var16, var7, var14, var15, var19));
				}
			}

			if ((var5 & 4096) != 0) {
				var6 = var1.readUnsignedByteSub();
				if ((var6 & 1) == 1) {
					var4.method2979();
				} else {
					var7 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByte();
						var7 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShortAddLE();
							var10 = var10 == 65535 ? -1 : var10;
							var7[var9] = var10;
						}
					}

					var14 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var14 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var14[var10] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var15 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.definition.retextureTo != null) {
							var10 = var4.definition.retextureTo.length;
						}

						var15 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var15[var11] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var19 = false;
					if ((var6 & 16) != 0) {
						var19 = var1.readUnsignedByteNeg() == 1;
					}

					var16 = (long)(++NPC.field1376 - 1);
					var4.method2976(new NpcOverrides(var16, var7, var14, var15, var19));
				}
			}

			if ((var5 & 262144) != 0) {
				var6 = var1.readUnsignedByte();
				if (var6 == 0) {
					var4.method2975();
				} else {
					var7 = new int[8];
					var14 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var7[var9] = var1.readNullableLargeSmart();
							var14[var9] = (short)var1.readShortSmartSub();
						} else {
							var7[var9] = -1;
							var14[var9] = -1;
						}
					}

					var4.method3021(var7, var14);
				}
			}

			if ((var5 & 65536) != 0) {
				var6 = var1.readUnsignedIntME();
				var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var4.definition.turnLeftSequence;
				var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShort() : var4.definition.turnRightSequence;
				var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkSequence;
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkBackSequence;
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkLeftSequence;
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShort() : var4.definition.walkRightSequence;
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2038;
				var4.field1290 = (var6 & 128) != 0 ? var1.readUnsignedShort() : var4.definition.field2021;
				var4.field1231 = (var6 & 256) != 0 ? var1.readUnsignedShort() : var4.definition.field2022;
				var4.field1232 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var4.definition.field2023;
				var4.field1288 = (var6 & 1024) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2024;
				var4.field1224 = (var6 & 2048) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2025;
				var4.field1257 = (var6 & 4096) != 0 ? var1.readUnsignedShort() : var4.definition.field2026;
				var4.field1236 = (var6 & 8192) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2027;
				var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.idleSequence;
			}

			if ((var5 & 16) != 0) {
				var4.targetIndex = var1.readUnsignedShort();
				var4.targetIndex += var1.readUnsignedByteAdd() << 16;
				var6 = 16777215;
				if (var6 == var4.targetIndex) {
					var4.targetIndex = -1;
				}
			}

			int var18;
			if ((var5 & 64) != 0) {
				var6 = var1.readUnsignedShortAddLE();
				if (var6 == 65535) {
					var6 = -1;
				}

				var18 = var1.readUnsignedByteSub();
				if (var6 == var4.sequence && var6 != -1) {
					var8 = Widget.SequenceDefinition_get(var6).restartMode;
					if (var8 == 1) {
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var18;
						var4.field1237 = 0;
					}

					if (var8 == 2) {
						var4.field1237 = 0;
					}
				} else if (var6 == -1 || var4.sequence == -1 || Widget.SequenceDefinition_get(var6).field2320 >= Widget.SequenceDefinition_get(var4.sequence).field2320) {
					var4.sequence = var6;
					var4.sequenceFrame = 0;
					var4.sequenceFrameCycle = 0;
					var4.sequenceDelay = var18;
					var4.field1237 = 0;
					var4.field1291 = var4.pathLength;
				}
			}

			if ((var5 & 131072) != 0) {
				var6 = var1.readUnsignedByteAdd();

				for (var18 = 0; var18 < var6; ++var18) {
					var8 = var1.readUnsignedByteAdd();
					var9 = var1.readUnsignedShortAddLE();
					var10 = var1.readInt();
					var4.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 512) != 0) {
				var4.method2963(var1.readStringCp1252NullTerminated());
			}

			if ((var5 & 32) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			if ((var5 & 2048) != 0) {
				var4.field1268 = var1.readByteSub();
				var4.field1228 = var1.readByteNeg();
				var4.field1286 = var1.readByteNeg();
				var4.field1271 = var1.readByteAdd();
				var4.spotAnimation = var1.readUnsignedShortLE() + Client.cycle;
				var4.field1273 = var1.readUnsignedShortLE() + Client.cycle;
				var4.field1223 = var1.readUnsignedShort();
				var4.pathLength = 1;
				var4.field1291 = 0;
				var4.field1268 += var4.pathX[0];
				var4.field1228 += var4.pathY[0];
				var4.field1286 += var4.pathX[0];
				var4.field1271 += var4.pathY[0];
			}

			if ((var5 & 8) != 0) {
				var6 = var1.readUnsignedShortAddLE();
				var18 = var1.readUnsignedShortLE();
				var4.field1256 = var1.readUnsignedByteNeg() == 1;
				var4.field1254 = var6;
				var4.field1258 = var18;
			}

			if ((var5 & 32768) != 0) {
				var4.field1277 = Client.cycle + var1.readUnsignedShortAdd();
				var4.field1278 = Client.cycle + var1.readUnsignedShortAddLE();
				var4.field1276 = var1.readByteAdd();
				var4.field1280 = var1.readByteSub();
				var4.field1281 = var1.readByte();
				var4.field1282 = (byte)var1.readUnsignedByteAdd();
			}

			if ((var5 & 4) != 0) {
				var1.readUnsignedShortLE();
				var1.readUnsignedIntME();
			}

			if ((var5 & 1) != 0) {
				var4.definition = ActorSpotAnim.getNpcDefinition(var1.readUnsignedShort());
				MidiPcmStream.method6725(var4);
			}

			if ((var5 & 2) != 0) {
				var6 = var1.readUnsignedByteSub();
				int var12;
				if (var6 > 0) {
					for (var18 = 0; var18 < var6; ++var18) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var1.readUShortSmart();
						if (var8 == 32767) {
							var8 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var9 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
						} else if (var8 != 32766) {
							var10 = var1.readUShortSmart();
						} else {
							var8 = -1;
						}

						var12 = var1.readUShortSmart();
						var4.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
					}
				}

				var18 = var1.readUnsignedByteSub();
				if (var18 > 0) {
					for (var8 = 0; var8 < var18; ++var8) {
						var9 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.readUnsignedByteNeg();
							int var13 = var10 > 0 ? var1.readUnsignedByteSub() : var12;
							var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var9);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method7003(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		TaskHandler.clientPreferences.updateSoundEffectVolume(var0);
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2144184246"
	)
	static boolean method6959() {
		return TaskHandler.clientPreferences.getEULA() >= Client.field537;
	}
}
