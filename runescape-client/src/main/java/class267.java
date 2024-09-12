import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class267 implements class29 {
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -2112521381
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	Widget field2965;
	@ObfuscatedName("ae")
	boolean field2962;
	@ObfuscatedName("ag")
	boolean field2963;

	public class267() {
		this.field2965 = null;
		this.field2962 = false;
		this.field2963 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2101251211"
	)
	public boolean vmethod5567(int var1) {
		if (this.field2965 == null) {
			return false;
		} else {
			class27 var2 = this.field2965.method7270();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method385(var1)) {
					switch(var1) {
					case 81:
						this.field2963 = true;
						break;
					case 82:
						this.field2962 = true;
						break;
					default:
						if (this.method5538(var1)) {
							SecureRandomCallable.invalidateWidget(this.field2965);
						}
					}
				}

				return var2.method383(var1);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-101296173"
	)
	public boolean vmethod5568(int var1) {
		switch(var1) {
		case 81:
			this.field2963 = false;
			return false;
		case 82:
			this.field2962 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-893504177"
	)
	public boolean vmethod5569(char var1) {
		if (this.field2965 == null) {
			return false;
		} else if (!Actor.method2687(var1)) {
			return false;
		} else {
			class360 var2 = this.field2965.method7268();
			if (var2 != null && var2.method7009()) {
				class27 var3 = this.field2965.method7270();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method404(var1) && var2.method6970(var1)) {
						SecureRandomCallable.invalidateWidget(this.field2965);
					}

					return var3.method386(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1165234574"
	)
	public boolean vmethod5588(boolean var1) {
		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "1775715103"
	)
	public void method5539(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2965) {
				this.method5545();
				this.field2965 = var1;
			}

			class358 var2 = var1.method7271();
			if (var2 != null) {
				if (!var2.field3785.method7004() && var2.field3787 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2511(var1);
					var3.setArgs(var2.field3787);
					class195.method4014().addFirst(var3);
				}

				var2.field3785.method6953(true);
			}
		} else {
			this.method5545();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lny;",
		garbageValue = "25"
	)
	public Widget method5542() {
		return this.field2965;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1908121980"
	)
	public void method5545() {
		if (this.field2965 != null) {
			class358 var1 = this.field2965.method7271();
			Widget var2 = this.field2965;
			this.field2965 = null;
			if (var1 != null) {
				if (var1.field3785.method7004() && var1.field3787 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2511(var2);
					var3.setArgs(var1.field3787);
					class195.method4014().addFirst(var3);
				}

				var1.field3785.method6953(false);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1783172270"
	)
	boolean method5538(int var1) {
		if (this.field2965 == null) {
			return false;
		} else {
			class360 var2 = this.field2965.method7268();
			if (var2 != null && var2.method7009()) {
				switch(var1) {
				case 13:
					this.method5545();
					return true;
				case 48:
					if (this.field2962) {
						var2.method7068();
					}

					return true;
				case 65:
					if (this.field2962) {
						var2.method7022(LoginScreenAnimation.method2730());
					}

					return true;
				case 66:
					if (this.field2962) {
						var2.method6994(LoginScreenAnimation.method2730());
					}

					return true;
				case 67:
					if (this.field2962) {
						var2.method6996(LoginScreenAnimation.method2730());
					}

					return true;
				case 84:
					if (var2.method7015() == 0) {
						var2.method6970(10);
					} else if (this.field2963 && var2.method7019()) {
						var2.method6970(10);
					} else {
						class358 var3 = this.field2965.method7271();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2511(this.field2965);
						var4.setArgs(var3.field3788);
						class195.method4014().addFirst(var4);
						this.method5545();
					}

					return true;
				case 85:
					if (this.field2962) {
						var2.method6973();
					} else {
						var2.method6971();
					}

					return true;
				case 96:
					if (this.field2962) {
						var2.method6984(this.field2963);
					} else {
						var2.method6982(this.field2963);
					}

					return true;
				case 97:
					if (this.field2962) {
						var2.method6985(this.field2963);
					} else {
						var2.method7170(this.field2963);
					}

					return true;
				case 98:
					if (this.field2962) {
						var2.method6997();
					} else {
						var2.method7175(this.field2963);
					}

					return true;
				case 99:
					if (this.field2962) {
						var2.method6998();
					} else {
						var2.method7033(this.field2963);
					}

					return true;
				case 101:
					if (this.field2962) {
						var2.method7183();
					} else {
						var2.method7081();
					}

					return true;
				case 102:
					if (this.field2962) {
						var2.method7119(this.field2963);
					} else {
						var2.method6978(this.field2963);
					}

					return true;
				case 103:
					if (this.field2962) {
						var2.method6981(this.field2963);
					} else {
						var2.method6979(this.field2963);
					}

					return true;
				case 104:
					if (this.field2962) {
						var2.method6959(this.field2963);
					} else {
						var2.method6988(this.field2963);
					}

					return true;
				case 105:
					if (this.field2962) {
						var2.method6991(this.field2963);
					} else {
						var2.method6989(this.field2963);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2040669873"
	)
	static void method5564(int var0) {
		class425.field4717 = var0;
		class425.field4721 = new class425[var0];
		class425.field4718 = 0;
	}
}
