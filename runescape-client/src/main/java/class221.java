import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class221 implements class29 {
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -93724707
	)
	static int field2343;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	Widget field2340;
	@ObfuscatedName("ah")
	boolean field2341;
	@ObfuscatedName("ar")
	boolean field2342;

	public class221() {
		this.field2340 = null;
		this.field2341 = false;
		this.field2342 = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "512"
	)
	public boolean vmethod4310(int var1) {
		if (this.field2340 == null) {
			return false;
		} else {
			class27 var2 = this.field2340.method6690();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method422(var1)) {
					switch(var1) {
					case 81:
						this.field2342 = true;
						break;
					case 82:
						this.field2341 = true;
						break;
					default:
						if (this.method4285(var1)) {
							class159.invalidateWidget(this.field2340);
						}
					}
				}

				return var2.method409(var1);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1146773117"
	)
	public boolean vmethod4320(int var1) {
		switch(var1) {
		case 81:
			this.field2342 = false;
			return false;
		case 82:
			this.field2341 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "984376689"
	)
	public boolean vmethod4321(char var1) {
		if (this.field2340 == null) {
			return false;
		} else if (!DirectByteArrayCopier.method6830(var1)) {
			return false;
		} else {
			class341 var2 = this.field2340.method6688();
			if (var2 != null && var2.method6394()) {
				class27 var3 = this.field2340.method6690();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method412(var1) && var2.method6378(var1)) {
						class159.invalidateWidget(this.field2340);
					}

					return var3.method410(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-49"
	)
	public boolean vmethod4312(boolean var1) {
		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "950407656"
	)
	public void method4279(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2340) {
				this.method4281();
				this.field2340 = var1;
			}

			class339 var2 = var1.method6767();
			if (var2 != null) {
				if (!var2.field3593.method6640() && var2.field3592 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2357(var1);
					var3.setArgs(var2.field3592);
					FileSystem.method4225().addFirst(var3);
				}

				var2.field3593.method6361(true);
			}
		} else {
			this.method4281();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)Lnn;",
		garbageValue = "-15065"
	)
	public Widget method4303() {
		return this.field2340;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-881991302"
	)
	public void method4281() {
		if (this.field2340 != null) {
			class339 var1 = this.field2340.method6767();
			Widget var2 = this.field2340;
			this.field2340 = null;
			if (var1 != null) {
				if (var1.field3593.method6640() && var1.field3592 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2357(var2);
					var3.setArgs(var1.field3592);
					FileSystem.method4225().addFirst(var3);
				}

				var1.field3593.method6361(false);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	boolean method4285(int var1) {
		if (this.field2340 == null) {
			return false;
		} else {
			class341 var2 = this.field2340.method6688();
			if (var2 != null && var2.method6394()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method4281();
					return true;
				case 48:
					if (this.field2341) {
						var2.method6434();
					}

					return true;
				case 65:
					if (this.field2341) {
						var5 = SpriteMask.client.method498();
						var2.method6403(var5);
					}

					return true;
				case 66:
					if (this.field2341) {
						var5 = SpriteMask.client.method498();
						var2.method6402(var5);
					}

					return true;
				case 67:
					if (this.field2341) {
						var5 = SpriteMask.client.method498();
						var2.method6546(var5);
					}

					return true;
				case 84:
					if (var2.method6423() == 0) {
						var2.method6378(10);
					} else if (this.field2342 && var2.method6426()) {
						var2.method6378(10);
					} else {
						class339 var3 = this.field2340.method6767();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2357(this.field2340);
						var4.setArgs(var3.field3595);
						FileSystem.method4225().addFirst(var4);
						this.method4281();
					}

					return true;
				case 85:
					if (this.field2341) {
						var2.method6428();
					} else {
						var2.method6368();
					}

					return true;
				case 96:
					if (this.field2341) {
						var2.method6392(this.field2342);
					} else {
						var2.method6390(this.field2342);
					}

					return true;
				case 97:
					if (this.field2341) {
						var2.method6393(this.field2342);
					} else {
						var2.method6391(this.field2342);
					}

					return true;
				case 98:
					if (this.field2341) {
						var2.method6405();
					} else {
						var2.method6602(this.field2342);
					}

					return true;
				case 99:
					if (this.field2341) {
						var2.method6406();
					} else {
						var2.method6395(this.field2342);
					}

					return true;
				case 101:
					if (this.field2341) {
						var2.method6382();
					} else {
						var2.method6380();
					}

					return true;
				case 102:
					if (this.field2341) {
						var2.method6565(this.field2342);
					} else {
						var2.method6440(this.field2342);
					}

					return true;
				case 103:
					if (this.field2341) {
						var2.method6389(this.field2342);
					} else {
						var2.method6387(this.field2342);
					}

					return true;
				case 104:
					if (this.field2341) {
						var2.method6596(this.field2342);
					} else {
						var2.method6396(this.field2342);
					}

					return true;
				case 105:
					if (this.field2341) {
						var2.method6506(this.field2342);
					} else {
						var2.method6397(this.field2342);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Laa;",
		garbageValue = "-14"
	)
	public static class6[] method4305() {
		return new class6[]{class6.field16};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V",
		garbageValue = "-620397215"
	)
	static final void method4304(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1366[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1366;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = Client.method1394(var0);
						var10000 = Players.field1366;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class9.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1366[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1366;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = Client.method1394(var0);
							var10000 = Players.field1366;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class9.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1366[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1366;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = Client.method1394(var0);
								var10000 = Players.field1366;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (Buddy.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1366;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1366[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1366;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = Client.method1394(var0);
									var10000 = Players.field1366;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (Buddy.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1366;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1366;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}
}
