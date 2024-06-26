import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class229 implements class29 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	Widget field2437;
	@ObfuscatedName("ad")
	boolean field2435;
	@ObfuscatedName("ag")
	boolean field2436;

	public class229() {
		this.field2437 = null;
		this.field2435 = false;
		this.field2436 = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1607404438"
	)
	public boolean vmethod4396(int var1) {
		if (this.field2437 == null) {
			return false;
		} else {
			class27 var2 = this.field2437.method6940();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method398(var1)) {
					switch(var1) {
					case 81:
						this.field2436 = true;
						break;
					case 82:
						this.field2435 = true;
						break;
					default:
						if (this.method4354(var1)) {
							TriBool.invalidateWidget(this.field2437);
						}
					}
				}

				return var2.method396(var1);
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "20"
	)
	public boolean vmethod4375(int var1) {
		switch(var1) {
		case 81:
			this.field2436 = false;
			return false;
		case 82:
			this.field2435 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-502375958"
	)
	public boolean vmethod4378(char var1) {
		if (this.field2437 == null) {
			return false;
		} else if (!class212.method4116(var1)) {
			return false;
		} else {
			class356 var2 = this.field2437.method6991();
			if (var2 != null && var2.method6640()) {
				class27 var3 = this.field2437.method6940();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method399(var1) && var2.method6601(var1)) {
						TriBool.invalidateWidget(this.field2437);
					}

					return var3.method397(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "13173"
	)
	public boolean vmethod4380(boolean var1) {
		return false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1386535715"
	)
	public void method4347(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2437) {
				this.method4349();
				this.field2437 = var1;
			}

			class354 var2 = var1.method6892();
			if (var2 != null) {
				if (!var2.field3767.method6635() && var2.field3768 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2378(var1);
					var3.setArgs(var2.field3768);
					Varps.method6447().addFirst(var3);
				}

				var2.field3767.method6763(true);
			}
		} else {
			this.method4349();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lnx;",
		garbageValue = "-124"
	)
	public Widget method4348() {
		return this.field2437;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "721760752"
	)
	public void method4349() {
		if (this.field2437 != null) {
			class354 var1 = this.field2437.method6892();
			Widget var2 = this.field2437;
			this.field2437 = null;
			if (var1 != null) {
				if (var1.field3767.method6635() && var1.field3768 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2378(var2);
					var3.setArgs(var1.field3768);
					Varps.method6447().addFirst(var3);
				}

				var1.field3767.method6763(false);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "6"
	)
	boolean method4354(int var1) {
		if (this.field2437 == null) {
			return false;
		} else {
			class356 var2 = this.field2437.method6991();
			if (var2 != null && var2.method6640()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method4349();
					return true;
				case 48:
					if (this.field2435) {
						var2.method6654();
					}

					return true;
				case 65:
					if (this.field2435) {
						var5 = class415.client.method490();
						var2.method6626(var5);
					}

					return true;
				case 66:
					if (this.field2435) {
						var5 = class415.client.method490();
						var2.method6625(var5);
					}

					return true;
				case 67:
					if (this.field2435) {
						var5 = class415.client.method490();
						var2.method6748(var5);
					}

					return true;
				case 84:
					if (var2.method6784() == 0) {
						var2.method6601(10);
					} else if (this.field2436 && var2.method6650()) {
						var2.method6601(10);
					} else {
						class354 var3 = this.field2437.method6892();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2378(this.field2437);
						var4.setArgs(var3.field3769);
						Varps.method6447().addFirst(var4);
						this.method4349();
					}

					return true;
				case 85:
					if (this.field2435) {
						var2.method6604();
					} else {
						var2.method6786();
					}

					return true;
				case 96:
					if (this.field2435) {
						var2.method6615(this.field2436);
					} else {
						var2.method6765(this.field2436);
					}

					return true;
				case 97:
					if (this.field2435) {
						var2.method6602(this.field2436);
					} else {
						var2.method6614(this.field2436);
					}

					return true;
				case 98:
					if (this.field2435) {
						var2.method6634();
					} else {
						var2.method6794(this.field2436);
					}

					return true;
				case 99:
					if (this.field2435) {
						var2.method6629();
					} else {
						var2.method6618(this.field2436);
					}

					return true;
				case 101:
					if (this.field2435) {
						var2.method6582();
					} else {
						var2.method6603();
					}

					return true;
				case 102:
					if (this.field2435) {
						var2.method6793(this.field2436);
					} else {
						var2.method6609(this.field2436);
					}

					return true;
				case 103:
					if (this.field2435) {
						var2.method6612(this.field2436);
					} else {
						var2.method6610(this.field2436);
					}

					return true;
				case 104:
					if (this.field2435) {
						var2.method6607(this.field2436);
					} else {
						var2.method6619(this.field2436);
					}

					return true;
				case 105:
					if (this.field2435) {
						var2.method6622(this.field2436);
					} else {
						var2.method6742(this.field2436);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "11316396"
	)
	static void method4371(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.field2357, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("ap")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1394811142"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
