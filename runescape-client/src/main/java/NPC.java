import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -577456805
	)
	static int field1369;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1745507437
	)
	static int field1376;
	@ObfuscatedName("jq")
	static int[] field1374;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2072141149
	)
	int field1372;
	@ObfuscatedName("ak")
	String field1370;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -86164203
	)
	int field1377;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	class558 field1375;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1369 = 1;
		field1376 = 1;
	}

	NPC() {
		this.field1370 = "";
		this.field1377 = 31;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.field1372;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljy;",
		garbageValue = "1885718735"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? Widget.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : Widget.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = SpriteMask.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2731(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1282 != 0 && Client.cycle >= super.field1277 && Client.cycle < super.field1278) {
					var3.overrideHue = super.field1276;
					var3.overrideSaturation = super.field1280;
					var3.overrideLuminance = super.field1281;
					var3.overrideAmount = super.field1282;
					var3.field2886 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1699178166"
	)
	void method2963(String var1) {
		this.field1370 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	void method2964(int var1) {
		this.field1377 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-209333954"
	)
	boolean method2993(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1377 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-9"
	)
	final String method2966() {
		if (!this.field1370.isEmpty()) {
			return this.field1370;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILkk;I)V",
		garbageValue = "134462349"
	)
	final void method2967(int var1, MoveSpeed var2) {
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

		if (super.sequence != -1 && Widget.SequenceDefinition_get(super.sequence).field2327 == 1) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2033412316"
	)
	final void method2968(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && Widget.SequenceDefinition_get(super.sequence).field2327 == 1) {
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
				super.pathTraversed[0] = MoveSpeed.field3048;
				return;
			}
		}

		super.pathLength = 0;
		super.field1291 = 0;
		super.field1263 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1220 * 64 + super.pathX[0] * 128;
		super.y = super.field1220 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "32"
	)
	int[] method2989() {
		return this.field1375 != null ? this.field1375.method10380() : this.definition.method4002();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "3"
	)
	short[] method2972() {
		return this.field1375 != null ? this.field1375.method10374() : this.definition.method4004();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-613355418"
	)
	void method3007(int var1, int var2, short var3) {
		if (this.field1375 == null) {
			this.field1375 = new class558(this.definition);
		}

		this.field1375.method10376(var1, var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "116"
	)
	void method3021(int[] var1, short[] var2) {
		if (this.field1375 == null) {
			this.field1375 = new class558(this.definition);
		}

		this.field1375.method10377(var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1952017314"
	)
	void method2975() {
		this.field1375 = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhn;B)V",
		garbageValue = "95"
	)
	void method2976(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lhn;",
		garbageValue = "0"
	)
	NpcOverrides method2977() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lhn;S)V",
		garbageValue = "3149"
	)
	void method2978(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1413118539"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "432"
	)
	void method2979() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104795295"
	)
	void method2980() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1402095723"
	)
	int vmethod2981() {
		return this.definition.field2050 == -1 ? super.defaultHeight : this.definition.field2050;
	}
}
