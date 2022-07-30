import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("co")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("su")
	@ObfuscatedGetter(intValue = -153857664)
	static int field1261;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lfx;")
	@Export("definition")
	NPCComposition definition;

	@ObfuscatedName("q")
	String field1259 = "";

	NPC() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-61")
	void method2412(String var1) {
		this.field1259 = (var1 == null) ? "" : var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lhd;", garbageValue = "-842208187")
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = (super.sequence != -1 && super.sequenceDelay == 0) ? class14.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = (super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null) ? null : class14.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var5 = class13.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var5 != null) {
						var5.offsetBy(0, -super.spotAnimationHeight, 0);
						Model[] var6 = new Model[]{ var3, var5 };
						var3 = new Model(var6, 2);
					}
				}
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}
				if (super.field1184 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1136) {
					var3.overrideHue = super.field1191;
					var3.overrideSaturation = super.field1168;
					var3.overrideLuminance = super.field1193;
					var3.overrideAmount = super.field1184;
					var3.field2516 = ((short) (var4));
				} else {
					var3.overrideAmount = 0;
				}
				return var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "124")
	final String method2413() {
		if (!this.field1259.isEmpty()) {
			return this.field1259;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}
			return var1.name;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILgl;I)V", garbageValue = "-177937130")
	final void method2414(int var1, class192 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}
		if (var1 == 1) {
			++var4;
		}
		if (var1 == 2) {
			++var3;
			++var4;
		}
		if (var1 == 3) {
			--var3;
		}
		if (var1 == 4) {
			++var3;
		}
		if (var1 == 5) {
			--var3;
			--var4;
		}
		if (var1 == 6) {
			--var4;
		}
		if (var1 == 7) {
			++var3;
			--var4;
		}
		if (super.sequence != -1 && class14.SequenceDefinition_get(super.sequence).field2156 == 1) {
			super.sequence = -1;
		}
		if (super.pathLength < 9) {
			++super.pathLength;
		}
		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}
		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "421072963")
	final void method2415(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class14.SequenceDefinition_get(super.sequence).field2156 == 1) {
			super.sequence = -1;
		}
		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}
				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}
				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class192.field2194;
				return;
			}
		}
		super.pathLength = 0;
		super.field1203 = 0;
		super.field1142 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1202 * 64 + super.pathX[0] * 128;
		super.y = super.field1202 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2042091468")
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Llc;III)[Lqj;", garbageValue = "-2054591461")
	public static SpritePixels[] method2434(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class83.SpriteBuffer_decode(var4);
			var3 = true;
		}
		return !var3 ? null : class291.method5570();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-798314074")
	public static int method2433(int var0) {
		return (var0 & class439.field4696) - 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IB)Lbd;", garbageValue = "125")
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)Lbk;", garbageValue = "29")
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class93.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(descriptor = "(ZLqy;B)V", garbageValue = "-16")
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			int var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
			class131.xteaKeys = new int[var4][4];
			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class131.xteaKeys[var5][var6] = var1.readInt();
				}
			}
			FileSystem.regions = new int[var4];
			MidiPcmStream.regionMapArchiveIds = new int[var4];
			class19.regionLandArchiveIds = new int[var4];
			class7.regionLandArchives = new byte[var4][];
			PcmPlayer.regionMapArchives = new byte[var4][];
			var4 = 0;
			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					FileSystem.regions[var4] = var7;
					MidiPcmStream.regionMapArchiveIds[var4] = class21.archive9.getGroupId("m" + var5 + "_" + var6);
					class19.regionLandArchiveIds[var4] = class21.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}
			class18.method265(var3, var2, true);
		} else {
			boolean var15 = var1.readUnsignedByteAdd() == 1;
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShortLE();
			var5 = var1.readUnsignedShort();
			var1.importIndex();
			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}
			var1.exportIndex();
			class131.xteaKeys = new int[var5][4];
			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class131.xteaKeys[var6][var7] = var1.readInt();
				}
			}
			FileSystem.regions = new int[var5];
			MidiPcmStream.regionMapArchiveIds = new int[var5];
			class19.regionLandArchiveIds = new int[var5];
			class7.regionLandArchives = new byte[var5][];
			PcmPlayer.regionMapArchives = new byte[var5][];
			var5 = 0;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;
							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (FileSystem.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}
							if (var12 != -1) {
								FileSystem.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								MidiPcmStream.regionMapArchiveIds[var5] = class21.archive9.getGroupId("m" + var13 + "_" + var14);
								class19.regionLandArchiveIds[var5] = class21.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}
			class18.method265(var4, var3, !var15);
		}
	}
}