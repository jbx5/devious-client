import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.net.Socket;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ej")
public class class131 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = -1512748666488385143L)
	long field1582;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 713864739)
	int field1584;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llk;")
	IterableNodeDeque field1585;

	@ObfuscatedSignature(descriptor = "(Lqt;)V")
	public class131(Buffer var1) {
		this.field1584 = -1;
		this.field1585 = new IterableNodeDeque();
		this.method2868(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "840156873")
	void method2868(Buffer var1) {
		this.field1582 = var1.readLong();
		this.field1584 = var1.readInt();
		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class150(this);
			} else if (var2 == 1) {
				var3 = new class126(this);
			} else if (var2 == 13) {
				var3 = new class143(this);
			} else if (var2 == 4) {
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this);
			} else if (var2 == 2) {
				var3 = new class132(this);
			} else if (var2 == 7) {
				var3 = new class125(this);
			} else if (var2 == 14) {
				var3 = new class129(this);
			} else if (var2 == 8) {
				var3 = new class146(this);
			} else if (var2 == 9) {
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this);
			} else if (var2 == 11) {
				var3 = new class133(this);
			} else if (var2 == 12) {
				var3 = new class137(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}
				var3 = new class147(this);
			}
			((class128) (var3)).vmethod3150(var1);
			this.field1585.addFirst(((Node) (var3)));
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1292823548")
	public void method2869(ClanSettings var1) {
		if (var1.field1627 == this.field1582 && this.field1584 == var1.field1628) {
			for (class128 var2 = ((class128) (this.field1585.last())); var2 != null; var2 = ((class128) (this.field1585.previous()))) {
				var2.vmethod3149(var1);
			}
			++var1.field1628;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/net/Socket;IIB)Lnl;", garbageValue = "-16")
	public static AbstractSocket method2878(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IIIZIZI)V", garbageValue = "906922492")
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class362.World_worlds[var6];
			class362.World_worlds[var6] = class362.World_worlds[var1];
			class362.World_worlds[var1] = var8;
			for (int var9 = var0; var9 < var1; ++var9) {
				if (MusicPatchPcmStream.method5445(class362.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class362.World_worlds[var9];
					class362.World_worlds[var9] = class362.World_worlds[var7];
					class362.World_worlds[var7++] = var10;
				}
			}
			class362.World_worlds[var1] = class362.World_worlds[var7];
			class362.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-70")
	static int method2875(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class446.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			EnumComposition var10 = UserComparator7.getEnum(var3);
			if (var10.outputType != 's') {
			}
			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}
			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}
			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				EnumComposition var4 = UserComparator7.getEnum(var3);
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class446.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
			EnumComposition var7 = UserComparator7.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}
						var7 = null;
						break;
					}
				}
				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}
				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			}
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "117")
	static final void method2877() {
		if (Client.logoutTimer > 0) {
			MouseRecorder.logOut();
		} else {
			Client.timer.method6510();
			HealthBarUpdate.updateGameState(40);
			Message.field461 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}