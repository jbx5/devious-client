import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class267 implements class29 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	Widget field2974;
	@ObfuscatedName("aw")
	boolean field2973;
	@ObfuscatedName("ak")
	boolean field2975;

	public class267() {
		this.field2974 = null;
		this.field2973 = false;
		this.field2975 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	public boolean vmethod5644(int var1) {
		if (this.field2974 == null) {
			return false;
		} else {
			class27 var2 = this.field2974.method7326();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method427(var1)) {
					switch(var1) {
					case 81:
						this.field2975 = true;
						break;
					case 82:
						this.field2973 = true;
						break;
					default:
						if (this.method5622(var1)) {
							class110.invalidateWidget(this.field2974);
						}
					}
				}

				return var2.method397(var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "19"
	)
	public boolean vmethod5668(int var1) {
		switch(var1) {
		case 81:
			this.field2975 = false;
			return false;
		case 82:
			this.field2973 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-243955335"
	)
	public boolean vmethod5646(char var1) {
		if (this.field2974 == null) {
			return false;
		} else if (!Skills.method7515(var1)) {
			return false;
		} else {
			class359 var2 = this.field2974.method7304();
			if (var2 != null && var2.method7065()) {
				class27 var3 = this.field2974.method7326();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method399(var1) && var2.method7138(var1)) {
						class110.invalidateWidget(this.field2974);
					}

					return var3.method394(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-22"
	)
	public boolean vmethod5681(boolean var1) {
		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "1584226227"
	)
	public void method5615(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2974) {
				this.method5617();
				this.field2974 = var1;
			}

			class357 var2 = var1.method7287();
			if (var2 != null) {
				if (!var2.field3815.method7060() && var2.field3812 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2565(var1);
					var3.setArgs(var2.field3812);
					Archive.method7599().addFirst(var3);
				}

				var2.field3815.method7215(true);
			}
		} else {
			this.method5617();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lng;",
		garbageValue = "864749224"
	)
	public Widget method5630() {
		return this.field2974;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1391474320"
	)
	public void method5617() {
		if (this.field2974 != null) {
			class357 var1 = this.field2974.method7287();
			Widget var2 = this.field2974;
			this.field2974 = null;
			if (var1 != null) {
				if (var1.field3815.method7060() && var1.field3812 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2565(var2);
					var3.setArgs(var1.field3812);
					Archive.method7599().addFirst(var3);
				}

				var1.field3815.method7215(false);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-114"
	)
	boolean method5622(int var1) {
		if (this.field2974 == null) {
			return false;
		} else {
			class359 var2 = this.field2974.method7304();
			if (var2 != null && var2.method7065()) {
				switch(var1) {
				case 13:
					this.method5617();
					return true;
				case 48:
					if (this.field2973) {
						var2.method7033();
					}

					return true;
				case 65:
					if (this.field2973) {
						var2.method7051(class328.method6534());
					}

					return true;
				case 66:
					if (this.field2973) {
						var2.method7156(class328.method6534());
					}

					return true;
				case 67:
					if (this.field2973) {
						var2.method7052(class328.method6534());
					}

					return true;
				case 84:
					if (var2.method7071() == 0) {
						var2.method7138(10);
					} else if (this.field2975 && var2.method7075()) {
						var2.method7138(10);
					} else {
						class357 var3 = this.field2974.method7287();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2565(this.field2974);
						var4.setArgs(var3.field3814);
						Archive.method7599().addFirst(var4);
						this.method5617();
					}

					return true;
				case 85:
					if (this.field2973) {
						var2.method7196();
					} else {
						var2.method7028();
					}

					return true;
				case 96:
					if (this.field2973) {
						var2.method7041(this.field2975);
					} else {
						var2.method7039(this.field2975);
					}

					return true;
				case 97:
					if (this.field2973) {
						var2.method7042(this.field2975);
					} else {
						var2.method7083(this.field2975);
					}

					return true;
				case 98:
					if (this.field2973) {
						var2.method7053();
					} else {
						var2.method7043(this.field2975);
					}

					return true;
				case 99:
					if (this.field2973) {
						var2.method7223();
					} else {
						var2.method7128(this.field2975);
					}

					return true;
				case 101:
					if (this.field2973) {
						var2.method7031();
					} else {
						var2.method7163();
					}

					return true;
				case 102:
					if (this.field2973) {
						var2.method7008(this.field2975);
					} else {
						var2.method7035(this.field2975);
					}

					return true;
				case 103:
					if (this.field2973) {
						var2.method7224(this.field2975);
					} else {
						var2.method7020(this.field2975);
					}

					return true;
				case 104:
					if (this.field2973) {
						var2.method7047(this.field2975);
					} else {
						var2.method7151(this.field2975);
					}

					return true;
				case 105:
					if (this.field2973) {
						var2.method7048(this.field2975);
					} else {
						var2.method7046(this.field2975);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfv;FFFFFFFFB)V",
		garbageValue = "54"
	)
	static void method5642(class137 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if (0.0F != var9) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1597 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
				float var13 = var12[0];
				float var14 = var12[1];
				if (var12[0] < 0.0F) {
					var12[0] = 0.0F;
				}

				if (var12[1] > 1.0F) {
					var12[1] = 1.0F;
				}

				if (var12[0] > 1.0F || var12[1] < -1.0F) {
					IntProjection.method4900(var12);
				}

				if (var12[0] != var13) {
					var2 = var9 * var12[0] + var1;
					if (0.0F != var13) {
						var6 = var5 + var12[0] * (var6 - var5) / var13;
					}
				}

				if (var14 != var12[1]) {
					float var10000 = var1 + var12[1] * var9;
					if (1.0F != var14) {
						var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
					}
				}

				var0.field1598 = var1;
				var0.field1611 = var4;
				float var15 = var12[0];
				float var16 = var12[1];
				float var17 = var15 - 0.0F;
				float var18 = var16 - var15;
				float var19 = 1.0F - var16;
				float var20 = var18 - var17;
				var0.field1603 = var19 - var18 - var20;
				var0.field1592 = var20 + var20 + var20;
				var0.field1601 = var17 + var17 + var17;
				var0.field1600 = 0.0F;
				UserComparator10.method3328(var5, var6, var7, var8, var0);
			}
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1345405045"
	)
	static String method5641(String var0) {
		PlayerType[] var1 = WorldMapEvent.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(Tiles.method2519(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
