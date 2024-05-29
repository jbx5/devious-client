import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class228 implements class29 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	Widget field2455;
	@ObfuscatedName("al")
	boolean field2452;
	@ObfuscatedName("aj")
	boolean field2451;

	public class228() {
		this.field2455 = null;
		this.field2452 = false;
		this.field2451 = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1374510228"
	)
	public boolean vmethod4410(int var1) {
		if (this.field2455 == null) {
			return false;
		} else {
			class27 var2 = this.field2455.method7041();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method387(var1)) {
					switch(var1) {
					case 81:
						this.field2451 = true;
						break;
					case 82:
						this.field2452 = true;
						break;
					default:
						if (this.method4380(var1)) {
							class324.invalidateWidget(this.field2455);
						}
					}
				}

				return var2.method385(var1);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2020665722"
	)
	public boolean vmethod4411(int var1) {
		switch(var1) {
		case 81:
			this.field2451 = false;
			return false;
		case 82:
			this.field2452 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1931852798"
	)
	public boolean vmethod4412(char var1) {
		if (this.field2455 == null) {
			return false;
		} else if (!DbTableType.method9548(var1)) {
			return false;
		} else {
			class355 var2 = this.field2455.method6942();
			if (var2 != null && var2.method6673()) {
				class27 var3 = this.field2455.method7041();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method388(var1) && var2.method6634(var1)) {
						class324.invalidateWidget(this.field2455);
					}

					return var3.method383(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "25450"
	)
	public boolean vmethod4414(boolean var1) {
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "1740017710"
	)
	public void method4377(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2455) {
				this.method4379();
				this.field2455 = var1;
			}

			class353 var2 = var1.method6945();
			if (var2 != null) {
				if (!var2.field3751.method6793() && var2.field3753 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2327(var1);
					var3.setArgs(var2.field3753);
					class47.method887().addFirst(var3);
				}

				var2.field3751.method6617(true);
			}
		} else {
			this.method4379();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lnb;",
		garbageValue = "7"
	)
	public Widget method4378() {
		return this.field2455;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-694149925"
	)
	public void method4379() {
		if (this.field2455 != null) {
			class353 var1 = this.field2455.method6945();
			Widget var2 = this.field2455;
			this.field2455 = null;
			if (var1 != null) {
				if (var1.field3751.method6793() && var1.field3753 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2327(var2);
					var3.setArgs(var1.field3753);
					class47.method887().addFirst(var3);
				}

				var1.field3751.method6617(false);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "12"
	)
	boolean method4380(int var1) {
		if (this.field2455 == null) {
			return false;
		} else {
			class355 var2 = this.field2455.method6942();
			if (var2 != null && var2.method6673()) {
				switch(var1) {
				case 13:
					this.method4379();
					return true;
				case 48:
					if (this.field2452) {
						var2.method6796();
					}

					return true;
				case 65:
					if (this.field2452) {
						var2.method6684(PlayerCompositionColorTextureOverride.method3778());
					}

					return true;
				case 66:
					if (this.field2452) {
						var2.method6658(PlayerCompositionColorTextureOverride.method3778());
					}

					return true;
				case 67:
					if (this.field2452) {
						var2.method6660(PlayerCompositionColorTextureOverride.method3778());
					}

					return true;
				case 84:
					if (var2.method6679() == 0) {
						var2.method6634(10);
					} else if (this.field2451 && var2.method6683()) {
						var2.method6634(10);
					} else {
						class353 var3 = this.field2455.method6945();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2327(this.field2455);
						var4.setArgs(var3.field3752);
						class47.method887().addFirst(var4);
						this.method4379();
					}

					return true;
				case 85:
					if (this.field2452) {
						var2.method6774();
					} else {
						var2.method6635();
					}

					return true;
				case 96:
					if (this.field2452) {
						var2.method6648(this.field2451);
					} else {
						var2.method6646(this.field2451);
					}

					return true;
				case 97:
					if (this.field2452) {
						var2.method6649(this.field2451);
					} else {
						var2.method6624(this.field2451);
					}

					return true;
				case 98:
					if (this.field2452) {
						var2.method6661();
					} else {
						var2.method6810(this.field2451);
					}

					return true;
				case 99:
					if (this.field2452) {
						var2.method6662();
					} else {
						var2.method6651(this.field2451);
					}

					return true;
				case 101:
					if (this.field2452) {
						var2.method6698();
					} else {
						var2.method6636();
					}

					return true;
				case 102:
					if (this.field2452) {
						var2.method6644(this.field2451);
					} else {
						var2.method6704(this.field2451);
					}

					return true;
				case 103:
					if (this.field2452) {
						var2.method6645(this.field2451);
					} else {
						var2.method6682(this.field2451);
					}

					return true;
				case 104:
					if (this.field2452) {
						var2.method6831(this.field2451);
					} else {
						var2.method6652(this.field2451);
					}

					return true;
				case 105:
					if (this.field2452) {
						var2.method6655(this.field2451);
					} else {
						var2.method6653(this.field2451);
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

	@ObfuscatedName("ab")
	static int method4382(long var0) {
		return (int)(var0 >>> 49 & 2047L);
	}
}
