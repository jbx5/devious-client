import java.awt.datatransfer.Clipboard;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class224 implements class29 {
	@ObfuscatedName("ik")
	static SecureRandom field2363;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	Widget field2364;
	@ObfuscatedName("al")
	boolean field2360;
	@ObfuscatedName("ak")
	boolean field2362;

	public class224() {
		this.field2364 = null;
		this.field2360 = false;
		this.field2362 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1448724719"
	)
	public boolean vmethod4264(int var1) {
		if (this.field2364 == null) {
			return false;
		} else {
			class27 var2 = this.field2364.method6591();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method387(var1)) {
					switch(var1) {
					case 81:
						this.field2362 = true;
						break;
					case 82:
						this.field2360 = true;
						break;
					default:
						if (this.method4222(var1)) {
							ClanChannelMember.invalidateWidget(this.field2364);
						}
					}
				}

				return var2.method376(var1);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-974805318"
	)
	public boolean vmethod4251(int var1) {
		switch(var1) {
		case 81:
			this.field2362 = false;
			return false;
		case 82:
			this.field2360 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "19"
	)
	public boolean vmethod4275(char var1) {
		if (this.field2364 == null) {
			return false;
		} else {
			boolean var2;
			if ((var1 < ' ' || var1 >= 127) && (var1 <= 127 || var1 >= 160) && (var1 <= 160 || var1 > 255)) {
				label89: {
					if (var1 != 0) {
						char[] var3 = class399.cp1252AsciiExtension;

						for (int var4 = 0; var4 < var3.length; ++var4) {
							char var5 = var3[var4];
							if (var5 == var1) {
								var2 = true;
								break label89;
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
				class344 var7 = this.field2364.method6614();
				if (var7 != null && var7.method6360()) {
					class27 var6 = this.field2364.method6591();
					if (var6 == null) {
						return false;
					} else {
						if (var6.method379(var1) && var7.method6333(var1)) {
							ClanChannelMember.invalidateWidget(this.field2364);
						}

						return var6.method377(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-672025946"
	)
	public boolean vmethod4254(boolean var1) {
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-782706277"
	)
	public void method4216(Widget var1) {
		this.method4232();
		if (var1 != null) {
			this.field2364 = var1;
			class342 var2 = var1.method6617();
			if (var2 != null) {
				var2.field3606.method6304(true);
				if (var2.field3608 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2317(var1);
					var3.setArgs(var2.field3608);
					class7.method58().addFirst(var3);
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lnm;",
		garbageValue = "-68"
	)
	public Widget method4217() {
		return this.field2364;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	public void method4232() {
		if (this.field2364 != null) {
			class342 var1 = this.field2364.method6617();
			Widget var2 = this.field2364;
			this.field2364 = null;
			if (var1 != null) {
				var1.field3606.method6304(false);
				if (var1.field3608 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2317(var2);
					var3.setArgs(var1.field3608);
					class7.method58().addFirst(var3);
				}

			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "104826143"
	)
	boolean method4222(int var1) {
		if (this.field2364 == null) {
			return false;
		} else {
			class344 var2 = this.field2364.method6614();
			if (var2 != null && var2.method6360()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method4232();
					return true;
				case 48:
					if (this.field2360) {
						var2.method6327();
					}

					return true;
				case 65:
					if (this.field2360) {
						var5 = class159.client.method485();
						var2.method6454(var5);
					}

					return true;
				case 66:
					if (this.field2360) {
						var5 = class159.client.method485();
						var2.method6345(var5);
					}

					return true;
				case 67:
					if (this.field2360) {
						var5 = class159.client.method485();
						var2.method6508(var5);
					}

					return true;
				case 84:
					if (var2.method6302() == 0) {
						var2.method6333(10);
					} else if (this.field2362 && var2.method6370()) {
						var2.method6333(10);
					} else {
						class342 var3 = this.field2364.method6617();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2317(this.field2364);
						var4.setArgs(var3.field3610);
						class7.method58().addFirst(var4);
						this.method4232();
					}

					return true;
				case 85:
					if (this.field2360) {
						var2.method6479();
					} else {
						var2.method6322();
					}

					return true;
				case 96:
					if (this.field2360) {
						var2.method6335(this.field2362);
					} else {
						var2.method6453(this.field2362);
					}

					return true;
				case 97:
					if (this.field2360) {
						var2.method6336(this.field2362);
					} else {
						var2.method6334(this.field2362);
					}

					return true;
				case 98:
					if (this.field2360) {
						var2.method6411();
					} else {
						var2.method6337(this.field2362);
					}

					return true;
				case 99:
					if (this.field2360) {
						var2.method6320();
					} else {
						var2.method6338(this.field2362);
					}

					return true;
				case 101:
					if (this.field2360) {
						var2.method6563();
					} else {
						var2.method6495();
					}

					return true;
				case 102:
					if (this.field2360) {
						var2.method6331(this.field2362);
					} else {
						var2.method6481(this.field2362);
					}

					return true;
				case 103:
					if (this.field2360) {
						var2.method6332(this.field2362);
					} else {
						var2.method6330(this.field2362);
					}

					return true;
				case 104:
					if (this.field2360) {
						var2.method6341(this.field2362);
					} else {
						var2.method6339(this.field2362);
					}

					return true;
				case 105:
					if (this.field2360) {
						var2.method6342(this.field2362);
					} else {
						var2.method6340(this.field2362);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BI)Lds;",
		garbageValue = "-1039632832"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? EnumComposition.method3749(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1004 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "120"
	)
	static int method4247(int var0, Script var1, boolean var2) {
		return 2;
	}
}
