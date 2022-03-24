import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("do")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;I)I", garbageValue = 
	"-1157970116")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(I)Lfq;", garbageValue = 
	"-2066827638")

	public static Clock method2592() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-966652469")

	static int method2595(int var0, Script var1, boolean var2) {
		if ((((((((var0 != 7000) && (var0 != 7005)) && (var0 != 7010)) && (var0 != 7015)) && (var0 != 7020)) && (var0 != 7025)) && (var0 != 7030)) && (var0 != 7035)) {
			if ((((((var0 != 7001) && (var0 != 7002)) && (var0 != 7011)) && (var0 != 7012)) && (var0 != 7021)) && (var0 != 7022)) {
				if (((var0 != 7003) && (var0 != 7013)) && (var0 != 7023)) {
					if ((((((var0 != 7006) && (var0 != 7007)) && (var0 != 7016)) && (var0 != 7017)) && (var0 != 7026)) && (var0 != 7027)) {
						if (((var0 != 7008) && (var0 != 7018)) && (var0 != 7028)) {
							if ((var0 != 7031) && (var0 != 7032)) {
								if (var0 == 7033) {
									--ChatChannel.Interpreter_stringStackSize;
									return 1;
								} else if ((var0 != 7036) && (var0 != 7037)) {
									if (var0 == 7038) {
										--class295.Interpreter_intStackSize;
										return 1;
									} else if ((((((((var0 != 7004) && (var0 != 7009)) && (var0 != 7014)) && (var0 != 7019)) && (var0 != 7024)) && (var0 != 7029)) && (var0 != 7034)) && (var0 != 7039)) {
										return 2;
									} else {
										--class295.Interpreter_intStackSize;
										return 1;
									}
								} else {
									class295.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--ChatChannel.Interpreter_stringStackSize;
								--class295.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--class295.Interpreter_intStackSize;
							return 1;
						}
					} else {
						class295.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					class295.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				class295.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			class295.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}