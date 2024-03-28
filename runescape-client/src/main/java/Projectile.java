import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 66464725
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 138730963
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 543043153
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -152487185
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1578002187
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1990585513
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1755264033
	)
	int field972;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 214178127
	)
	int field973;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -932015863
	)
	int field974;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1306387001
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1570300067
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 941385441
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 925751269
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1211907925
	)
	int field979;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -698893791
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aj")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("au")
	@Export("x")
	double x;
	@ObfuscatedName("ay")
	@Export("y")
	double y;
	@ObfuscatedName("ap")
	@Export("z")
	double z;
	@ObfuscatedName("av")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("aa")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("aq")
	@Export("speed")
	double speed;
	@ObfuscatedName("am")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ac")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1600921187
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 349026613
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 11122815
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -462633923
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = UserComparator3.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = DevicePcmPlayerProvider.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field979 = var10;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1281480726"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field972 = var1;
		this.field973 = var2;
		this.field974 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field972 - this.sourceX);
			double var7 = (double)(this.field973 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field972 - this.x) / var5;
		this.speedY = ((double)this.field973 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)this.field974 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = UserComparator3.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "141084497"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += this.speedZ * (double)var1 + this.accelerationZ * 0.5D * (double)var1 * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method4232();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lds;",
		garbageValue = "2086329573"
	)
	static ClientPreferences method2178() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = ClanChannel.getPreferencesFile("", HorizontalAlignment.field2089.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "250126113"
	)
	static final void method2177() {
		class6.method40("You can't add yourself to your own ignore list");
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1456694734"
	)
	static int method2176(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class11.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = HttpResponse.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = UserComparator6.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					HttpRequestTask.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3] == 1;
					WorldMapArea.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							var5 = class127.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = UserComparator10.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = UserComparator10.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							var5 = class127.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = MouseRecorder.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = MouseRecorder.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							var5 = class127.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = HttpRequest.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							var5 = class127.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class136.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class136.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize;
							--HttpRequestTask.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize;
							--HttpRequestTask.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.field794;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1129926855"
	)
	static boolean method2171(int var0) {
		for (int var1 = 0; var1 < Client.field611; ++var1) {
			if (Client.field767[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
