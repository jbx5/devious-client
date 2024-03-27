import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class226 implements class29 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	Widget field2418;
	@ObfuscatedName("ah")
	boolean field2416;
	@ObfuscatedName("af")
	boolean field2417;

	public class226() {
		this.field2418 = null;
		this.field2416 = false;
		this.field2417 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "743662152"
	)
	public boolean vmethod4317(int var1) {
		if (this.field2418 == null) {
			return false;
		} else {
			class27 var2 = this.field2418.method6682();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method368(var1)) {
					switch(var1) {
					case 81:
						this.field2417 = true;
						break;
					case 82:
						this.field2416 = true;
						break;
					default:
						if (this.method4291(var1)) {
							WorldMapData_0.invalidateWidget(this.field2418);
						}
					}
				}

				return var2.method366(var1);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-99"
	)
	public boolean vmethod4312(int var1) {
		switch(var1) {
		case 81:
			this.field2417 = false;
			return false;
		case 82:
			this.field2416 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1370736452"
	)
	public boolean vmethod4324(char var1) {
		if (this.field2418 == null) {
			return false;
		} else if (!HealthBar.method2576(var1)) {
			return false;
		} else {
			class347 var2 = this.field2418.method6667();
			if (var2 != null && var2.method6513()) {
				class27 var3 = this.field2418.method6682();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method365(var1) && var2.method6404(var1)) {
						WorldMapData_0.invalidateWidget(this.field2418);
					}

					return var3.method367(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-10"
	)
	public boolean vmethod4339(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-697987739"
	)
	public void method4278(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2418) {
				this.method4282();
				this.field2418 = var1;
			}

			class345 var2 = var1.method6683();
			if (var2 != null) {
				if (!var2.field3674.method6459() && var2.field3675 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2305(var1);
					var3.setArgs(var2.field3675);
					class131.method3048().addFirst(var3);
				}

				var2.field3674.method6486(true);
			}
		} else {
			this.method4282();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lnt;",
		garbageValue = "-5"
	)
	public Widget method4279() {
		return this.field2418;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1023376258"
	)
	public void method4282() {
		if (this.field2418 != null) {
			class345 var1 = this.field2418.method6683();
			Widget var2 = this.field2418;
			this.field2418 = null;
			if (var1 != null) {
				if (var1.field3674.method6459() && var1.field3675 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2305(var2);
					var3.setArgs(var1.field3675);
					class131.method3048().addFirst(var3);
				}

				var1.field3674.method6486(false);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1455473962"
	)
	boolean method4291(int var1) {
		if (this.field2418 == null) {
			return false;
		} else {
			class347 var2 = this.field2418.method6667();
			if (var2 != null && var2.method6513()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method4282();
					return true;
				case 48:
					if (this.field2416) {
						var2.method6387();
					}

					return true;
				case 65:
					if (this.field2416) {
						var5 = UrlRequest.client.method464();
						var2.method6420(var5);
					}

					return true;
				case 66:
					if (this.field2416) {
						var5 = UrlRequest.client.method464();
						var2.method6405(var5);
					}

					return true;
				case 67:
					if (this.field2416) {
						var5 = UrlRequest.client.method464();
						var2.method6518(var5);
					}

					return true;
				case 84:
					if (var2.method6574() == 0) {
						var2.method6404(10);
					} else if (this.field2417 && var2.method6430()) {
						var2.method6404(10);
					} else {
						class345 var3 = this.field2418.method6683();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2305(this.field2418);
						var4.setArgs(var3.field3677);
						class131.method3048().addFirst(var4);
						this.method4282();
					}

					return true;
				case 85:
					if (this.field2416) {
						var2.method6384();
					} else {
						var2.method6382();
					}

					return true;
				case 96:
					if (this.field2416) {
						var2.method6558(this.field2417);
					} else {
						var2.method6393(this.field2417);
					}

					return true;
				case 97:
					if (this.field2416) {
						var2.method6396(this.field2417);
					} else {
						var2.method6487(this.field2417);
					}

					return true;
				case 98:
					if (this.field2416) {
						var2.method6591();
					} else {
						var2.method6415(this.field2417);
					}

					return true;
				case 99:
					if (this.field2416) {
						var2.method6401();
					} else {
						var2.method6398(this.field2417);
					}

					return true;
				case 101:
					if (this.field2416) {
						var2.method6385();
					} else {
						var2.method6383();
					}

					return true;
				case 102:
					if (this.field2416) {
						var2.method6391(this.field2417);
					} else {
						var2.method6389(this.field2417);
					}

					return true;
				case 103:
					if (this.field2416) {
						var2.method6502(this.field2417);
					} else {
						var2.method6419(this.field2417);
					}

					return true;
				case 104:
					if (this.field2416) {
						var2.method6444(this.field2417);
					} else {
						var2.method6399(this.field2417);
					}

					return true;
				case 105:
					if (this.field2416) {
						var2.method6402(this.field2417);
					} else {
						var2.method6400(this.field2417);
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "41"
	)
	public static final boolean method4307(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lot;",
		garbageValue = "0"
	)
	public static GameBuild method4306(int var0) {
		GameBuild[] var1 = FaceNormal.method4885();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}
}
