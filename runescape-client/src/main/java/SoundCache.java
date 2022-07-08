import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("aq")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "[[Lkb;")
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;

	@ObfuscatedName("jl")
	@ObfuscatedGetter(intValue = -2119317865)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("musicSamples")
	NodeHashTable musicSamples;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(descriptor = "(Llh;Llh;)V")
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II[IB)Laf;", garbageValue = "-125")
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = ((long) (var4));
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}
				return var7;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II[II)Laf;", garbageValue = "-713616404")
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = ((long) (var4)) ^ 4294967296L;
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = ((VorbisSample) (this.musicSamples.get(var5)));
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}
				this.musicSamples.put(var8, var5);
			}
			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I[II)Laf;", garbageValue = "-1912096844")
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I[IB)Laf;", garbageValue = "0")
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;Llh;Llh;I)V", garbageValue = "1628403772")
	public static void method762(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "297920354")
	public static boolean method764(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IS)Z", garbageValue = "275")
	public static boolean method753(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field141[var0] : false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1943432471")
	public static void method763() {
		WorldMapElement.WorldMapElement_cachedSprites.clear();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1304277979")
	static void method766() {
		class426.SpriteBuffer_xOffsets = null;
		class142.SpriteBuffer_yOffsets = null;
		class359.SpriteBuffer_spriteWidths = null;
		class456.SpriteBuffer_spriteHeights = null;
		class13.SpriteBuffer_spritePalette = null;
		class421.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(descriptor = "(Lpq;B)V", garbageValue = "41")
	static final void method765(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field538; ++var1) {
			int var2 = Client.field539[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if (class101.field1366 && (var4 & 64) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}
			if ((var4 & 1024) != 0) {
				var3.field1189 = Client.cycle + var0.readUnsignedShortAdd();
				var3.field1135 = Client.cycle + var0.readUnsignedShortLE();
				var3.field1191 = var0.readByte();
				var3.field1192 = var0.readByteNeg();
				var3.field1193 = var0.readByteSub();
				var3.field1133 = ((byte) (var0.readUnsignedByteSub()));
			}
			int var6;
			int var7;
			if ((var4 & 16) != 0) {
				var5 = var0.readUnsignedShortLE();
				if (var5 == 65535) {
					var5 = -1;
				}
				var6 = var0.readUnsignedByteNeg();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = ScriptFrame.SequenceDefinition_get(var5).field2174;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1190 = 0;
					}
					if (var7 == 2) {
						var3.field1190 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || ScriptFrame.SequenceDefinition_get(var5).field2183 >= ScriptFrame.SequenceDefinition_get(var3.sequence).field2183) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1190 = 0;
					var3.field1203 = var3.pathLength;
				}
			}
			if ((var4 & 2) != 0) {
				var3.spotAnimation = var0.readUnsignedShortAdd();
				var5 = var0.readUnsignedIntLE();
				var3.spotAnimationHeight = var5 >> 16;
				var3.field1178 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1178 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}
				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}
			int var8;
			if ((var4 & 32) != 0) {
				var5 = var0.readUnsignedByte();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}
						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}
				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByteSub();
							int var12 = (var9 > 0) ? var0.readUnsignedByteSub() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}
			if ((var4 & 512) != 0) {
				var3.method2373(var0.readStringCp1252NullTerminated());
			}
			if ((var4 & 2048) != 0) {
				var3.field1204 = var0.readUnsignedIntME();
			}
			if ((var4 & 8) != 0) {
				var3.definition = BuddyRankComparator.getNpcDefinition(var0.readUnsignedShortAddLE());
				var3.field1205 = var3.definition.size;
				var3.field1129 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}
			if ((var4 & 128) != 0) {
				var3.targetIndex = var0.readUnsignedShortAddLE();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}
			if (class101.field1366 && (var4 & 256) != 0 || !class101.field1366 && (var4 & 64) != 0) {
				var3.field1140 = var0.readByteSub();
				var3.field1182 = var0.readByteNeg();
				var3.field1181 = var0.readByteAdd();
				var3.field1183 = var0.readByteAdd();
				var3.field1184 = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1194 = var0.readUnsignedShortAdd() + Client.cycle;
				var3.field1186 = var0.readUnsignedShortAddLE();
				var3.pathLength = 1;
				var3.field1203 = 0;
				var3.field1140 += var3.pathX[0];
				var3.field1182 += var3.pathY[0];
				var3.field1181 += var3.pathX[0];
				var3.field1183 += var3.pathY[0];
			}
			if ((var4 & 1) != 0) {
				var5 = var0.readUnsignedShortAddLE();
				var6 = var0.readUnsignedShortAdd();
				if (class101.field1366) {
					var3.field1161 = var0.readUnsignedByteNeg() == 1;
				}
				var7 = var3.x - (var5 - class28.baseX - class28.baseX) * 64;
				var8 = var3.y - (var6 - WorldMapLabelSize.baseY - WorldMapLabelSize.baseY) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1165 = ((int) (Math.atan2(((double) (var7)), ((double) (var8))) * 325.949)) & 2047;
				}
			}
			if ((var4 & 4) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}
		}
	}
}