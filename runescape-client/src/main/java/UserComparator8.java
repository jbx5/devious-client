



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(descriptor = 
	"[Lqx;")

	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;I)I", garbageValue = 
	"155176144")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lpy;I)V", garbageValue = 
	"-1723249342")

	static final void method2575(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1288[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1288;
					var10000[var5] = ((byte) (var10000[var5] | 2));
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = NPCComposition.method3491(var0);
						var10000 = Players.field1288;
						var10000[var5] = ((byte) (var10000[var5] | 2));
					} else {
						WorldMapLabelSize.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1288[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1288;
						var10000[var5] = ((byte) (var10000[var5] | 2));
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = NPCComposition.method3491(var0);
							var10000 = Players.field1288;
							var10000[var5] = ((byte) (var10000[var5] | 2));
						} else {
							WorldMapLabelSize.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1288[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1288;
							var10000[var5] = ((byte) (var10000[var5] | 2));
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = NPCComposition.method3491(var0);
								var10000 = Players.field1288;
								var10000[var5] = ((byte) (var10000[var5] | 2));
							} else if (class9.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1288;
								var10000[var5] = ((byte) (var10000[var5] | 2));
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1288[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1288;
								var10000[var5] = ((byte) (var10000[var5] | 2));
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = NPCComposition.method3491(var0);
									var10000 = Players.field1288;
									var10000[var5] = ((byte) (var10000[var5] | 2));
								} else if (class9.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1288;
									var10000[var5] = ((byte) (var10000[var5] | 2));
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1288;
							var10000[var2] = ((byte) (var10000[var2] >> 1));
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[(++Players.Players_count) - 1] = var2;
							} else {
								Players.Players_emptyIndices[(++Players.Players_emptyIdxCount) - 1] = var2;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"572992012")

	static int method2569(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = class67.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = class67.ItemDefinition_get(var3);
				if (((var4 >= 1) && (var4 <= 5)) && (var5.groundActions[var4 - 1] != null)) {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var5 = class67.ItemDefinition_get(var3);
				if (((var4 >= 1) && (var4 <= 5)) && (var5.inventoryActions[var4 - 1] != null)) {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class67.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class67.ItemDefinition_get(var3).isStackable == 1) ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var7 = class67.ItemDefinition_get(var3);
					if ((var7.noteTemplate == (-1)) && (var7.note >= 0)) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var7 = class67.ItemDefinition_get(var3);
					if ((var7.noteTemplate >= 0) && (var7.note >= 0)) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class67.ItemDefinition_get(var3).isMembersOnly) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var7 = class67.ItemDefinition_get(var3);
					if ((var7.placeholderTemplate == (-1)) && (var7.placeholder >= 0)) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var7 = class67.ItemDefinition_get(var3);
					if ((var7.placeholderTemplate >= 0) && (var7.placeholder >= 0)) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					class13.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = PendingSpawn.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						MouseRecorder.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = class67.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == (-1)) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if ((class14.foundItemIds != null) && (MouseRecorder.foundItemIndex < PendingSpawn.foundItemIdCount)) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class14.foundItemIds[(++MouseRecorder.foundItemIndex) - 1] & '￿';
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1574231542")

	static void method2576(int var0, int var1) {
		ScriptFrame.method1083(PacketWriter.tempMenuAction, var0, var1);
		PacketWriter.tempMenuAction = null;
	}
}