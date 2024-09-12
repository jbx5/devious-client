import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pp")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("ae")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("ag")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("am")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("ax")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("aq")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ac")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lvf;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZB)V",
		garbageValue = "1"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1783838310"
	)
	static int method7649(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class465.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3 + ClanSettings.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					long var14 = 86400000L * (11745L + (long)var11);
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class465.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = HttpRequestTask.method282(class36.compareStrings(Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1], LoginScreenAnimation.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							class320.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
							var12 = BuddyRankComparator.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							class320.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
							var12 = BuddyRankComparator.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class465.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = SoundSystem.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = LoginPacket.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class356.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = HealthBarUpdate.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							class320.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class465.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class465.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 2];
							if (AddRequestTask.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(AddRequestTask.localPlayer.appearance.field3794) {
								case 0:
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = AddRequestTask.localPlayer.appearance != null ? AddRequestTask.localPlayer.appearance.field3794 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class465.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
					if (AddRequestTask.localPlayer.appearance != null && AddRequestTask.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
