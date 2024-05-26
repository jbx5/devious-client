import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sm")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2003525899
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	AbstractSocket() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "581185594"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4373"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "502953664"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "2"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1364608830"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1036201039"
	)
	public static int method8788(int var0) {
		return class495.field5020[var0 & 16383];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-2007553994"
	)
	static final boolean method8801(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label72:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label72;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = HitSplatDefinition.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field699;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "6"
	)
	static int method8808(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.method6931() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return InvDefinition.method3791(var3);
		} else {
			return var0 == 1709 ? class329.method6253(var3) : 2;
		}
	}
}
