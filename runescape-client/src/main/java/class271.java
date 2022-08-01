import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("js")
public class class271 {
	@ObfuscatedName("o")
	static int[] field3179;

	static {
		new Object();
		field3179 = new int[33];
		field3179[0] = 0;
		int var0 = 2;
		for (int var1 = 1; var1 < 33; ++var1) {
			field3179[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1698477365")
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}
			VarbitComposition.VarbitDefinition_cached.put(var2, ((long) (var0)));
			var1 = var2;
		}
		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([Llm;II)Llm;", garbageValue = "1310333735")
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIS)I", garbageValue = "12830")
	public static int method5244(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-1878258428")
	static int method5246(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--TaskHandler.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--TaskHandler.Interpreter_intStackSize;
										return 1;
									}
								} else {
									TaskHandler.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
								--TaskHandler.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--TaskHandler.Interpreter_intStackSize;
							return 1;
						}
					} else {
						TaskHandler.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					TaskHandler.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				TaskHandler.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}