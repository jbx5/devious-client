import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.StringWriter;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.PrintWriter;
import net.runelite.mapping.Export;
@ObfuscatedName("cu")
@Implements("Players")
public class Players {
	@ObfuscatedName("f")
	static byte[] field1293 = new byte[2048];

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "[Lgl;")
	static class192[] field1294 = new class192[2048];

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lqw;")
	static Buffer[] field1295 = new Buffer[2048];

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -568075581)
	@Export("Players_count")
	static int Players_count = 0;

	@ObfuscatedName("z")
	@Export("Players_indices")
	static int[] Players_indices = new int[2048];

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1632866083)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount = 0;

	@ObfuscatedName("h")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices = new int[2048];

	@ObfuscatedName("a")
	@Export("Players_regions")
	static int[] Players_regions = new int[2048];

	@ObfuscatedName("d")
	@Export("Players_orientations")
	static int[] Players_orientations = new int[2048];

	@ObfuscatedName("n")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices = new int[2048];

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 999900845)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount = 0;

	@ObfuscatedName("g")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices = new int[2048];

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lqw;")
	static Buffer field1300 = new Buffer(new byte[5000]);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", garbageValue = "-2131774965")
	static String method2497(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = ((RunException) (var0));
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}
		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();
		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}
				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}
					var7 = var7.substring(0, var8);
				}
				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			} 
		} 
	}
}