import java.net.HttpURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import net.runelite.mapping.Export;
@ObfuscatedName("x")
public class class21 {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(intValue = 1741723829)
	static int field113;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 193817147)
	final int field112;

	@ObfuscatedName("h")
	final String field115;

	class21(String var1) {
		this.field112 = 400;
		this.field115 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field112 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = (this.field112 >= 300) ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);
			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			} 
			var3.close();
		}
		this.field115 = var2.toString();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "128")
	public int method295() {
		return this.field112;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1930901073")
	public String method292() {
		return this.field115;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-2076161252")
	static int method296(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "([BB)Lbz;", garbageValue = "50")
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
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapDecoration.method4914(var8) : 1);
				var1.switches[var7] = var9;
				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), ((long) (var10)));
				} 
			}
		}
		var2.offset = 0;
		var1.field952 = var2.readStringCp1252NullTerminatedOrNull();
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "2005202843")
	static int method294(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++User.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--User.Interpreter_intStackSize;
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		}
	}
}