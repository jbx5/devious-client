import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ic")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-773989151"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1881267204"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1202559377"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1873696311"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Sound.method4074(this.params, var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1598806128"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1466896003"
	)
	static int method4035(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1954977689"
	)
	public static int method4042(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public static void method4041() {
		synchronized(ArchiveDiskActionHandler.field4365) {
			if (ArchiveDiskActionHandler.field4360 != 0) {
				ArchiveDiskActionHandler.field4360 = 1;
				ArchiveDiskActionHandler.field4358 = true;

				try {
					ArchiveDiskActionHandler.field4365.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "-20558"
	)
	static int method4031(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = HttpRequest.ItemDefinition_get(var3).name;
			return 1;
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = HttpRequest.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = HttpRequest.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					var4 = HttpRequest.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					var4 = HttpRequest.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					var4 = HttpRequest.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					var4 = HttpRequest.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
					var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					ArchiveDiskActionHandler.findItemDefinitions(var7, var6 == 1);
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = ReflectionCheck.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						MusicSong.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var6 = HttpRequest.ItemDefinition_get(var3).getShiftClickIndex();
						if (var6 == -1) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6;
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var6 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HttpRequest.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var4 = HttpRequest.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.field2325;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = HttpRequest.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class59.foundItemIds != null && MusicSong.foundItemIndex < ReflectionCheck.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class59.foundItemIds[++MusicSong.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
