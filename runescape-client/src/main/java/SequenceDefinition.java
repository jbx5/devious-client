import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ak")
	static boolean field2411;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	static SpritePixels[] field2434;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1594529517
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("av")
	public Map field2415;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 946625509
	)
	int field2419;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -460558267
	)
	int field2417;
	@ObfuscatedName("ae")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ax")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ay")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lik;"
	)
	@Export("soundEffects")
	public Sound[] soundEffects;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -351911437
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("aw")
	int[] field2432;
	@ObfuscatedName("ad")
	boolean[] field2418;
	@ObfuscatedName("ai")
	public boolean field2425;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1995770705
	)
	public int field2409;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 612362347
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 440495917
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1203416379
	)
	public int field2426;
	@ObfuscatedName("bs")
	public boolean field2430;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 709224351
	)
	public int field2431;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1462179751
	)
	public int field2422;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1104871125
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2411 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2419 = 0;
		this.field2417 = 0;
		this.frameCount = -1;
		this.field2425 = false;
		this.field2409 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2426 = 99;
		this.field2430 = false;
		this.field2431 = -1;
		this.field2422 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "34"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;IS)V",
		garbageValue = "352"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2432 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2432[var4] = var1.readUnsignedByte();
			}

			this.field2432[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2425 = true;
		} else if (var2 == 5) {
			this.field2409 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2426 = var1.readUnsignedByte();
			this.field2430 = true;
		} else if (var2 == 9) {
			this.field2431 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2422 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.restartMode = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new Sound[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = World.method1885(var1);
			}
		} else if (var2 == 14) {
			this.SequenceDefinition_cachedModelId = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2415 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				Sound var6 = World.method1885(var1);
				this.field2415.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2419 = var1.readUnsignedShort();
			this.field2417 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2418 = new boolean[256];

			for (var3 = 0; var3 < this.field2418.length; ++var3) {
				this.field2418[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2418[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1925909387"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2431 == -1) {
			if (this.field2432 == null && this.field2418 == null) {
				this.field2431 = 0;
			} else {
				this.field2431 = 2;
			}
		}

		if (this.field2422 == -1) {
			if (this.field2432 == null && this.field2418 == null) {
				this.field2422 = 0;
			} else {
				this.field2422 = 2;
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)Lkb;",
		garbageValue = "-165827832"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class234.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class141 var3 = BuddyRankComparator.method3009(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3151());
				var4.method5188(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkb;III)Lkb;",
		garbageValue = "-253461195"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class234.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class141 var4 = BuddyRankComparator.method3009(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3151());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5188(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)Lkb;",
		garbageValue = "80"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class234.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class141 var3 = BuddyRankComparator.method3009(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3151());
				var4.method5188(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkb;ILic;IB)Lkb;",
		garbageValue = "102"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2411 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4363(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class141 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4328();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2418 == null) {
					var5.method5188(var9, var2);
					return var5;
				}

				var8 = var9.field1650;
				var5.method5278(var8, var9, var2, this.field2418, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class234.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2432 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2432 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5193(var7, var2, this.field2432, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4328();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1650;
				}

				var5.method5278(var8, var9, var4, this.field2418, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class234.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5193(var10, var4, this.field2432, true);
			}

			if (var6 && var7 != null) {
				var5.method5193(var7, var2, this.field2432, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkb;ILic;II)Lkb;",
		garbageValue = "1778728995"
	)
	Model method4363(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class234.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class234.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2432);
				return var7;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)Lkb;",
		garbageValue = "1088449551"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class234.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class234.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int method4326() {
		return this.field2417 - this.field2419;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lfo;",
		garbageValue = "-28"
	)
	class141 method4328() {
		return this.isCachedModelIdSet() ? BuddyRankComparator.method3009(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldw;Ldm;III)V",
		garbageValue = "101678578"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		class13.Interpreter_intStackSize = 0;
		class166.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field891 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label936: {
			label937: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						UserComparator4.Interpreter_stringLocals = new String[var1.localStringCount];
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) {
							if (var4[var13] instanceof Integer) {
								var14 = (Integer)var4[var13];
								if (var14 == -2147483647) {
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) {
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) {
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) {
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) {
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								UserComparator4.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field901 = var0.field1100;

						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 >= 100) {
								boolean var34;
								if (var1.intOperands[var5] == 1) {
									var34 = true;
								} else {
									var34 = false;
								}

								var14 = class186.method3737(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label936;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								ClanChannelMember.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								class13.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								class13.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								class13.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								class13.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.pc;
								Interpreter.Interpreter_intLocals = var39.intLocals;
								UserComparator4.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ClientPacket.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								DynamicObject.method2224(var13, Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								class13.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								class13.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = UserComparator4.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								UserComparator4.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class166.Interpreter_stringStackSize -= var13;
								var20 = TileItem.method2763(Interpreter.Interpreter_stringStack, class166.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--class13.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class166.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = WorldMapCacheName.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										WorldMapCacheName.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
										if (var23 < 0 || var23 > 5000) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23;
										byte var24 = -1;
										if (var14 == 105) {
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) {
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) {
										var13 = var7[var5];
										var14 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										class13.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = WorldMapCacheName.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											WorldMapCacheName.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = WorldMapCacheName.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											WorldMapCacheName.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class333.field3642.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = MouseHandler.field242.method8893(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = TaskHandler.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class13.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class166.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class13.Interpreter_intStackSize -= var35.intArgumentCount;
									class166.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = UserComparator4.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									UserComparator4.Interpreter_stringLocals = var16;
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8);
						BufferedSink.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label937;
					}
				} finally {
					if (var29) {
						while (Interpreter.field893.size() > 0) {
							class105 var19 = (class105)Interpreter.field893.remove(0);
							class351.widgetDefaultMenuAction(var19.method2735(), var19.method2734(), var19.method2749(), var19.method2736(), "");
						}

						if (Interpreter.field891) {
							Interpreter.field891 = false;
							ObjectSound.method1966();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							BufferedSink.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field893.size() > 0) {
					class105 var40 = (class105)Interpreter.field893.remove(0);
					class351.widgetDefaultMenuAction(var40.method2735(), var40.method2734(), var40.method2749(), var40.method2736(), "");
				}

				if (Interpreter.field891) {
					Interpreter.field891 = false;
					ObjectSound.method1966();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					BufferedSink.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field893.size() > 0) {
				class105 var25 = (class105)Interpreter.field893.remove(0);
				class351.widgetDefaultMenuAction(var25.method2735(), var25.method2734(), var25.method2749(), var25.method2736(), "");
			}

			if (Interpreter.field891) {
				Interpreter.field891 = false;
				ObjectSound.method1966();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				BufferedSink.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field893.size() > 0) {
			class105 var33 = (class105)Interpreter.field893.remove(0);
			class351.widgetDefaultMenuAction(var33.method2735(), var33.method2734(), var33.method2749(), var33.method2736(), "");
		}

		if (Interpreter.field891) {
			Interpreter.field891 = false;
			ObjectSound.method1966();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			BufferedSink.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "-1193239731"
	)
	static final void method4373(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}
}
