import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class211 implements class29 {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	Widget field2305;
	@ObfuscatedName("ay")
	boolean field2303;
	@ObfuscatedName("ar")
	boolean field2308;

	public class211() {
		this.field2305 = null;
		this.field2303 = false;
		this.field2308 = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1364202239"
	)
	public boolean vmethod4143(int var1) {
		if (this.field2305 == null) {
			return false;
		} else {
			class27 var2 = this.field2305.method6463();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method396(var1)) {
					switch(var1) {
					case 81:
						this.field2308 = true;
						break;
					case 82:
						this.field2303 = true;
						break;
					default:
						if (this.method4124(var1)) {
							class200.invalidateWidget(this.field2305);
						}
					}
				}

				return var2.method393(var1);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1960624058"
	)
	public boolean vmethod4148(int var1) {
		switch(var1) {
		case 81:
			this.field2308 = false;
			return false;
		case 82:
			this.field2303 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "932068520"
	)
	public boolean vmethod4145(char var1) {
		if (this.field2305 == null) {
			return false;
		} else {
			boolean var2;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
				var2 = true;
			} else {
				label93: {
					if (var1 != 0) {
						char[] var3 = class385.cp1252AsciiExtension;

						for (int var4 = 0; var4 < var3.length; ++var4) {
							char var5 = var3[var4];
							if (var5 == var1) {
								var2 = true;
								break label93;
							}
						}
					}

					var2 = false;
				}
			}

			if (!var2) {
				return false;
			} else {
				class330 var7 = this.field2305.method6504();
				if (var7 != null && var7.method6216()) {
					class27 var6 = this.field2305.method6463();
					if (var6 == null) {
						return false;
					} else {
						if (var6.method404(var1) && var7.method6422(var1)) {
							class200.invalidateWidget(this.field2305);
						}

						return var6.method394(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-93"
	)
	public boolean vmethod4147(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)V",
		garbageValue = "-84"
	)
	public void method4126(Widget var1) {
		this.method4119();
		if (var1 != null) {
			this.field2305 = var1;
			class328 var2 = var1.method6471();
			if (var2 != null) {
				var2.field3552.method6160(true);
				if (var2.field3557 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2290(var1);
					var3.setArgs(var2.field3557);
					ClientPacket.method5722().addFirst(var3);
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Lmt;",
		garbageValue = "-52"
	)
	public Widget method4118() {
		return this.field2305;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2127531849"
	)
	public void method4119() {
		if (this.field2305 != null) {
			class328 var1 = this.field2305.method6471();
			Widget var2 = this.field2305;
			this.field2305 = null;
			if (var1 != null) {
				var1.field3552.method6160(false);
				if (var1.field3557 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2290(var2);
					var3.setArgs(var1.field3557);
					ClientPacket.method5722().addFirst(var3);
				}

			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "7161"
	)
	boolean method4124(int var1) {
		if (this.field2305 == null) {
			return false;
		} else {
			class330 var2 = this.field2305.method6504();
			if (var2 != null && var2.method6216()) {
				switch(var1) {
				case 13:
					this.method4119();
					return true;
				case 48:
					if (this.field2303) {
						var2.method6234();
					}

					return true;
				case 65:
					if (this.field2303) {
						var2.method6202(ClanChannelMember.method3153());
					}

					return true;
				case 66:
					if (this.field2303) {
						var2.method6201(ClanChannelMember.method3153());
					}

					return true;
				case 67:
					if (this.field2303) {
						var2.method6203(ClanChannelMember.method3153());
					}

					return true;
				case 84:
					if (var2.method6204() == 0) {
						var2.method6422(10);
					} else if (this.field2308 && var2.method6226()) {
						var2.method6422(10);
					} else {
						class328 var3 = this.field2305.method6471();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2290(this.field2305);
						var4.setArgs(var3.field3554);
						ClientPacket.method5722().addFirst(var4);
						this.method4119();
					}

					return true;
				case 85:
					if (this.field2303) {
						var2.method6180();
					} else {
						var2.method6235();
					}

					return true;
				case 96:
					if (this.field2303) {
						var2.method6191(this.field2308);
					} else {
						var2.method6189(this.field2308);
					}

					return true;
				case 97:
					if (this.field2303) {
						var2.method6192(this.field2308);
					} else {
						var2.method6190(this.field2308);
					}

					return true;
				case 98:
					if (this.field2303) {
						var2.method6230();
					} else {
						var2.method6358(this.field2308);
					}

					return true;
				case 99:
					if (this.field2303) {
						var2.method6185();
					} else {
						var2.method6194(this.field2308);
					}

					return true;
				case 101:
					if (this.field2303) {
						var2.method6181();
					} else {
						var2.method6179();
					}

					return true;
				case 102:
					if (this.field2303) {
						var2.method6187(this.field2308);
					} else {
						var2.method6321(this.field2308);
					}

					return true;
				case 103:
					if (this.field2303) {
						var2.method6317(this.field2308);
					} else {
						var2.method6186(this.field2308);
					}

					return true;
				case 104:
					if (this.field2303) {
						var2.method6353(this.field2308);
					} else {
						var2.method6195(this.field2308);
					}

					return true;
				case 105:
					if (this.field2303) {
						var2.method6198(this.field2308);
					} else {
						var2.method6158(this.field2308);
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
}
