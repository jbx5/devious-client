import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1460817999
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("f")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("n")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("k")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("w")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -450320321
	)
	int field1234;
	@ObfuscatedName("q")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1663068863
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1084788481
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -14495649
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1273309993
	)
	int field1243;
	@ObfuscatedName("h")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1030816249
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("u")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10; // L: 11
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1243 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2386(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1243 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) { // L: 32
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 37
				if (var1.readUnsignedByte() == 1) { // L: 41
					this.roofsHidden = true; // L: 42
				}

				if (var2 > 1) { // L: 44
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 45
				}

				if (var2 > 3) { // L: 47
					this.windowMode = var1.readUnsignedByte(); // L: 48
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) { // L: 52
						int var5 = var1.readInt();
						int var6 = var1.readInt(); // L: 54
						this.parameters.put(var5, var6); // L: 55
					}
				}

				if (var2 > 4) { // L: 58
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 59
				}

				if (var2 > 5) { // L: 61
					this.hideUsername = var1.readBoolean(); // L: 62
				}

				if (var2 > 6) { // L: 64
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 65
					this.musicVolume = var1.readUnsignedByte(); // L: 66
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 67
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 68
				}

				if (var2 > 7) { // L: 70
					this.field1243 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1234 = var1.readInt(); // L: 77
				}
			} else {
				this.method2386(true); // L: 38
			}
		} else {
			this.method2386(true); // L: 33
		}

	} // L: 81

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1182413250"
	)
	void method2386(boolean var1) {
	} // L: 83

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lqq;",
		garbageValue = "1274404202"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 86
		var1.writeByte(ClientPreferences_optionCount); // L: 87
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 88
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 89
		var1.writeByte(this.windowMode); // L: 90
		var1.writeByte(this.parameters.size()); // L: 91
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 92

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 93
			var1.writeInt((Integer)var3.getKey()); // L: 95
			var1.writeInt((Integer)var3.getValue()); // L: 96
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 99
		var1.writeBoolean(this.hideUsername); // L: 100
		var1.writeByte((int)(100.0D * this.brightness)); // L: 101
		var1.writeByte(this.musicVolume); // L: 102
		var1.writeByte(this.soundEffectsVolume); // L: 103
		var1.writeByte(this.areaSoundEffectsVolume); // L: 104
		var1.writeByte(this.field1243); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1234); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "66"
	)
	void method2412(boolean var1) {
		this.roofsHidden = var1; // L: 150
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 151
	} // L: 152

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1676530066"
	)
	boolean method2452() {
		return this.roofsHidden; // L: 155
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-48"
	)
	void method2390(boolean var1) {
		this.hideUsername = var1; // L: 159
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 160
	} // L: 161

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1474436266"
	)
	boolean method2397() {
		return this.hideUsername; // L: 164
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	void method2392(boolean var1) {
		this.titleMusicDisabled = var1; // L: 168
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	boolean method2393() {
		return this.titleMusicDisabled; // L: 173
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "50"
	)
	void method2394(boolean var1) {
		this.displayFps = var1; // L: 177
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	void method2395() {
		this.method2394(!this.displayFps); // L: 182
	} // L: 183

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-869794111"
	)
	boolean method2396() {
		return this.displayFps; // L: 186
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2141560552"
	)
	void method2451(int var1) {
		this.field1234 = var1; // L: 190
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 191
	} // L: 192

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-487908407"
	)
	int method2398() {
		return this.field1234; // L: 195
	}

	@ObfuscatedName("d")
	void method2399(double var1) {
		this.brightness = var1; // L: 199
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 200
	} // L: 201

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1993581063"
	)
	double method2387() {
		return this.brightness; // L: 204
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "587626375"
	)
	void method2449(int var1) {
		this.musicVolume = var1; // L: 208
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 209
	} // L: 210

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-50"
	)
	int method2402() {
		return this.musicVolume; // L: 213
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1966171619"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 217
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 218
	} // L: 219

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1960607889"
	)
	int method2385() {
		return this.soundEffectsVolume; // L: 222
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1396212893"
	)
	void method2405(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 226
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 227
	} // L: 228

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1834648228"
	)
	int method2474() {
		return this.areaSoundEffectsVolume; // L: 231
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1779588329"
	)
	void method2406(String var1) {
		this.rememberedUsername = var1; // L: 235
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 236
	} // L: 237

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "175"
	)
	String method2407() {
		return this.rememberedUsername; // L: 240
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	void method2408(int var1) {
		this.field1243 = var1; // L: 244
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 245
	} // L: 246

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2041475317"
	)
	int method2409() {
		return this.field1243; // L: 249
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-37"
	)
	void method2410(int var1) {
		this.windowMode = var1; // L: 253
		GrandExchangeOfferAgeComparator.savePreferences(); // L: 254
	} // L: 255

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1832389332"
	)
	int method2411() {
		return this.windowMode; // L: 258
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "72159241"
	)
	static void method2487() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 50

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 51
			var1.clearIsFromIgnored(); // L: 53
		}

	} // L: 56

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "32335824"
	)
	static final void method2400(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 114
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class65.addGameMessage(30, "", var1); // L: 116
	} // L: 118

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lce;II)V",
		garbageValue = "1107775722"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var11;
		if (var0.field1183 >= Client.cycle) { // L: 3857
			class125.method2968(var0);
		} else if (var0.field1136 >= Client.cycle) { // L: 3858
			class10.method108(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 3860
			if (var0.pathLength == 0) { // L: 3861
				var0.field1201 = 0; // L: 3862
			} else {
				label700: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3865
						var2 = class4.SequenceDefinition_get(var0.sequence); // L: 3866
						if (var0.field1202 > 0 && var2.field2217 == 0) { // L: 3867
							++var0.field1201; // L: 3868
							break label700; // L: 3869
						}

						if (var0.field1202 <= 0 && var2.field2218 == 0) { // L: 3871
							++var0.field1201; // L: 3872
							break label700; // L: 3873
						}
					}

					var11 = var0.x; // L: 3876
					var3 = var0.y; // L: 3877
					var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1131 * 738291136; // L: 3878
					int var5 = var0.field1131 * 738291136 + var0.pathY[var0.pathLength - 1] * 128; // L: 3879
					if (var11 < var4) { // L: 3880
						if (var3 < var5) { // L: 3881
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 3882
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 3883
						}
					} else if (var11 > var4) { // L: 3885
						if (var3 < var5) { // L: 3886
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 3887
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 3888
						}
					} else if (var3 < var5) { // L: 3890
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 3891
						var0.orientation = 0;
					}

					class193 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3892
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3893
						int var7 = var0.orientation - var0.rotation & 2047; // L: 3900
						if (var7 > 1024) { // L: 3901
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 3902
						if (var7 >= -256 && var7 <= 256) { // L: 3903
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 3904
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 3905
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 3906
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 3907
						int var9 = 4; // L: 3908
						boolean var10 = true; // L: 3909
						if (var0 instanceof NPC) { // L: 3910
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 3911
							if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1196 != 0) { // L: 3912
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 3913
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 3914
								var9 = 8;
							}

							if (var0.field1201 > 0 && var0.pathLength > 1) { // L: 3915
								var9 = 8; // L: 3916
								--var0.field1201; // L: 3917
							}
						} else {
							if (var0.pathLength > 1) { // L: 3921
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 3922
								var9 = 8;
							}

							if (var0.field1201 > 0 && var0.pathLength > 1) { // L: 3923
								var9 = 8; // L: 3924
								--var0.field1201; // L: 3925
							}
						}

						if (var6 == class193.field2247) { // L: 3928
							var9 <<= 1;
						} else if (var6 == class193.field2244) { // L: 3929
							var9 >>= 1;
						}

						if (var9 >= 8) { // L: 3930
							if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 3931
								var0.movementSequence = var0.runSequence;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1189 != -1) { // L: 3932
								var0.movementSequence = var0.field1189;
							} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1193 != -1) { // L: 3933
								var0.movementSequence = var0.field1193;
							} else if (var0.walkRightSequence == var0.movementSequence && var0.field1143 != -1) { // L: 3934
								var0.movementSequence = var0.field1143;
							}
						} else if (var9 <= 1) { // L: 3936
							if (var0.movementSequence == var0.walkSequence && var0.field1144 != -1) { // L: 3937
								var0.movementSequence = var0.field1144;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1179 != -1) { // L: 3938
								var0.movementSequence = var0.field1179;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1182 != -1) { // L: 3939
								var0.movementSequence = var0.field1182;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1171 != -1) { // L: 3940
								var0.movementSequence = var0.field1171;
							}
						}

						if (var4 != var11 || var5 != var3) { // L: 3942
							if (var11 < var4) { // L: 3943
								var0.x += var9; // L: 3944
								if (var0.x > var4) { // L: 3945
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 3947
								var0.x -= var9; // L: 3948
								if (var0.x < var4) { // L: 3949
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 3951
								var0.y += var9; // L: 3952
								if (var0.y > var5) { // L: 3953
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 3955
								var0.y -= var9; // L: 3956
								if (var0.y < var5) { // L: 3957
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 3960
							--var0.pathLength; // L: 3961
							if (var0.field1202 > 0) { // L: 3962
								--var0.field1202;
							}
						}
					} else {
						var0.x = var4; // L: 3894
						var0.y = var5; // L: 3895
						--var0.pathLength; // L: 3896
						if (var0.field1202 > 0) { // L: 3897
							--var0.field1202;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3965
			var0.sequence = -1; // L: 3966
			var0.spotAnimation = -1; // L: 3967
			var0.field1183 = 0; // L: 3968
			var0.field1136 = 0; // L: 3969
			var0.x = var0.pathX[0] * 128 + var0.field1131 * 738291136; // L: 3970
			var0.y = var0.pathY[0] * 128 + var0.field1131 * 738291136; // L: 3971
			var0.method2331(); // L: 3972
		}

		if (class67.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3974 3975
			var0.sequence = -1; // L: 3976
			var0.spotAnimation = -1; // L: 3977
			var0.field1183 = 0; // L: 3978
			var0.field1136 = 0; // L: 3979
			var0.x = var0.field1131 * 738291136 + var0.pathX[0] * 128; // L: 3980
			var0.y = var0.field1131 * 738291136 + var0.pathY[0] * 128; // L: 3981
			var0.method2331(); // L: 3982
		}

		if (var0.field1196 != 0) { // L: 3986
			if (var0.targetIndex != -1) { // L: 3987
				Object var13 = null; // L: 3988
				if (var0.targetIndex < 32768) { // L: 3989
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3990
					var13 = Client.players[var0.targetIndex - 32768];
				}

				if (var13 != null) { // L: 3991
					var3 = var0.x - ((Actor)var13).x; // L: 3992
					var4 = var0.y - ((Actor)var13).y; // L: 3993
					if (var3 != 0 || var4 != 0) { // L: 3994
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3996
					var0.targetIndex = -1; // L: 3997
					var0.false0 = false; // L: 3998
				}
			}

			if (var0.field1163 != -1 && (var0.pathLength == 0 || var0.field1201 > 0)) { // L: 4001
				var0.orientation = var0.field1163; // L: 4002
				var0.field1163 = -1; // L: 4003
			}

			var11 = var0.orientation - var0.rotation & 2047; // L: 4005
			if (var11 == 0 && var0.false0) { // L: 4006
				var0.targetIndex = -1; // L: 4007
				var0.false0 = false; // L: 4008
			}

			if (var11 != 0) { // L: 4010
				++var0.field1195; // L: 4011
				boolean var14;
				if (var11 > 1024) { // L: 4012
					var0.rotation -= var0.field1141 ? var11 : var0.field1196; // L: 4013
					var14 = true; // L: 4014
					if (var11 < var0.field1196 || var11 > 2048 - var0.field1196) { // L: 4015
						var0.rotation = var0.orientation; // L: 4016
						var14 = false; // L: 4017
					}

					if (!var0.field1141 && var0.movementSequence == var0.idleSequence && (var0.field1195 > 25 || var14)) { // L: 4019
						if (var0.turnLeftSequence != -1) { // L: 4020
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4021
						}
					}
				} else {
					var0.rotation += var0.field1141 ? var11 : var0.field1196; // L: 4025
					var14 = true; // L: 4026
					if (var11 < var0.field1196 || var11 > 2048 - var0.field1196) { // L: 4027
						var0.rotation = var0.orientation; // L: 4028
						var14 = false; // L: 4029
					}

					if (!var0.field1141 && var0.idleSequence == var0.movementSequence && (var0.field1195 > 25 || var14)) { // L: 4031
						if (var0.turnRightSequence != -1) { // L: 4032
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4033
						}
					}
				}

				var0.rotation &= 2047; // L: 4037
				var0.field1141 = false; // L: 4038
			} else {
				var0.field1195 = 0; // L: 4040
			}
		}

		var0.isWalking = false; // L: 4043
		if (var0.movementSequence != -1) { // L: 4044
			var2 = class4.SequenceDefinition_get(var0.movementSequence); // L: 4045
			if (var2 != null) { // L: 4046
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4047
					++var0.movementFrameCycle; // L: 4048
					if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) { // L: 4049
						var0.movementFrameCycle = 1; // L: 4050
						++var0.movementFrame; // L: 4051
						WorldMapLabelSize.method4684(var2, var0.movementFrame, var0.x, var0.y); // L: 4052
					}

					if (var0.movementFrame >= var2.frameIds.length) { // L: 4054
						if (var2.frameCount > 0) { // L: 4055
							var0.movementFrame -= var2.frameCount; // L: 4056
							if (var2.field2194) { // L: 4057
								++var0.field1168;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2194 && var0.field1168 >= var2.field2215) { // L: 4058
								var0.movementFrameCycle = 0; // L: 4059
								var0.movementFrame = 0; // L: 4060
								var0.field1168 = 0; // L: 4061
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4065
							var0.movementFrame = 0; // L: 4066
						}

						WorldMapLabelSize.method4684(var2, var0.movementFrame, var0.x, var0.y); // L: 4068
					}
				} else if (var2.isCachedModelIdSet()) { // L: 4071
					++var0.movementFrame; // L: 4072
					var3 = var2.method3950(); // L: 4073
					if (var0.movementFrame < var3) { // L: 4074
						Actor.method2348(var2, var0.movementFrame, var0.x, var0.y); // L: 4075
					} else {
						if (var2.frameCount > 0) { // L: 4078
							var0.movementFrame -= var2.frameCount; // L: 4079
							if (var2.field2194) { // L: 4080
								++var0.field1168;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2194 && var0.field1168 >= var2.field2215) { // L: 4081
								var0.movementFrame = 0; // L: 4082
								var0.movementFrameCycle = 0; // L: 4083
								var0.field1168 = 0; // L: 4084
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4088
							var0.movementFrame = 0; // L: 4089
						}

						Actor.method2348(var2, var0.movementFrame, var0.x, var0.y); // L: 4091
					}
				} else {
					var0.movementSequence = -1; // L: 4094
				}
			} else {
				var0.movementSequence = -1; // L: 4096
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1147) { // L: 4098
			if (var0.spotAnimationFrame < 0) { // L: 4099
				var0.spotAnimationFrame = 0;
			}

			var11 = class308.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4100
			if (var11 != -1) { // L: 4101
				SequenceDefinition var12 = class4.SequenceDefinition_get(var11); // L: 4102
				if (var12 != null && var12.frameIds != null && !var12.isCachedModelIdSet()) { // L: 4103
					++var0.spotAnimationFrameCycle; // L: 4104
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) { // L: 4105
						var0.spotAnimationFrameCycle = 1; // L: 4106
						++var0.spotAnimationFrame; // L: 4107
						WorldMapLabelSize.method4684(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4108
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) { // L: 4110 4111
						var0.spotAnimation = -1;
					}
				} else if (var12.isCachedModelIdSet()) { // L: 4114
					++var0.spotAnimationFrame; // L: 4115
					var4 = var12.method3950(); // L: 4116
					if (var0.spotAnimationFrame < var4) { // L: 4117
						Actor.method2348(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4118
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) { // L: 4121
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4124
				}
			} else {
				var0.spotAnimation = -1; // L: 4126
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4128
			var2 = class4.SequenceDefinition_get(var0.sequence); // L: 4129
			if (var2.field2217 == 1 && var0.field1202 > 0 && var0.field1183 <= Client.cycle && var0.field1136 < Client.cycle) { // L: 4130 4131
				var0.sequenceDelay = 1; // L: 4132
				return; // L: 4188
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4137
			var2 = class4.SequenceDefinition_get(var0.sequence); // L: 4138
			if (var2 == null) { // L: 4139
				var0.sequence = -1; // L: 4184
			} else if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4140
				++var0.sequenceFrameCycle; // L: 4141
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) { // L: 4142
					var0.sequenceFrameCycle = 1; // L: 4143
					++var0.sequenceFrame; // L: 4144
					WorldMapLabelSize.method4684(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4145
				}

				if (var0.sequenceFrame >= var2.frameIds.length) { // L: 4147
					var0.sequenceFrame -= var2.frameCount; // L: 4148
					++var0.field1173; // L: 4149
					if (var0.field1173 >= var2.field2215) { // L: 4150
						var0.sequence = -1; // L: 4151
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) { // L: 4153
						WorldMapLabelSize.method4684(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4157
					} else {
						var0.sequence = -1; // L: 4154
					}
				}

				var0.isWalking = var2.field2211; // L: 4160
			} else if (var2.isCachedModelIdSet()) { // L: 4162
				++var0.sequenceFrame; // L: 4163
				var3 = var2.method3950(); // L: 4164
				if (var0.sequenceFrame < var3) { // L: 4165
					Actor.method2348(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4166
				} else {
					var0.sequenceFrame -= var2.frameCount; // L: 4169
					++var0.field1173; // L: 4170
					if (var0.field1173 >= var2.field2215) { // L: 4171
						var0.sequence = -1; // L: 4172
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4174
						Actor.method2348(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4178
					} else {
						var0.sequence = -1; // L: 4175
					}
				}
			} else {
				var0.sequence = -1; // L: 4182
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4186
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "110"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4370
		ArchiveLoader.method2212(); // L: 4371
		if (Client.renderSelf) { // L: 4373
			class67.addPlayerToScene(class67.localPlayer, false); // L: 4374
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4378
			class67.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4379
		}

		AttackOption.addNpcsToScene(true); // L: 4382
		Client.method1726(); // L: 4383
		AttackOption.addNpcsToScene(false); // L: 4384

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4386 4387 4404
			if (var4.plane == Tiles.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4388
				if (Client.cycle >= var4.cycleStart) { // L: 4389
					if (var4.targetIndex > 0) { // L: 4390
						NPC var33 = Client.npcs[var4.targetIndex - 1]; // L: 4391
						if (var33 != null && var33.x >= 0 && var33.x < 13312 && var33.y >= 0 && var33.y < 13312) { // L: 4392
							var4.setDestination(var33.x, var33.y, class120.getTileHeight(var33.x, var33.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4394
						var6 = -var4.targetIndex - 1; // L: 4396
						Player var35;
						if (var6 == Client.localPlayerIndex) { // L: 4397
							var35 = class67.localPlayer;
						} else {
							var35 = Client.players[var6]; // L: 4398
						}

						if (var35 != null && var35.x >= 0 && var35.x < 13312 && var35.y >= 0 && var35.y < 13312) { // L: 4399
							var4.setDestination(var35.x, var35.y, class120.getTileHeight(var35.x, var35.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field743); // L: 4401
					MusicPatchNode.scene.drawEntity(Tiles.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4402
				}
			} else {
				var4.remove();
			}
		}

		class146.method3239(); // L: 4407
		class346.setViewportShape(var0, var1, var2, var3, true); // L: 4408
		var0 = Client.viewportOffsetX; // L: 4409
		var1 = Client.viewportOffsetY; // L: 4410
		var2 = Client.viewportWidth; // L: 4411
		var3 = Client.viewportHeight; // L: 4412
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4413
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4414
		int var30 = Client.camAngleX; // L: 4415
		if (Client.field589 / 256 > var30) { // L: 4416
			var30 = Client.field589 / 256;
		}

		if (Client.field755[4] && Client.field757[4] + 128 > var30) { // L: 4417
			var30 = Client.field757[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4418
		class307.method5929(class147.oculusOrbFocalPointX, class120.field1505, Language.oculusOrbFocalPointY, var30, var5, MusicPatchNode2.method5401(var30), var3); // L: 4419
		if (!Client.isCameraLocked) { // L: 4421
			var6 = ItemContainer.method2233();
		} else {
			var6 = class156.method3395(); // L: 4422
		}

		int var7 = TaskHandler.cameraX; // L: 4423
		int var8 = SecureRandomFuture.cameraY; // L: 4424
		int var9 = ApproximateRouteStrategy.cameraZ; // L: 4425
		int var10 = class163.cameraPitch; // L: 4426
		int var11 = class10.cameraYaw; // L: 4427

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) { // L: 4428
			if (Client.field755[var12]) { // L: 4429
				var13 = (int)(Math.random() * (double)(Client.field575[var12] * 2 + 1) - (double)Client.field575[var12] + Math.sin((double)Client.field759[var12] * ((double)Client.field758[var12] / 100.0D)) * (double)Client.field757[var12]); // L: 4430
				if (var12 == 0) { // L: 4431
					TaskHandler.cameraX += var13;
				}

				if (var12 == 1) { // L: 4432
					SecureRandomFuture.cameraY += var13;
				}

				if (var12 == 2) { // L: 4433
					ApproximateRouteStrategy.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4434
					class10.cameraYaw = var13 + class10.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4435
					class163.cameraPitch += var13; // L: 4436
					if (class163.cameraPitch < 128) { // L: 4437
						class163.cameraPitch = 128;
					}

					if (class163.cameraPitch > 383) { // L: 4438
						class163.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4442
		var13 = MouseHandler.MouseHandler_y; // L: 4443
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4444
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4445
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4446
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4448
			Canvas.method379(var12 - var0, var13 - var1); // L: 4449
		} else {
			class166.method3479(); // L: 4452
		}

		class14.playPcmPlayers(); // L: 4454
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4455
		class14.playPcmPlayers(); // L: 4456
		int var14 = Rasterizer3D.Rasterizer3D_zoom; // L: 4457
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4458
		MusicPatchNode.scene.draw(TaskHandler.cameraX, SecureRandomFuture.cameraY, ApproximateRouteStrategy.cameraZ, class163.cameraPitch, class10.cameraYaw, var6); // L: 4459
		Rasterizer3D.Rasterizer3D_zoom = var14; // L: 4460
		class14.playPcmPlayers(); // L: 4461
		MusicPatchNode.scene.clearTempGameObjects(); // L: 4462
		Client.overheadTextCount = 0; // L: 4464
		boolean var15 = false; // L: 4465
		int var16 = -1; // L: 4466
		int var17 = -1; // L: 4467
		int var18 = Players.Players_count; // L: 4468
		int[] var19 = Players.Players_indices; // L: 4469

		int var20;
		for (var20 = 0; var20 < var18 + Client.npcCount; ++var20) { // L: 4470
			Object var32;
			if (var20 < var18) { // L: 4472
				var32 = Client.players[var19[var20]]; // L: 4473
				if (var19[var20] == Client.combatTargetPlayerIndex) { // L: 4474
					var15 = true; // L: 4475
					var16 = var20; // L: 4476
					continue;
				}

				if (var32 == class67.localPlayer) { // L: 4479
					var17 = var20; // L: 4480
					continue; // L: 4481
				}
			} else {
				var32 = Client.npcs[Client.npcIndices[var20 - var18]]; // L: 4484
			}

			class19.drawActor2d((Actor)var32, var20, var0, var1, var2, var3); // L: 4485
		}

		if (Client.renderSelf && var17 != -1) { // L: 4487
			class19.drawActor2d(class67.localPlayer, var17, var0, var1, var2, var3); // L: 4488
		}

		if (var15) { // L: 4490
			class19.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var16, var0, var1, var2, var3); // L: 4491
		}

		for (var20 = 0; var20 < Client.overheadTextCount; ++var20) { // L: 4493
			int var21 = Client.overheadTextXs[var20]; // L: 4494
			int var22 = Client.overheadTextYs[var20]; // L: 4495
			int var23 = Client.overheadTextXOffsets[var20]; // L: 4496
			int var24 = Client.overheadTextAscents[var20]; // L: 4497
			boolean var25 = true; // L: 4498

			while (var25) {
				var25 = false; // L: 4500

				for (int var31 = 0; var31 < var20; ++var31) { // L: 4501
					if (var22 + 2 > Client.overheadTextYs[var31] - Client.overheadTextAscents[var31] && var22 - var24 < Client.overheadTextYs[var31] + 2 && var21 - var23 < Client.overheadTextXOffsets[var31] + Client.overheadTextXs[var31] && var23 + var21 > Client.overheadTextXs[var31] - Client.overheadTextXOffsets[var31] && Client.overheadTextYs[var31] - Client.overheadTextAscents[var31] < var22) { // L: 4502 4503
						var22 = Client.overheadTextYs[var31] - Client.overheadTextAscents[var31]; // L: 4504
						var25 = true; // L: 4505
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var20]; // L: 4510
			Client.viewportTempY = Client.overheadTextYs[var20] = var22; // L: 4511
			String var26 = Client.overheadText[var20]; // L: 4512
			if (Client.chatEffects == 0) { // L: 4513
				int var27 = 16776960; // L: 4514
				if (Client.overheadTextColors[var20] < 6) { // L: 4515
					var27 = Client.field724[Client.overheadTextColors[var20]];
				}

				if (Client.overheadTextColors[var20] == 6) { // L: 4516
					var27 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var20] == 7) { // L: 4517
					var27 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var20] == 8) { // L: 4518
					var27 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var28;
				if (Client.overheadTextColors[var20] == 9) { // L: 4519
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4520
					if (var28 < 50) { // L: 4521
						var27 = var28 * 1280 + 16711680;
					} else if (var28 < 100) { // L: 4522
						var27 = 16776960 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 4523
						var27 = (var28 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var20] == 10) { // L: 4525
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4526
					if (var28 < 50) { // L: 4527
						var27 = var28 * 5 + 16711680;
					} else if (var28 < 100) { // L: 4528
						var27 = 16711935 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 4529
						var27 = (var28 - 100) * 327680 + 255 - (var28 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var20] == 11) { // L: 4531
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4532
					if (var28 < 50) { // L: 4533
						var27 = 16777215 - var28 * 327685;
					} else if (var28 < 100) { // L: 4534
						var27 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) { // L: 4535
						var27 = 16777215 - (var28 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var20] == 0) { // L: 4537
					class29.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0);
				}

				if (Client.overheadTextEffects[var20] == 1) { // L: 4538
					class29.fontBold12.drawCenteredWave(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 2) { // L: 4539
					class29.fontBold12.drawCenteredWave2(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 3) { // L: 4540
					class29.fontBold12.drawCenteredShake(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var20]);
				}

				if (Client.overheadTextEffects[var20] == 4) { // L: 4541
					var28 = (150 - Client.overheadTextCyclesRemaining[var20]) * (class29.fontBold12.stringWidth(var26) + 100) / 150; // L: 4542
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4543
					class29.fontBold12.draw(var26, var0 + Client.viewportTempX + 50 - var28, Client.viewportTempY + var1, var27, 0); // L: 4544
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4545
				}

				if (Client.overheadTextEffects[var20] == 5) { // L: 4547
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 4548
					int var29 = 0; // L: 4549
					if (var28 < 25) { // L: 4550
						var29 = var28 - 25;
					} else if (var28 > 125) { // L: 4551
						var29 = var28 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class29.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4552
					class29.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, var29 + Client.viewportTempY + var1, var27, 0); // L: 4553
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4554
				}
			} else {
				class29.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4558
			}
		}

		if (Client.hintArrowType == 2) { // L: 4563
			class82.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - class128.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - WorldMapData_1.baseY * 64 << 7), Client.hintArrowHeight * 2); // L: 4564
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4565
				class135.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field743); // L: 4567
		Client.field617 = 0; // L: 4570
		int var34 = class128.baseX * 64 + (class67.localPlayer.x >> 7); // L: 4571
		var16 = WorldMapData_1.baseY * 64 + (class67.localPlayer.y >> 7); // L: 4572
		if (var34 >= 3053 && var34 <= 3156 && var16 >= 3056 && var16 <= 3136) { // L: 4573
			Client.field617 = 1;
		}

		if (var34 >= 3072 && var34 <= 3118 && var16 >= 9492 && var16 <= 9535) { // L: 4574
			Client.field617 = 1;
		}

		if (Client.field617 == 1 && var34 >= 3139 && var34 <= 3199 && var16 >= 3008 && var16 <= 3062) { // L: 4575
			Client.field617 = 0;
		}

		TaskHandler.cameraX = var7; // L: 4578
		SecureRandomFuture.cameraY = var8; // L: 4579
		ApproximateRouteStrategy.cameraZ = var9; // L: 4580
		class163.cameraPitch = var10; // L: 4581
		class10.cameraYaw = var11; // L: 4582
		if (Client.isLoading && TaskHandler.method3433(true, false) == 0) { // L: 4583
			Client.isLoading = false;
		}

		if (Client.isLoading) { // L: 4584
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4585
			class146.drawLoadingMessage("Loading - please wait.", false); // L: 4586
		}

	} // L: 4588
}
