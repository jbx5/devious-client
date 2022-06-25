import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kp")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1630376351)
	@Export("width")
	public final int width;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 890911275)
	@Export("height")
	public final int height;

	@ObfuscatedName("q")
	@Export("xWidths")
	public final int[] xWidths;

	@ObfuscatedName("f")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1395546386")
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)[I", garbageValue = "117")
	public static int[] method5523() {
		int[] var0 = new int[KeyHandler.field144];
		for (int var1 = 0; var1 < KeyHandler.field144; ++var1) {
			var0[var1] = KeyHandler.field134[var1];
		}
		return var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-1051989669")
	static int method5524(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--Interpreter.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--class446.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--class446.Interpreter_intStackSize;
										return 1;
									}
								} else {
									class446.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--Interpreter.Interpreter_stringStackSize;
								--class446.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--class446.Interpreter_intStackSize;
							return 1;
						}
					} else {
						class446.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					class446.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				class446.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			class446.Interpreter_intStackSize -= 5;
			return 1;
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1187838679")
	static void method5522() {
		PacketBufferNode var0 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(class9.getWindowedMode());
		var0.packetBuffer.writeShort(Script.canvasWidth);
		var0.packetBuffer.writeShort(class78.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}