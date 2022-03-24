import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class21 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1307123935)

	static int field108;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-300178005)

	final int field103;
	@ObfuscatedName("o")
	final String field104;

	class21(String var1) {
		this.field103 = 400;
		this.field104 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field103 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = (this.field103 >= 300) ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			} 

			var3.close();
		}

		this.field104 = var2.toString();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"545491845")

	public int method328() {
		return this.field103;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"-31")

	public String method330() {
		return this.field104;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1896526262")

	@Export("incrementMenuEntries")
	static final void incrementMenuEntries() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < (Client.menuOptionsCount - 1); ++var1) {
				if ((Client.menuOpcodes[var1] < 1000) && (Client.menuOpcodes[var1 + 1] > 1000)) {
					String var2 = Client.menuTargets[var1];
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
					Client.menuTargets[var1 + 1] = var2;
					String var3 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var3;
					int var4 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
					Client.menuOpcodes[var1 + 1] = var4;
					var4 = Client.menuArguments1[var1];
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
					Client.menuArguments1[var1 + 1] = var4;
					var4 = Client.menuArguments2[var1];
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
					Client.menuArguments2[var1 + 1] = var4;
					var4 = Client.menuIdentifiers[var1];
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
					Client.menuIdentifiers[var1 + 1] = var4;
					boolean var5 = Client.menuShiftClick[var1];
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					Client.menuShiftClick[var1 + 1] = var5;
					var0 = false;
				}
			}
		} 

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"1")

	static final void method334(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Interpreter.clientPreferences.method2270(var0);
	}
}