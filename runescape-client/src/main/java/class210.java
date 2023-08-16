import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class210 implements class29 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	Widget field2346;
	@ObfuscatedName("ae")
	boolean field2345;
	@ObfuscatedName("ao")
	boolean field2347;

	public class210() {
		this.field2346 = null;
		this.field2345 = false;
		this.field2347 = false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1089015731"
	)
	public boolean vmethod4117(int var1) {
		if (this.field2346 == null) {
			return false;
		} else {
			class27 var2 = this.field2346.method6401();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method420(var1)) {
					switch(var1) {
					case 81:
						this.field2347 = true;
						break;
					case 82:
						this.field2345 = true;
						break;
					default:
						if (this.method4081(var1)) {
							class218.invalidateWidget(this.field2346);
						}
					}
				}

				return var2.method385(var1);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1292750960"
	)
	public boolean vmethod4139(int var1) {
		switch(var1) {
		case 81:
			this.field2347 = false;
			return false;
		case 82:
			this.field2345 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-352714805"
	)
	public boolean vmethod4106(char var1) {
		if (this.field2346 == null) {
			return false;
		} else {
			boolean var2;
			if ((var1 < ' ' || var1 >= 127) && (var1 <= 127 || var1 >= 160) && (var1 <= 160 || var1 > 255)) {
				label90: {
					if (var1 != 0) {
						char[] var3 = class384.cp1252AsciiExtension;

						for (int var4 = 0; var4 < var3.length; ++var4) {
							char var5 = var3[var4];
							if (var5 == var1) {
								var2 = true;
								break label90;
							}
						}
					}

					var2 = false;
				}
			} else {
				var2 = true;
			}

			if (!var2) {
				return false;
			} else {
				class329 var7 = this.field2346.method6532();
				if (var7 != null && var7.method6162()) {
					class27 var6 = this.field2346.method6401();
					if (var6 == null) {
						return false;
					} else {
						if (var6.method388(var1) && var7.method6199(var1)) {
							class218.invalidateWidget(this.field2346);
						}

						return var6.method391(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1559971994"
	)
	public boolean vmethod4132(boolean var1) {
		return false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "753644002"
	)
	public void method4093(Widget var1) {
		this.method4092();
		if (var1 != null) {
			this.field2346 = var1;
			class327 var2 = var1.method6418();
			if (var2 != null) {
				var2.field3563.method6106(true);
				if (var2.field3564 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2283(var1);
					var3.setArgs(var2.field3564);
					class30.method446().addFirst(var3);
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lmi;",
		garbageValue = "-869248693"
	)
	public Widget method4075() {
		return this.field2346;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method4092() {
		if (this.field2346 != null) {
			class327 var1 = this.field2346.method6418();
			Widget var2 = this.field2346;
			this.field2346 = null;
			if (var1 != null) {
				var1.field3563.method6106(false);
				if (var1.field3564 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2283(var2);
					var3.setArgs(var1.field3564);
					class30.method446().addFirst(var3);
				}

			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-53"
	)
	boolean method4081(int var1) {
		if (this.field2346 == null) {
			return false;
		} else {
			class329 var2 = this.field2346.method6532();
			if (var2 != null && var2.method6162()) {
				switch(var1) {
				case 13:
					this.method4092();
					return true;
				case 48:
					if (this.field2345) {
						var2.method6370();
					}

					return true;
				case 65:
					if (this.field2345) {
						var2.method6108(GrandExchangeOfferTotalQuantityComparator.method6834());
					}

					return true;
				case 66:
					if (this.field2345) {
						var2.method6147(GrandExchangeOfferTotalQuantityComparator.method6834());
					}

					return true;
				case 67:
					if (this.field2345) {
						var2.method6149(GrandExchangeOfferTotalQuantityComparator.method6834());
					}

					return true;
				case 84:
					if (var2.method6168() == 0) {
						var2.method6199(10);
					} else if (this.field2347 && var2.method6243()) {
						var2.method6199(10);
					} else {
						class327 var3 = this.field2346.method6418();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2283(this.field2346);
						var4.setArgs(var3.field3560);
						class30.method446().addFirst(var4);
						this.method4092();
					}

					return true;
				case 85:
					if (this.field2345) {
						var2.method6126();
					} else {
						var2.method6124();
					}

					return true;
				case 96:
					if (this.field2345) {
						var2.method6137(this.field2347);
					} else {
						var2.method6304(this.field2347);
					}

					return true;
				case 97:
					if (this.field2345) {
						var2.method6138(this.field2347);
					} else {
						var2.method6136(this.field2347);
					}

					return true;
				case 98:
					if (this.field2345) {
						var2.method6308();
					} else {
						var2.method6139(this.field2347);
					}

					return true;
				case 99:
					if (this.field2345) {
						var2.method6151();
					} else {
						var2.method6140(this.field2347);
					}

					return true;
				case 101:
					if (this.field2345) {
						var2.method6156();
					} else {
						var2.method6125();
					}

					return true;
				case 102:
					if (this.field2345) {
						var2.method6133(this.field2347);
					} else {
						var2.method6131(this.field2347);
					}

					return true;
				case 103:
					if (this.field2345) {
						var2.method6134(this.field2347);
					} else {
						var2.method6132(this.field2347);
					}

					return true;
				case 104:
					if (this.field2345) {
						var2.method6280(this.field2347);
					} else {
						var2.method6141(this.field2347);
					}

					return true;
				case 105:
					if (this.field2345) {
						var2.method6278(this.field2347);
					} else {
						var2.method6127(this.field2347);
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

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIILui;Lme;I)V",
		garbageValue = "-1872465528"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method9518(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
