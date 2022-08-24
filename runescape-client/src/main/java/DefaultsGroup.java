import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("nm")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lnm;")
	static final DefaultsGroup field4365 = new DefaultsGroup(3);

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -645648235)
	@Export("group")
	final int group;

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "-136151233")
	public static int method6839(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}
		return var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lls;III)[Lqe;", garbageValue = "-1768448338")
	public static IndexedSprite[] method6840(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class457.SpriteBuffer_spriteCount];
			for (int var5 = 0; var5 < class457.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class457.SpriteBuffer_spriteWidth;
				var6.height = class457.SpriteBuffer_spriteHeight;
				var6.xOffset = class457.SpriteBuffer_xOffsets[var5];
				var6.yOffset = InterfaceParent.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class457.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = SoundCache.SpriteBuffer_spriteHeights[var5];
				var6.palette = class457.SpriteBuffer_spritePalette;
				var6.pixels = class181.SpriteBuffer_pixels[var5];
			}
			class457.SpriteBuffer_xOffsets = null;
			InterfaceParent.SpriteBuffer_yOffsets = null;
			class457.SpriteBuffer_spriteWidths = null;
			SoundCache.SpriteBuffer_spriteHeights = null;
			class457.SpriteBuffer_spritePalette = null;
			class181.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(ILbz;ZB)I", garbageValue = "-97")
	static int method6838(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AttackOption.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = AttackOption.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = AttackOption.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (AttackOption.ItemDefinition_get(var3).isStackable == 1) ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (AttackOption.ItemDefinition_get(var3).isMembersOnly) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3;
					}
					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					class138.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ScriptEvent.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class286.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = AttackOption.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4 + 1;
						}
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class271.foundItemIds != null && class286.foundItemIndex < ScriptEvent.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class271.foundItemIds[++class286.foundItemIndex - 1] & '￿';
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
					}
					return 1;
				}
			}
		}
	}
}