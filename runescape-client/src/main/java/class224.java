import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class224 implements class29 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	Widget field2384;
	@ObfuscatedName("ap")
	boolean field2385;
	@ObfuscatedName("af")
	boolean field2386;

	public class224() {
		this.field2384 = null;
		this.field2385 = false;
		this.field2386 = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1871329380"
	)
	public boolean vmethod4418(int var1) {
		if (this.field2384 == null) {
			return false;
		} else {
			class27 var2 = this.field2384.method6724();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method398(var1)) {
					switch(var1) {
					case 81:
						this.field2386 = true;
						break;
					case 82:
						this.field2385 = true;
						break;
					default:
						if (this.method4412(var1)) {
							FaceNormal.invalidateWidget(this.field2384);
						}
					}
				}

				return var2.method412(var1);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-139541289"
	)
	public boolean vmethod4460(int var1) {
		switch(var1) {
		case 81:
			this.field2386 = false;
			return false;
		case 82:
			this.field2385 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "47"
	)
	public boolean vmethod4420(char var1) {
		if (this.field2384 == null) {
			return false;
		} else {
			boolean var2;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
				var2 = true;
			} else {
				label93: {
					if (var1 != 0) {
						char[] var3 = class400.cp1252AsciiExtension;

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
				class344 var7 = this.field2384.method6700();
				if (var7 != null && var7.method6472()) {
					class27 var6 = this.field2384.method6724();
					if (var6 == null) {
						return false;
					} else {
						if (var6.method399(var1) && var7.method6434(var1)) {
							FaceNormal.invalidateWidget(this.field2384);
						}

						return var6.method418(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1335637558"
	)
	public boolean vmethod4422(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "1"
	)
	public void method4391(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2384) {
				this.method4407();
				this.field2384 = var1;
			}

			class342 var2 = var1.method6716();
			if (var2 != null) {
				if (!var2.field3635.method6468() && var2.field3633 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2355(var1);
					var3.setArgs(var2.field3633);
					class27.method401().addFirst(var3);
				}

				var2.field3635.method6475(true);
			}
		} else {
			this.method4407();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-1734459633"
	)
	public Widget method4392() {
		return this.field2384;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1497290053"
	)
	public void method4407() {
		if (this.field2384 != null) {
			class342 var1 = this.field2384.method6716();
			Widget var2 = this.field2384;
			this.field2384 = null;
			if (var1 != null) {
				if (var1.field3635.method6468() && var1.field3633 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2355(var2);
					var3.setArgs(var1.field3633);
					class27.method401().addFirst(var3);
				}

				var1.field3635.method6475(false);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method4412(int var1) {
		if (this.field2384 == null) {
			return false;
		} else {
			class344 var2 = this.field2384.method6700();
			if (var2 != null && var2.method6472()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method4407();
					return true;
				case 48:
					if (this.field2385) {
						var2.method6440();
					}

					return true;
				case 65:
					if (this.field2385) {
						var5 = VertexNormal.client.method502();
						var2.method6459(var5);
					}

					return true;
				case 66:
					if (this.field2385) {
						var5 = VertexNormal.client.method502();
						var2.method6458(var5);
					}

					return true;
				case 67:
					if (this.field2385) {
						var5 = VertexNormal.client.method502();
						var2.method6460(var5);
					}

					return true;
				case 84:
					if (var2.method6663() == 0) {
						var2.method6434(10);
					} else if (this.field2386 && var2.method6482()) {
						var2.method6434(10);
					} else {
						class342 var3 = this.field2384.method6716();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2355(this.field2384);
						var4.setArgs(var3.field3629);
						class27.method401().addFirst(var4);
						this.method4407();
					}

					return true;
				case 85:
					if (this.field2385) {
						var2.method6618();
					} else {
						var2.method6545();
					}

					return true;
				case 96:
					if (this.field2385) {
						var2.method6615(this.field2386);
					} else {
						var2.method6653(this.field2386);
					}

					return true;
				case 97:
					if (this.field2385) {
						var2.method6575(this.field2386);
					} else {
						var2.method6447(this.field2386);
					}

					return true;
				case 98:
					if (this.field2385) {
						var2.method6558();
					} else {
						var2.method6450(this.field2386);
					}

					return true;
				case 99:
					if (this.field2385) {
						var2.method6544();
					} else {
						var2.method6451(this.field2386);
					}

					return true;
				case 101:
					if (this.field2385) {
						var2.method6438();
					} else {
						var2.method6662();
					}

					return true;
				case 102:
					if (this.field2385) {
						var2.method6444(this.field2386);
					} else {
						var2.method6682(this.field2386);
					}

					return true;
				case 103:
					if (this.field2385) {
						var2.method6523(this.field2386);
					} else {
						var2.method6443(this.field2386);
					}

					return true;
				case 104:
					if (this.field2385) {
						var2.method6454(this.field2386);
					} else {
						var2.method6526(this.field2386);
					}

					return true;
				case 105:
					if (this.field2385) {
						var2.method6455(this.field2386);
					} else {
						var2.method6599(this.field2386);
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
