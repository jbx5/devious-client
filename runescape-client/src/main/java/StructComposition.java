import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("gy")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("se")
	@ObfuscatedSignature(descriptor = "Lai;")
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("params")
	IterableNodeHashTable params;

	StructComposition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2130102042")
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "-113")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "2032540634")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class125.readStringIntParameters(var1, this.params);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "120")
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = ((IntegerNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}
		return var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "-1448444586")
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Messages.method2575(this.params, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1092242815")
	public static void method3597(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}
				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-537607707")
	static final int method3599(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 'ﾀ') + var1;
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V", garbageValue = "52")
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		ViewportMouse.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
	}
}